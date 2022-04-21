package racingcar.model.engine;

import racingcar.model.engine.wrapper.ForwardDistance;

public class Engine {
    private static final int CAN_MOVE_STANDARD = 4;
    private final ForwardDistance forwardDistance;

    public Engine() {
        this.forwardDistance = new ForwardDistance();
    }

    public ForwardDistance hit(Rpm rpm) {
        if (canMoveForwardOn(rpm)) {
            forwardDistance.increase();
        }

        return forwardDistance;
    }

    private boolean canMoveForwardOn(Rpm rpm) {
        return rpm.level() >= CAN_MOVE_STANDARD;
    }
}
