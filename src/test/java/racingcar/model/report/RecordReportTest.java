package racingcar.model.report;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.racingvehicle.wrapper.CarName;
import racingcar.model.racingvehicle.wrapper.ForwardDistance;

public class RecordReportTest {

    @Test
    @DisplayName("자동차 이름이 lee, 한 번 전진 시 => lee : -")
    void 자동차이름이_lee이고_한번_전진한경우_정상출력_테스트() {
        String expected = "lee : -";
        CarName carName = nameOf("lee");
        ForwardDistance distance = nCountDistance(1);

        RecordReport report = new RecordReport(carName, distance);
        Assertions.assertThat(report.report()).isEqualTo(expected);
    }

    @Test
    @DisplayName("자동차 이름이 kim, 여섯 번 전진 시 => kim : ------")
    void 자동차이름이_kim이고_여섯번_전진한경우_정상출력_테스트() {
        String expected = "kim : ------";
        CarName carName = nameOf("kim");
        ForwardDistance distance = nCountDistance(6);

        RecordReport report = new RecordReport(carName, distance);
        Assertions.assertThat(report.report()).isEqualTo(expected);
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
