package com.tutorials.hotel.hotelservice.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super("Resource Not Found Exception");
    }

    public ResourceNotFoundException(String s) {
        super(s);
    }
}
