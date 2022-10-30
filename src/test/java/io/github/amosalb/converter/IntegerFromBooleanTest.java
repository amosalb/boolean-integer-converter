package io.github.amosalb.converter;

import io.github.amosalb.converter.exceptions.NullNotAllowedException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerFromBooleanTest {

    @Test
    void shouldReturnZero_WhenFalse() {
        assertEquals(0, new IntegerFromBoolean(false).value());
    }

    @Test
    void shouldReturnOne_WhenTrue() {
        assertEquals(1, new IntegerFromBoolean(true).value());
    }

    @Test
    void shouldThrowException_WhenNull() {
        assertThrows(
                NullNotAllowedException.class,
                () -> new IntegerFromBoolean(null)
        );
    }
}