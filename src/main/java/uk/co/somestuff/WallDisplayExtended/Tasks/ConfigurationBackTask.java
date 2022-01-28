package uk.co.somestuff.WallDisplayExtended.Tasks;

import uk.co.somestuff.WallDisplayExtended.Main;
import uk.co.somestuff.WallDisplayExtended.QueueItem;
import uk.co.somestuff.dave.walldisplaycontroller._22_01_2022.Configuration;
import uk.co.somestuff.dave.walldisplaycontroller._22_01_2022.TokenHeader;
import uk.co.somestuff.dave.walldisplaycontroller._22_01_2022.WallDisplayController1;
import uk.co.somestuff.dave.walldisplaycontroller._22_01_2022.WallDisplayController1Soap;

import java.util.List;
import java.util.prefs.Preferences;

public class ConfigurationBackTask extends QueueItem {

    @Override
    public void execute() {
        WallDisplayController1 soap = new WallDisplayController1();
        WallDisplayController1Soap soapService = soap.getWallDisplayController1Soap();

        Configuration configuration = soapService.getConfiguration(Main.tokenHeader);
        Preferences prefs = Preferences.userNodeForPackage(uk.co.somestuff.WallDisplayExtended.Tasks.WeatherForeTask.class);

        if (!prefs.get("bbcWeatherGeoId", "").equals(configuration.getWeather().getGeoCode())) {
            System.out.println("[ConfigurationBackTask] Setting weather geocode to '" + configuration.getWeather().getGeoCode() + "'");
            prefs.put("bbcWeatherGeoId", configuration.getWeather().getGeoCode());
        }

    }

    @Override
    public void onRemoval(List<QueueItem> queue) {
        super.onRemoval(queue);
        queue.add(this);
    }
}
