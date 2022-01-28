package uk.co.somestuff.BBC.Weather;

import java.time.LocalDateTime;
import java.util.List;

public class Detailed {
    private String issueDate;
    private String lastUpdated;
    private List<DetailedReport> reports;

    public Detailed() {}

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setReports(List<DetailedReport> reports) {
        this.reports = reports;
    }

    public String getIssueDate() {
        return this.issueDate;
    }

    public String getLastUpdated() {
        return this.lastUpdated;
    }

    public List<DetailedReport> getReports() {
        return this.reports;
    }
}
