package racingcar.model.report;

import java.util.ArrayList;
import java.util.List;

public class RecordReports implements Report{
    private static final String NEXT_LINE = "\n";
    private final List<Report> reports = new ArrayList<>();

    public void addReport(Report report) {
        this.reports.add(report);
    }

    @Override
    public String report() {
        return summary();
    }

    private String summary() {
        StringBuilder summeryReport = new StringBuilder();
        for (Report eachReport : reports) {
            summeryReport
                    .append(eachReport.report())
                    .append(NEXT_LINE);

        }

        return summeryReport.toString();
    }
}
