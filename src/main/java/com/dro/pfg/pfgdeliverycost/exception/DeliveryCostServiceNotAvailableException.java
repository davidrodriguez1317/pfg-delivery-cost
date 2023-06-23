package com.dro.pfg.pfgdeliverycost.exception;

public class DeliveryCostServiceNotAvailableException extends RuntimeException {

    public DeliveryCostServiceNotAvailableException() {
        super("Deliver cost service is not available");
    }
}
