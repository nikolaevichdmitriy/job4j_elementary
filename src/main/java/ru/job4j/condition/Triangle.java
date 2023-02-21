package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return  ab + ac > bc && ac + bc > ab && bc + ab > ac;
    }

    public static void main(String[] args) {
        System.out.println(Triangle.exist(0, 0, 0));
    }
}
