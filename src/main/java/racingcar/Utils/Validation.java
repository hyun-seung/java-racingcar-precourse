package racingcar.Utils;

public class Validation {

    public void isCarNames(String[] targets) {
        checkNameLength(targets);
    }

    private void checkNameLength(String[] targets) {
        for (String target : targets) {
            if(target.length() > 5) {
                throw new IllegalArgumentException(ExceptionType.OVER_NAME_LENGTH.toString());
            }
        }
    }
}
