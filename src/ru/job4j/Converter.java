package ru.job4j;

public class Converter {

        public static int rubleToEuro(int value) {
            return value / 70;
        }

        public static int rubleToDollar(int value) {
            return value / 60;
        }

        public static void main(String[] args) {
            int euro = rubleToEuro(140);
            int dollar = rubleToDollar(140);
            System.out.println("140 rubles are " + euro + " euro.");
            System.out.println("140 rubles are " + dollar + " dollar.");
            int in = 140;
            int expected = 2;
            int out = Converter.rubleToEuro(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are 2. Test result : " + passed);
            System.out.println("140 euro are 2. Test result : " + passed);
        }

}
