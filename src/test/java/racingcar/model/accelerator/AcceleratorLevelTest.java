package racingcar.model.accelerator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class AcceleratorLevelTest {

    private static final String NOT_VALID_LEVEL_MESSAGE = "[ERROR] Accelerator Level은 0 ~ 9사이의 숫자만 가능합니다.";

    @ParameterizedTest(name = "{index} : {2}")
    @MethodSource("validParameterExpected")
    @DisplayName("유효한 level에 따른 전진 여부 테스트")
    void 정상범위_LEVEL값_입력에따른_기대값테스트(int level, boolean expected, String displayName) {
        AcceleratorLevel acceleratorLevel = new AcceleratorLevel(level);
        assertEquals(expected, acceleratorLevel.canMoveForward());
    }

    private static Stream<Arguments> validParameterExpected() {
        return Stream.of(
                Arguments.of(9, true, "level이 9인 경우 전진 가능"),
                Arguments.of(4, true, "level이 4인 경우 전진 가능"),
                Arguments.of(3, false, "level이 3인 경우 전진 불가능"),
                Arguments.of(0, false, "level이 0인 경우 전진 가능")
        );
    }

    @ParameterizedTest(name = "{index} : {1}")
    @MethodSource("inValidParameterExpected")
    @DisplayName("유효하지않은 level에 따른 예외발생 테스트")
    void 비정상범위_LEVEL값_입력에따른_예외발생테스트(int level, String displayName) {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new AcceleratorLevel(level));
        assertThat(e.getMessage()).isEqualTo(NOT_VALID_LEVEL_MESSAGE);
    }

    private static Stream<Arguments> inValidParameterExpected() {
        return Stream.of(
                Arguments.of(-1, "level이 9인 경우 전진 가능"),
                Arguments.of(10, "level이 4인 경우 전진 가능")
        );
    }
}
