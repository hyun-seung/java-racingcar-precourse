package racingcar.View;

public class OutputView {

    private static final String GET_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String GET_TRY_COUNT = "시도할 횟수는 몇회인가요?";

    public void printGetCarNames() {
        System.out.println(GET_CAR_NAMES);
    }

    public void printGetTryCount() {
        System.out.println(GET_TRY_COUNT);
    }

    public void printError(String message) {
        System.out.println(message);
    }
}
