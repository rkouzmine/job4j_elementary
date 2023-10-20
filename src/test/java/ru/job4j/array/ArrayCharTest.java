package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e', 'l', 'l'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isTrue();
    }

    @Test
    public void whenStarsWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isFalse();
    }
}