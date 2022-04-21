package racingcar.error;

public enum Error {
    NOT_VALID_CAR_NAME("[ERROR] 유효하지 않은 이름입니다."),
    NOT_VALID_LEVEL("[ERROR] Rpm Level은 0 ~ 9사이의 숫자만 가능합니다.");

    private final String message;
    Error(String message) {
        this.message = message;
    }

    public String message() {
        return this.message;
    }
}
