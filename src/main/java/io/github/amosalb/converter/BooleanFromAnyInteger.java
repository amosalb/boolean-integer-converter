package io.github.amosalb.converter;

import io.github.amosalb.converter.exceptions.NullNotAllowedException;

public final class BooleanFromAnyInteger {

    private final Integer integerValue;

    public BooleanFromAnyInteger(Integer integerValue) {
        if(integerValue == null) {
            throw new NullNotAllowedException();
        }
        this.integerValue = integerValue;
    }

    public Boolean value() {
        return integerValue != 0;
    }
}
