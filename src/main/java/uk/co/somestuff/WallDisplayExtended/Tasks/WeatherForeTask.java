package uk.co.somestuff.WallDisplayExtended.Tasks;

import com.fasterxml.jackson.databind.ObjectMapper;
import uk.co.somestuff.BBC.Weather.DetailedReport;
import uk.co.somestuff.BBC.Weather.WeatherBroker;
import uk.co.somestuff.WallDisplayExtended.Main;
import uk.co.somestuff.WallDisplayExtended.QueueItem;
import uk.co.somestuff.util.WebRequestException;
import uk.co.somestuff.util.WebRequests;

import java.io.IOException;
import java.util.List;
import java.util.prefs.Preferences;

import static uk.co.somestuff.WallDisplay.Driver.Font.LCD_FONT;

public class WeatherForeTask extends QueueItem {

    // WHATDOES: Foreground Task for displaying the weather forecast periodically

    private String bbcWeatherGeoId;

    private String formattedWeatherReport = "A weather report is currently unavailable.";

    private ObjectMapper mapper = new ObjectMapper();
    private WeatherBroker weatherBroker = null;

    public WeatherForeTask() {
        this.name = "WeatherTask";
    }

    @Override
    public void preExecution() {
        super.preExecution();

        // WHATDOES: Loads the bbc weather location stuff to send off to the api to retrieve the weather for the right location
        Preferences prefs = Preferences.userNodeForPackage(uk.co.somestuff.WallDisplayExtended.Tasks.WeatherForeTask.class);
        bbcWeatherGeoId = prefs.get("bbcWeatherGeoId", "2649169");

        // WHATDOES: Takes the location code and gets the weather for that location

        try {
            String response = WebRequests.GET("https://weather-broker-cdn.api.bbci.co.uk/en/mobile/" + bbcWeatherGeoId, null, null);
            weatherBroker = mapper.readValue(response, WeatherBroker.class);
        } catch (WebRequestException | IOException e) {
            e.printStackTrace();
        }

        if (weatherBroker == null) {
            System.out.println("[WeatherForeTask] WeatherBroker Failed");
        } else {
            System.out.println("[WeatherForeTask] Retrieved weather for '" + weatherBroker.getLocation().getName() + "' '" + weatherBroker.getLocation().getGeoId() + "'");
        }

    }

    @Override
    public void execute() {
        if (weatherBroker == null) {
            formattedWeatherReport = "A weather report is currently unavailable.";
        } else {
            DetailedReport report = weatherBroker.getForecasts().get(0).getDetailed().getReports().get(0);
            formattedWeatherReport = "The weather for " +
                    weatherBroker.getLocation().getName() + " at " +
                    report.getTimeslot() + ", " +
                    report.getEnhancedWeatherDescription() + " with a temperature of " +
                    report.getTemperatureC() + "°C";

            if (report.getTemperatureC() != report.getFeelsLikeTemperatureC()) {
                formattedWeatherReport += " but it feels like " +
                        report.getFeelsLikeTemperatureC() +
                        "°C.";
            } else {
                formattedWeatherReport +=
                        ".";
            }
        }

        System.out.println("[WeatherForeTask] Displaying '" + formattedWeatherReport + "'");

        Main.matrix.scrollUp(formattedWeatherReport, LCD_FONT, 0, 40);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Main.matrix.carrouselText(formattedWeatherReport, LCD_FONT, 40);
    }

    @Override
    public void onRemoval(List<QueueItem> queue) {
        super.onRemoval(queue);
        queue.add(this);
    }
}
