package ru.job4j.condition;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.*;

class JUnitExampleTest {

    @Test
    void when5and5then25() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5, 5);
        assertThat(result).isEqualTo(25);
    }

    @RepeatedTest(3)
    @Test
    void when2and2then4() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(2, 2);
        assertThat(result).isEqualTo(4);
    }

    @Test
    @DisplayName("When 6 multi 6 should be 36")
    void when6and6then36() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(6, 6);
        assertThat(result).isEqualTo(36);
    }

    @Disabled("Need to fix impl")
    @Test
    void when8and5then40() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(8, 4);
        assertThat(result).isEqualTo(40);
    }

    /*

    @Timeout(3)
    @Test
    void when7and7then49() throws InterruptedException {
        JUnitExample example = new JUnitExample();
        Thread.sleep(5000);
        int result = example.multiply(7, 7);
        assertThat(result).isEqualTo(49);
    }

    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    @Test
    void when9and2then18() throws InterruptedException {
        Thread.sleep(3000);
        JUnitExample example = new JUnitExample();
        int result = example.multiply(9, 2);
        assertThat(result).isEqualTo(18);
    }

     */
}