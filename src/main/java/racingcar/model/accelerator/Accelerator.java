package racingcar.model.accelerator;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.status.MovementStatus;

public class Accelerator {
    private static final int MIN_LEVEL = 0;
    private static final int MAX_LEVE = 9;

    public MovementStatus hit() {
        if (canMoveForward()) {
            return MovementStatus.FORWARD;
        }

        return MovementStatus.NONE;
    }

    private boolean canMoveForward() {
        return hitLevel().canMoveForward();
    }

    private AcceleratorLevel hitLevel() {
        return new AcceleratorLevel(Randoms.pickNumberInRange(MIN_LEVEL, MAX_LEVE));
    }

}
