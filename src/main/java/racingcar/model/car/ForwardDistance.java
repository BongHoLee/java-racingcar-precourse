package racingcar.model.car;

public class ForwardDistance {
    private static final String PER_DISTANCE = "-";
    private static final int CAN_MOVE_STANDARD = 4;
    private final StringBuilder currentDistance = new StringBuilder();

    public void hitFrom(Rpm rpm) {
        if (canIncreaseOn(rpm)) {
            currentDistance.append(PER_DISTANCE);
        }
    }

    private boolean canIncreaseOn(Rpm rpm) {
        return rpm.level() >= CAN_MOVE_STANDARD;
    }

    public String distance() {
        return currentDistance.toString();
    }
}
