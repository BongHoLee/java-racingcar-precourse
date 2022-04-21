package racingcar.model.racingvehicle.wrapper;

public class ForwardDistance {
    private static final String PER_DISTANCE = "-";
    private final StringBuilder currentDistance = new StringBuilder();

    public void increase() {
        currentDistance.append(PER_DISTANCE);
    }

    @Override
    public String toString() {
        return currentDistance.toString();
    }
}
