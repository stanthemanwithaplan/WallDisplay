package uk.co.somestuff.BBC.Weather;

public class Location {
    private String name;
    private String geoId;
    private String gssId;

    public Location() {}

    public String getGeoId() {
        return this.geoId;
    }

    public String getGssId() {
        return this.gssId;
    }

    public String getName() {
        return this.name;
    }

    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }

    public void setGssId(String gssId) {
        this.gssId = gssId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
