package racingcar.View;

import java.util.List;

public class OutputView {

    private static final String GET_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String GET_TRY_COUNT = "시도할 횟수는 몇회인가요?";
    private static final String WINNER = "최종 우승자 : ";
    private static final String SEPARATOR = ", ";

    public void printGetCarNames() {
        System.out.println(GET_CAR_NAMES);
    }

    public void printGetTryCount() {
        System.out.println(GET_TRY_COUNT);
    }

    public void printCarsStatus(List<String> carsStatus) {
        for (String carStatus : carsStatus) {
            printCarStatus(carStatus);
        }
    }

    private void printCarStatus(String carStatus) {
        System.out.println(carStatus);
    }

    public void printWinners(List<String> winners) {
        System.out.print(WINNER);
        for (int i = 0; i < winners.size() - 1; i++) {
            printWinner(winners.get(i));
            System.out.print(SEPARATOR);
        }
        System.out.println(winners.get(winners.size() - 1));
    }

    private void printWinner(String winner) {
        System.out.print(winner);
    }

    public void printError(String message) {
        System.out.println(message);
    }
}
