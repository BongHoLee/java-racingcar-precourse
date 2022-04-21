package racingcar.status;

public enum MovementStatus {
    FORWARD,
    NONE;

    public boolean isForward() {
        return this == FORWARD;
    }
}
