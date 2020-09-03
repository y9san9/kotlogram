package com.github.badoualy.telegram.tl.exception;

public class UnsupportedConstructorException extends DeserializationException {

    public UnsupportedConstructorException(long constructorId) {
        super("Unsupported constructor: #" + Long.toHexString(constructorId));
    }
}
