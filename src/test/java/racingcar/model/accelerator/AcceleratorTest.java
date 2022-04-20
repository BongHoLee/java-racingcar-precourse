package racingcar.model.accelerator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.status.MovementStatus;

public class AcceleratorTest {

    private Accelerator accelerator;

    @BeforeEach
    void setUp() {
        accelerator = new Accelerator();
    }

    @Test
    @DisplayName("Level이 3일 시 전진하지 않음")
    void 숫자_3_입력시_전진하지않는다() {
        AcceleratorLevel acceleratorLevel = new AcceleratorLevel(0);
        assertThat(accelerator.hit(acceleratorLevel)).isEqualTo(MovementStatus.NONE);
    }

    @Test
    @DisplayName("Level이 9일 시 전진")
    void 숫자_9_입력시_전진한다() {
        AcceleratorLevel acceleratorLevel = new AcceleratorLevel(9);
        assertThat(accelerator.hit(acceleratorLevel)).isEqualTo(MovementStatus.FORWARD);
    }
}
