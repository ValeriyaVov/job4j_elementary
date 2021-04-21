package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int start = 1;
        int finish = 5;
        int result = Factorial.calc(start, finish);
        int expected = 120;
        Assert.assertEquals(expected, result); /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int start = 1;
        int finish = 0;
        int result = Factorial.calc(start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result); /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
    }
}