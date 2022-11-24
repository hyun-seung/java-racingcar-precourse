package racingcar.Domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void moveByRandomNumber() {
        if (isMove()) {
            position++;
        }
    }

    private boolean isMove() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        if (randomNumber > 4) {
            return true;
        }
        return false;
    }
}
