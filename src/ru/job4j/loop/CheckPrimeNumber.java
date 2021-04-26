package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int i = 2;
        boolean prime = true;
        for (i = 2; i <= -1; i++) {
            if ((number % 5) == 0) {
                break;
            }
            return prime;
        }
    }
}
