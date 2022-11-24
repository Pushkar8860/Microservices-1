package com.tutorials.user.service.usersercice.exceptions;

public class ResourceNotFpondException extends RuntimeException {

    public ResourceNotFpondException() {
        super("Resource Not found on server");
    }

    public ResourceNotFpondException(String message) {
        super(message);
    }

}
