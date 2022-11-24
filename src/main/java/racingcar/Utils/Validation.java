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

    public void isNumber(String target) {
        String numberRegex = "^[0-9]*$";
        if(!target.matches(numberRegex)) {
            throw new IllegalArgumentException(ExceptionType.NOT_NUMBERS.toString());
        }
    }
}
