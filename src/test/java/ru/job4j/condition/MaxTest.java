package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax8To20To16Then20() {
        int left = 8;
        int right = 16;
        int central = 20;
        int result = Max.max(left, central, right);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax28To1To20To32Then32() {
        int left = 28;
        int right = 1;
        int central = 20;
        int internal = 32;
        int result = Max.max(left, central, internal, right);
        int expected = 32;
        assertThat(result).isEqualTo(expected);
    }
}