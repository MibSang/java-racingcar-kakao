package racingcar.exception;


public class CarNameInvalidException extends IllegalArgumentException {
    public CarNameInvalidException(String message) {
        super(message);
    }
}
