package io.github.amosalb.converter.exceptions;

public class NullNotAllowedException extends RuntimeException {

    public NullNotAllowedException() {
        super("Null values are not allowed");
    }
}
