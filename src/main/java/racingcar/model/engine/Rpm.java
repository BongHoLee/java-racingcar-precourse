package racingcar.model.engine;

public class Rpm {
    private static final int MAX_LEVEL = 9;
    private static final int MIN_LEVEL = 0;
    private static final String NOT_VALID_LEVEL_MESSAGE = "[ERROR] Accelerator Level은 0 ~ 9사이의 숫자만 가능합니다.";
    private final int level;

    public Rpm(int level) {
        validationCheck(level);
        this.level = level;
    }

    private void validationCheck(int checkValue) {
        if (checkValue < MIN_LEVEL || checkValue > MAX_LEVEL) {
            throw new IllegalArgumentException(NOT_VALID_LEVEL_MESSAGE);
        }
    }

    public static int MaxRpmLevel() {
        return MAX_LEVEL;
    }

    public static int MinRpmLevel() {
        return MIN_LEVEL;
    }

    public int level() {
        return this.level;
    }
}
