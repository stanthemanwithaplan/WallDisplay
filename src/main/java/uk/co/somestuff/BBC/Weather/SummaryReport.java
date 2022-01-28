package uk.co.somestuff.BBC.Weather;

public class SummaryReport {
    private String enhancedWeatherDescription;
    private int extendedWeatherType;
    private int gustSpeedKph;
    private int gustSpeedMph;
    private String localDate;
    private int lowermaxTemperatureC;
    private int lowermaxTemperatureF;
    private int lowerminTemperatureC;
    private int lowerminTemperatureF;
    private int maxTempC;
    private int maxTempF;
    private int minTempC;
    private int minTempF;
    private int mostLikelyHighTemperatureC;
    private int mostLikelyHighTemperatureF;
    private int mostLikelyLowTemperatureC;
    private int mostLikelyLowTemperatureF;
    private int pollenIndex;
    private int pollenIndexBand;
    private String pollenIndexIconText;
    private String pollenIndexText;
    private int pollutionIndex;
    private String pollutionIndexBand;
    private String pollutionIndexIconText;
    private String pollutionIndexText;
    private int precipitationProbabilityInPercent;
    private String precipitationProbabilityText;
    private String sunrise;
    private String sunset;
    private int uppermaxTemperatureC;
    private int uppermaxTemperatureF;
    private int upperminTemperatureC;
    private int upperminTemperatureF;
    private int uvIndex;
    private String uvIndexBand;
    private String uvIndexIconText;
    private String uvIndexText;
    private int weatherType;
    private String weatherTypeText;
    private String windDescription;
    private String windDirection;
    private String windDirectionAbbreviation;
    private String windDirectionFull;
    private int windSpeedKph;
    private int windSpeedMph;

    public SummaryReport() {}

    public String getEnhancedWeatherDescription() {
        return this.enhancedWeatherDescription;
    }

    public int getExtendedWeatherType() {
        return this.extendedWeatherType;
    }

    public int getGustSpeedKph() {
        return this.gustSpeedKph;
    }

    public int getGustSpeedMph() {
        return this.gustSpeedMph;
    }

    public String getLocalDate() {
        return this.localDate;
    }

    public int getPrecipitationProbabilityInPercent() {
        return this.precipitationProbabilityInPercent;
    }

    public String getPrecipitationProbabilityText() {
        return this.precipitationProbabilityText;
    }

    public int getWeatherType() {
        return this.weatherType;
    }

    public String getWeatherTypeText() {
        return this.weatherTypeText;
    }

    public String getWindDescription() {
        return this.windDescription;
    }

    public String getWindDirection() {
        return this.windDirection;
    }

    public String getWindDirectionAbbreviation() {
        return this.windDirectionAbbreviation;
    }

    public String getWindDirectionFull() {
        return this.windDirectionFull;
    }

    public int getWindSpeedKph() {
        return this.windSpeedKph;
    }

    public int getWindSpeedMph() {
        return this.windSpeedMph;
    }

    public int getLowermaxTemperatureC() { return this.lowermaxTemperatureC; }

    public int getLowermaxTemperatureF() { return this.lowermaxTemperatureF; }

    public int getLowerminTemperatureC() { return this.lowerminTemperatureC; }

    public int getLowerminTemperatureF() { return this.lowerminTemperatureF; }

    public int getMaxTempC() { return this.maxTempC; }

    public int getMaxTempF() { return this.maxTempF; }

    public int getMinTempC() { return this.minTempC; }

    public int getMinTempF() { return this.minTempF; }

    public int getMostLikelyHighTemperatureC() { return this.mostLikelyHighTemperatureC; }

    public int getMostLikelyHighTemperatureF() { return this.mostLikelyHighTemperatureF; }

    public int getMostLikelyLowTemperatureC() { return this.mostLikelyLowTemperatureC; }

    public int getMostLikelyLowTemperatureF() { return this.mostLikelyLowTemperatureF; }

    public int getPollenIndex() { return this.pollenIndex; }

    public int getPollenIndexBand() { return this.pollenIndexBand; }

    public String getPollenIndexIconText() { return this.pollenIndexIconText; }

    public String getPollenIndexText() { return this.pollenIndexText; }

    public int getPollutionIndex() { return this.pollutionIndex; }

    public String getPollutionIndexBand() { return this.pollutionIndexBand; }

    public String getPollutionIndexIconText() { return this.pollutionIndexIconText; }

    public String getPollutionIndexText() { return this.pollutionIndexText; }

    public String getSunrise() { return this.sunrise; }

    public String getSunset() { return this.sunset; }

    public int getUppermaxTemperatureC() { return this.uppermaxTemperatureC; }

    public int getUppermaxTemperatureF() { return this.uppermaxTemperatureF; }

    public int getUpperminTemperatureC() { return this.upperminTemperatureC; }

    public int getUpperminTemperatureF() { return this.upperminTemperatureF; }

    public int getUvIndex() { return this.uvIndex; }

    public String getUvIndexBand() { return this.uvIndexBand; }

    public String getUvIndexIconText() { return this.uvIndexIconText; }

    public String getUvIndexText() { return this.uvIndexText; }

    public void setEnhancedWeatherDescription(String enhancedWeatherDescription) {
        this.enhancedWeatherDescription = enhancedWeatherDescription;
    }

    public void setExtendedWeatherType(int extendedWeatherType) {
        this.extendedWeatherType = extendedWeatherType;
    }

    public void setGustSpeedKph(int gustSpeedKph) {
        this.gustSpeedKph = gustSpeedKph;
    }

    public void setGustSpeedMph(int gustSpeedMph) {
        this.gustSpeedMph = gustSpeedMph;
    }

    public void setLocalDate(String localDate) {
        this.localDate = localDate;
    }

    public void setPrecipitationProbabilityInPercent(int precipitationProbabilityInPercent) {
        this.precipitationProbabilityInPercent = precipitationProbabilityInPercent;
    }

    public void setPrecipitationProbabilityText(String precipitationProbabilityText) {
        this.precipitationProbabilityText = precipitationProbabilityText;
    }

    public void setWeatherType(int weatherType) {
        this.weatherType = weatherType;
    }

    public void setWeatherTypeText(String weatherTypeText) {
        this.weatherTypeText = weatherTypeText;
    }

    public void setWindDescription(String windDescription) {
        this.windDescription = windDescription;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public void setWindDirectionAbbreviation(String windDirectionAbbreviation) {
        this.windDirectionAbbreviation = windDirectionAbbreviation;
    }

    public void setWindDirectionFull(String windDirectionFull) {
        this.windDirectionFull = windDirectionFull;
    }

    public void setWindSpeedKph(int windSpeedKph) {
        this.windSpeedKph = windSpeedKph;
    }

    public void setWindSpeedMph(int windSpeedMph) {
        this.windSpeedMph = windSpeedMph;
    }

    public void setLowermaxTemperatureC(int lowermaxTemperatureC) {
        this.lowermaxTemperatureC = lowermaxTemperatureC;
    }

    public void setLowermaxTemperatureF(int lowermaxTemperatureF) {
        this.lowermaxTemperatureF = lowermaxTemperatureF;
    }

    public void setLowerminTemperatureC(int lowerminTemperatureC) {
        this.lowerminTemperatureC = lowerminTemperatureC;
    }

    public void setLowerminTemperatureF(int lowerminTemperatureF) {
        this.lowerminTemperatureF = lowerminTemperatureF;
    }

    public void setMaxTempC(int maxTempC) {
        this.maxTempC = maxTempC;
    }

    public void setMaxTempF(int maxTempF) {
        this.maxTempF = maxTempF;
    }

    public void setMinTempC(int minTempC) {
        this.minTempC = minTempC;
    }

    public void setMinTempF(int minTempF) {
        this.minTempF = minTempF;
    }

    public void setMostLikelyHighTemperatureC(int mostLikelyHighTemperatureC) {
        this.mostLikelyHighTemperatureC = mostLikelyHighTemperatureC;
    }

    public void setMostLikelyHighTemperatureF(int mostLikelyHighTemperatureF) {
        this.mostLikelyHighTemperatureF = mostLikelyHighTemperatureF;
    }

    public void setMostLikelyLowTemperatureC(int mostLikelyLowTemperatureC) {
        this.mostLikelyLowTemperatureC = mostLikelyLowTemperatureC;
    }

    public void setMostLikelyLowTemperatureF(int mostLikelyLowTemperatureF) {
        this.mostLikelyLowTemperatureF = mostLikelyLowTemperatureF;
    }

    public void setPollenIndex(int pollenIndex) {
        this.pollenIndex = pollenIndex;
    }

    public void setPollenIndexBand(int pollenIndexBand) {
        this.pollenIndexBand = pollenIndexBand;
    }

    public void setPollenIndexIconText(String pollenIndexIconText) {
        this.pollenIndexIconText = pollenIndexIconText;
    }

    public void setPollenIndexText(String pollenIndexText) {
        this.pollenIndexText = pollenIndexText;
    }

    public void setPollutionIndex(int pollutionIndex) {
        this.pollutionIndex = pollutionIndex;
    }

    public void setPollutionIndexBand(String pollutionIndexBand) {
        this.pollutionIndexBand = pollutionIndexBand;
    }

    public void setPollutionIndexIconText(String pollutionIndexIconText) {
        this.pollutionIndexIconText = pollutionIndexIconText;
    }

    public void setPollutionIndexText(String pollutionIndexText) {
        this.pollutionIndexText = pollutionIndexText;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public void setUppermaxTemperatureC(int uppermaxTemperatureC) {
        this.uppermaxTemperatureC = uppermaxTemperatureC;
    }

    public void setUppermaxTemperatureF(int uppermaxTemperatureF) {
        this.uppermaxTemperatureF = uppermaxTemperatureF;
    }

    public void setUpperminTemperatureC(int upperminTemperatureC) {
        this.upperminTemperatureC = upperminTemperatureC;
    }

    public void setUpperminTemperatureF(int upperminTemperatureF) {
        this.upperminTemperatureF = upperminTemperatureF;
    }

    public void setUvIndex(int uvIndex) {
        this.uvIndex = uvIndex;
    }

    public void setUvIndexBand(String uvIndexBand) {
        this.uvIndexBand = uvIndexBand;
    }

    public void setUvIndexIconText(String uvIndexIconText) {
        this.uvIndexIconText = uvIndexIconText;
    }

    public void setUvIndexText(String uvIndexText) {
        this.uvIndexText = uvIndexText;
    }
}
