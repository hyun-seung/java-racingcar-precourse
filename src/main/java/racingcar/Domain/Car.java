package racingcar.Domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private static final String NAME_SEPARATOR = " : ";
    private static final String ONE_STEP = "-";

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

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name + NAME_SEPARATOR);
        for(int i=0; i<position; i++) {
            builder.append(ONE_STEP);
        }
        builder.append("\n");
        return builder.toString();
    }
}
