package uk.co.somestuff.BBC.Weather;

public class Forecast {
    private Detailed detailed;
    private Summary summary;

    public Forecast() { }

    public Detailed getDetailed() {
        return this.detailed;
    }

    public Summary getSummary() {
        return this.summary;
    }

    public void setDetailed(Detailed detailed) {
        this.detailed = detailed;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }
}
