package com.dro.pfg.pfgdeliverycost.controller;

import com.dro.pfg.pfgdeliverycost.exception.ApiError;
import com.dro.pfg.pfgdeliverycost.exception.DeliveryCostNotHandledException;
import com.dro.pfg.pfgdeliverycost.exception.DeliveryCostServiceNotAvailableException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collections;
import java.util.List;

@ControllerAdvice
public class DeliveryCostControllerAdvice {

    @ExceptionHandler(DeliveryCostNotHandledException.class)
    public ResponseEntity<ApiError> handleDeliveryCostNotHandledException (DeliveryCostNotHandledException ex){
        List<String> errors = Collections.singletonList(ex.getMessage());

        return new ResponseEntity<>(new ApiError(errors), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DeliveryCostServiceNotAvailableException.class)
    public ResponseEntity<ApiError> handleDeliveryCostServiceNotAvailableException (DeliveryCostServiceNotAvailableException ex){
        List<String> errors = Collections.singletonList(ex.getMessage());

        return new ResponseEntity<>(new ApiError(errors), HttpStatus.SERVICE_UNAVAILABLE);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleGenericException (Exception ex){
        List<String> errors = Collections.singletonList(ex.getMessage());

        return new ResponseEntity<>(new ApiError(errors), HttpStatus.SERVICE_UNAVAILABLE);
    }

}
