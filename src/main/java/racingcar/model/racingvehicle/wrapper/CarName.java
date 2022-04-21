package racingcar.model.racingvehicle.wrapper;

public class CarName {
    private static final String NOT_VALID_NAME = "[ERROR] 유효하지 않은 이름입니다. 다시 입력해주세요.";
    private static final int MAX_LENGTH = 5;
    private final String carName;

    public CarName(String carName) {
        validationCheck(carName);
        this.carName = carName;
    }

    private void validationCheck(String carName) {
        if (isNull(carName) || isLongerThanMaxLength(carName)) {
            throw new IllegalArgumentException(NOT_VALID_NAME);
        }
    }

    private boolean isNull(String carName) {
        return carName == null;
    }

    private boolean isLongerThanMaxLength(String carName) {
        return carName.length() > MAX_LENGTH;
    }
}
