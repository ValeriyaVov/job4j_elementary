package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean more = left > right;
        return more ? left : right;
    }

    public static void main(String[] args) {
            int rsl = Max.max(2, 3);
            System.out.println(rsl);
        }
}
