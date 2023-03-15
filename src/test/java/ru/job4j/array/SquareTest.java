package ru.job4j.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class SquareTest {
    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenBound3Then013() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4, 9, 16};
        assertThat(result).containsExactly(expected);
    }
}
