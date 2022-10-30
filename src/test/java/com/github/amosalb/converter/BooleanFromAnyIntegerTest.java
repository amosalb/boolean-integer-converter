package com.github.amosalb.converter;

import com.github.amosalb.converter.exceptions.NullNotAllowedException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanFromAnyIntegerTest {

    @Test
    void shouldReturnFalse_WhenIntegerValueIsZero() {
        assertFalse(new BooleanFromAnyInteger(0).value());
    }

    @Test
    void shouldReturnTrue_WhenIntegerValueIsDifferentToZero() {
        assertTrue(new BooleanFromAnyInteger(1).value());
        assertTrue(new BooleanFromAnyInteger(2).value());
        assertTrue(new BooleanFromAnyInteger(-1).value());
    }

    @Test
    void shouldThrowException_WhenIntegerValueIsNull() {
        assertThrows(
                NullNotAllowedException.class,
                () -> new BooleanFromAnyInteger(null)
        );
    }
}