package racingcar.View;

import java.util.List;

public class TotalView {

    private final InputView input;
    private final OutputView output;

    public TotalView() {
        input = new InputView();
        output = new OutputView();
    }

    public String[] getCarNames() {
        try {
            output.printGetCarNames();
            return input.readNames();
        } catch (IllegalArgumentException e) {
            output.printError(e.getMessage());
            return getCarNames();
        }
    }

    public int getTryCount() {
        try {
            output.printGetTryCount();
            return input.readTryCount();
        } catch (IllegalArgumentException e) {
            output.printError(e.getMessage());
            return getTryCount();
        }
    }

    public void printCarsStatus(List<String> carsStatus) {
        output.printCarsStatus(carsStatus);
    }

    public void printWinner(List<String> winners) {
        output.printWinners(winners);
    }
}
