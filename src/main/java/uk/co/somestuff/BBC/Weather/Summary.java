package uk.co.somestuff.BBC.Weather;

import java.time.LocalDateTime;
import java.util.List;

public class Summary {
    private String issueDate;
    private String lastUpdated;
    private SummaryReport report;

    public Summary() {}

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setReport(SummaryReport report) {
        this.report = report;
    }

    public String getIssueDate() {
        return this.issueDate;
    }

    public String getLastUpdated() {
        return this.lastUpdated;
    }

    public SummaryReport getReport() {
        return this.report;
    }

}
