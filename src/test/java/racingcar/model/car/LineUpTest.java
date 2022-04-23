package racingcar.model.car;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.error.Error;
import racingcar.model.car.LineUp;

public class LineUpTest {

    private LineUp lineUp;

    @Test
    @DisplayName("lee,kim,ho에 대해 hasNext 메서드 true 반환")
    void 쉼표_기준_hasNext_여부_반환() {
        String lineup = "lee,kim,ho";
        lineUp = new LineUp(lineup);

        assertThat(lineUp.hasNext()).isTrue();
    }

    @Test
    @DisplayName("next 메서드에 대해 쉼표 기준 분리된 이름 반환")
    void 쉼표_기준_분리된_이름_반환_테스트() {
        String lineup = "lee,kim,ho";
        lineUp = new LineUp(lineup);

        assertThat(lineUp.next()).isEqualTo("lee");
        assertThat(lineUp.next()).isEqualTo("kim");
        assertThat(lineUp.next()).isEqualTo("ho");
    }

    @Test
    @DisplayName("모든 LineUp 배정 시 hasNext false 반환")
    void LineUp_크기만큼_추출시_hasNext_false_반환() {
        String lineup = "lee,kim,ho";
        lineUp = new LineUp(lineup);
        extractFromLineup(lineup.split(",").length);

        assertThat(lineUp.hasNext()).isFalse();
    }

    @Test
    @DisplayName("다음 LineUp 없을 시 IllegalStatementException 반환")
    void 모든_LineUp_소진이후_추출시_예외발생() {
        String lineup = "lee,kim,ho";
        lineUp = new LineUp(lineup);
        extractFromLineup(lineup.split(",").length);

        IllegalStateException e = assertThrows(IllegalStateException.class, () -> lineUp.next());
        assertThat(e.getMessage()).isEqualTo(Error.HAS_NOT_NEXT_LINEUP.message());
    }

    private void extractFromLineup(int count) {
        for (int i = 0; i < count; i++) {
            lineUp.next();
        }
    }
}
