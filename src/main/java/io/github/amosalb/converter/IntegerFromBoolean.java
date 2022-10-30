package io.github.amosalb.converter;

import io.github.amosalb.converter.exceptions.NullNotAllowedException;

public final class IntegerFromBoolean {

    private final Boolean booleanValue;

    public IntegerFromBoolean(Boolean booleanValue) {
        if (booleanValue == null) {
            throw new NullNotAllowedException();
        }
        this.booleanValue = booleanValue;
    }

    public Integer value() {
        return booleanValue ? 1 : 0;
    }
}
