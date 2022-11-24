package racingcar.View;

import camp.nextstep.edu.missionutils.Console;
import racingcar.Utils.Validation;

public class InputView {

    Validation validation;

    InputView() {
        validation = new Validation();
    }

    public String[] readNames() {
        String line = Console.readLine();
        String[] names = line.split(",");
        validation.isCarNames(names);
        return names;
    }
}
