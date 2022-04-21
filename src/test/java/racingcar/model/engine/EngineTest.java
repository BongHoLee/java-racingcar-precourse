package racingcar.model.engine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class EngineTest {

    private Engine engine;

    @BeforeEach
    void setUp() {
        engine = new Engine();
    }

    @ParameterizedTest(name = "{index} : {2}")
    @MethodSource("validParameterExpected")
    @DisplayName("유효한 Rpm level에 따른 전진 여부 테스트")
    void 정상범위_LEVEL값_입력에따른_기대값테스트(int level, String expected, String displayName) {
        assertEquals(expected, String.valueOf(engine.hit(new Rpm(level))));
    }

    private static Stream<Arguments> validParameterExpected() {
        return Stream.of(
                Arguments.of(9, "-", "Rpm level이 9인 경우 전진 가능"),
                Arguments.of(4, "-", "Rpm level이 4인 경우 전진 가능"),
                Arguments.of(3, "", "Rpm level이 3인 경우 전진 불가능"),
                Arguments.of(0, "", "Rpm level이 0인 경우 전진 가능")
        );
    }
}
