package com.github.badoualy.telegram.tl.exception;

public class InvalidConstructorIdException extends DeserializationException {

    public InvalidConstructorIdException(long foundId, long expectedId) {
        super("Invalid constructor id. Found " + Long.toHexString(foundId)
                      + ", expected: " + Long.toHexString(expectedId));
    }

    public InvalidConstructorIdException(String message) {
        super(message);
    }
}
