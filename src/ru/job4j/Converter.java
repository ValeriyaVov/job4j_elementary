package ru.job4j;

public class Converter {

        public static int rubleToEuro(int value) {
            return value / 70;
        }

        public static int rubleToDollar(int value) {
            return value / 60;

        }
        public static void main(String[] srgs) {
            int euro = ru.job4j.Main.rubleToEuro(140);
            int dollar = ru.job4j.Main.rubleToDollar(140);
            System.out.println("140 rubles are " + euro + " euro.");
            System.out.println("140 rubles are " + dollar + " dollar.");
        }

}
