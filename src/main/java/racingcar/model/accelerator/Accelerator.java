package racingcar.model.accelerator;

import racingcar.status.MovementStatus;

public class Accelerator {
    public MovementStatus hit(AcceleratorLevel acceleratorLevel) {
       if (acceleratorLevel.canMoveForward()) {
           return MovementStatus.FORWARD;
       }

       return MovementStatus.NONE;
    }
}
