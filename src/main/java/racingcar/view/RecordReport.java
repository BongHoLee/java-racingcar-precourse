package racingcar.view;

import racingcar.model.record.Records;

public class RecordReport {
    private static final String NEXT_LINE = "\n";

    public static String summaryForLab(Records records) {
        StringBuilder summeryReport = new StringBuilder();
        while (records.hasNext()) {
            summeryReport
                    .append(records.next().report())
                    .append(NEXT_LINE);
        }

        return summeryReport.toString();
    }
}

