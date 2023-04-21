package ru.job4j.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Numbers() {
        int[] data = new int[]{3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 3, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5Numbers() {
        int[] data = new int[]{26, 55, 1, 10, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{0, 1, 10, 26, 55};
        assertThat(result).containsExactly(expected);
    }
}