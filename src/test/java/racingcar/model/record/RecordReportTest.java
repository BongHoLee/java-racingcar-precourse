package racingcar.model.record;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.car.ForwardDistance;
import racingcar.model.car.CarName;
import racingcar.model.car.Rpm;
import racingcar.view.RecordReport;

public class RecordReportTest {

    private Records records = new Records();

    @Test
    @DisplayName("자동차 한 대에 대한  테스트")
    void lee_한번_전진_테스트() {
        String expected = "lee : -\n";

        CarName carName = nameOf("lee");
        ForwardDistance distance = nCountDistance(1);
        records.addRecord(new Record(carName, distance));


        Assertions.assertThat(RecordReport.summaryForLab(records)).isEqualTo(expected);
    }

    @Test
    @DisplayName("자동차 두 대에 대한 record 테스트")
    void lee_한번_전진_kim_두번_전진_테스트() {
        String expected = "lee : -\nkim : --\n";

        addRecordOf("lee", 1);
        addRecordOf("kim", 2);

        Assertions.assertThat(RecordReport.summaryForLab(records)).isEqualTo(expected);
    }

    private void addRecordOf(String name, int distance) {
        records.addRecord(new Record(nameOf(name), nCountDistance(distance)));
    }

    private ForwardDistance nCountDistance(int n) {
        ForwardDistance forwardDistance = new ForwardDistance();
        for (int i = 0; i < n; i ++) {
            forwardDistance.hitFrom(new Rpm(5));
        }

        return forwardDistance;
    }

    private CarName nameOf(String name) {
        return new CarName(name);
    }
}
