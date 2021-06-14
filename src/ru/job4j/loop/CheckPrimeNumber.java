package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1; //Логическая переменная со !!!!значением!!! true или false (больше или меньше 1)
        for (int i = 2; i < number; i++) { // Если здесь условие не соблюдаются, то идем на 12 строчку
            if ((number % i) == 0) { // % Это нахождение остатка от деления одного целого числа на другое // Если здесь условие не соблюдаются, то идем на 12 строчку
                prime = false; // Если условия строчкой выше соблюдены, то в переменную prime записывается значение false
                break; // прерывание цикла
            }
        }
        return prime; //Здесь возвращается значение переменной prime
    }
}
