package ru.job4j;

public class Main {
   public static int rubleToEuro(int value) {
     int rsl = value / 70;
     return rsl;
    }

    public static int rubleToDollar(int value) {
       int rsl = value / 60;
       return rsl;
    }
    public static void main(String[] srgs) {
       int euro = Main.rubleToEuro(140);
       int dollar = Main.rubleToDollar(140);
       System.out.println("140 rubles are " + euro + " euro.");
       System.out.println("140 rubles are " + dollar + " dollar.");
    }
}