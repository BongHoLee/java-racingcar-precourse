package racingcar.model.accelerator;

public class AcceleratorLevel {
    private static final int MAX_LEVEL = 9;
    private static final int MIN_LEVEL = 0;
    private static final int CAN_MOVE_MIN_LEVEL = 4;
    private static final int CAN_MOVE_MAX_LEVEL = 9;
    private static final String NOT_VALID_LEVEL_MESSAGE = "[ERROR] Accelerator Level은 0 ~ 9사이의 숫자만 가능합니다.";
    private final int level;

    public AcceleratorLevel(int level) {
        validationCheck(level);
        this.level = level;
    }

    private void validationCheck(int checkValue) {
        if (checkValue < MIN_LEVEL || checkValue > MAX_LEVEL) {
            throw new IllegalArgumentException(NOT_VALID_LEVEL_MESSAGE);
        }
    }

    public boolean canMoveForward() {
        return CAN_MOVE_MAX_LEVEL >= level && CAN_MOVE_MIN_LEVEL <= level;
    }
}
