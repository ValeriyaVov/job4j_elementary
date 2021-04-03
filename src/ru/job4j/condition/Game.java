package ru.job4j.condition;
public class Game {
    public static void menu(String name) {
        String tanks = new String("tanks");
        if (name.equals("super mario")) {
            System.out.println("Start - super mario");
        }
        if (name.equals("tanks")) {
            System.out.println("Start - tanks");
        }
        if (name.equals("tetris")) {
            System.out.println("Start - tetris");
        }
    }
}
