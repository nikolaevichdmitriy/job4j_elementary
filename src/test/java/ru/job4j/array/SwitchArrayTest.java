package ru.job4j.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap3to1() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {3, 2, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2to1() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {2, 1, 3, 4};
        assertThat(result).containsExactly(expected);
    }
}
