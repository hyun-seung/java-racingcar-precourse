package racingcar.View;

public class TotalView {

    private final InputView input;
    private final OutputView output;

    TotalView() {
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
}
