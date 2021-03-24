package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2){

        double p1 = x1 - x2;
        p1 = Math.pow(p1, 2);
        double p2 = y1 - y2;
        p2 = Math.pow(p2, 2);
        double p = p1 + p2;
        p = Math.sqrt(p);
        return p;
    }

    public static void main(String[] args) {
        double result = Point.distance(0,0,2,0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
