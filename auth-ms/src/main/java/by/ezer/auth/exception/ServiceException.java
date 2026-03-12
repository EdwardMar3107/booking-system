package by.ezer.auth.exception;

import org.springframework.http.HttpStatus;

public class ServiceException extends RuntimeException {

    private HttpStatus httpStatus;
    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
