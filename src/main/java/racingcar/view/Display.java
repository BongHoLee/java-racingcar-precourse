package racingcar.view;

public class Display {
    private static final String LINEUP_MESSAGE = "경주 할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)";

    public static void printLineUpMessage() {
        System.out.println(LINEUP_MESSAGE);
    }

    public static void printExceptionMessage(RuntimeException e) {
        System.out.println(e.getMessage());
    }
}
