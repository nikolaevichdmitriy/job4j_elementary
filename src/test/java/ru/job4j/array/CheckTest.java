package ru.job4j.array;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] data = new boolean[]{true, true, true};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = new boolean[]{true, false, true};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        boolean[] data = new boolean[]{false, false, false};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }

    @Test
    public void whenDataNotMonoByFalseThenFalse() {
        boolean[] data = new boolean[]{false, true, false};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }
}
