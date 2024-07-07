package dio.santander.desafios.devweek2024.controller;


import dio.santander.desafios.devweek2024.controller.dto.RestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<RestResponse> handleBusinessException(IllegalArgumentException businessException) {
        log.error("Business Exception", businessException);
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(new RestResponse(
                HttpStatus.BAD_REQUEST.value(),
                businessException.getMessage(),
                null, null));
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<RestResponse> handlerNotFoundException(NoSuchElementException notFoundException) {
        log.error("Not Found Exception", notFoundException);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new RestResponse(
                HttpStatus.NOT_FOUND.value(),
                "Resource Not Found",
                null, notFoundException.getCause()));
    }


    @ExceptionHandler(Throwable.class)
    public ResponseEntity<RestResponse> handleUnexpectedException(Throwable unexpectedException) {
        log.error("Unexpected Exception", unexpectedException);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                new RestResponse(
                        HttpStatus.INTERNAL_SERVER_ERROR.value(),
                        "Unexpected Exception Server Error.",
                        null, unexpectedException.getCause()));
    }
}
