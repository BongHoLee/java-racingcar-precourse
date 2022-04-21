package racingcar.model.racingvehicle.wrapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ForwardDistanceTest {

    @Test
    @DisplayName("한 번도 전진 안했을 시 빈 문자열 ")
    void 전진_안한경우_DISTANCE_길이는_0() {
        ForwardDistance distance = new ForwardDistance();
        forwardForCount(distance, 0);
        assertThat(distance.currentDistance()).isEqualTo("");
    }

    @Test
    @DisplayName("두 번 전진 시 -- ")
    void 두_번_전진시_DISTANCE_길이는_2() {
        ForwardDistance distance = new ForwardDistance();
        forwardForCount(distance, 2);
        assertThat(distance.currentDistance()).isEqualTo("--");
    }


    @Test
    @DisplayName("다섯 번 전진 시 ----- ")
    void 다섯_번_전진시_DISTANCE_길이는_5() {
        ForwardDistance distance = new ForwardDistance();
        forwardForCount(distance, 5);
        assertThat(distance.currentDistance()).isEqualTo("-----");
    }

    private void forwardForCount(ForwardDistance distance, int count) {
        for (int i = 0; i< count; i++) {
            distance.increase();
        }
    }
}
