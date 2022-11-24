package racingcar.Utils;

public enum ExceptionType {
    OVER_NAME_LENGTH("입력한 값이 이름의 최대 길이(5자)를 초과합니다."),
    NOT_NUMBERS("입력한 값이 숫자가 아닙니다.");

    private final String message;

    ExceptionType(String message) {
        this.message = "[ERROR] " + message;
    }

    @Override
    public String toString() {
        return message;
    }
}
