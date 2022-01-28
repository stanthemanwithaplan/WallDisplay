package uk.co.somestuff.BBC.Weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherBroker {
    private List<Forecast> forecasts;
    private Location location;

    public WeatherBroker() {}

    public Location getLocation() {
        return this.location;
    }

    public List<Forecast> getForecasts() {
        return this.forecasts;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }
}
