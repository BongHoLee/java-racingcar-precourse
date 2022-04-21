package racingcar.model.report;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.racingvehicle.wrapper.CarName;
import racingcar.model.engine.wrapper.ForwardDistance;

public class RecordReportsTest {

    private RecordReports reports = new RecordReports();

    @Test
    @DisplayName("한 명에 대한 report 테스트")
    void lee_한번_전진_테스트() {
        String expected = "lee : -\n";

        CarName carName = nameOf("lee");
        ForwardDistance distance = nCountDistance(1);
        RecordReport report = new RecordReport(carName, distance);
        reports.addReport(report);

        Assertions.assertThat(reports.report()).isEqualTo(expected);
    }

    @Test
    @DisplayName("두 명에 대한 report 테스트")
    void lee_한번_전진_kim_두번_전진_테스트() {
        String expected = "lee : -\nkim : --\n";

        addReportOf("lee", 1);
        addReportOf("kim", 2);

        Assertions.assertThat(reports.report()).isEqualTo(expected);
    }

    private void addReportOf(String name, int distance) {
        reports.addReport(new RecordReport(nameOf(name), nCountDistance(distance)));
    }

    private ForwardDistance nCountDistance(int n) {
        ForwardDistance forwardDistance = new ForwardDistance();
        for (int i = 0; i < n; i ++) {
            forwardDistance.increase();
        }

        return forwardDistance;
    }

    private CarName nameOf(String name) {
        return new CarName(name);
    }
}
