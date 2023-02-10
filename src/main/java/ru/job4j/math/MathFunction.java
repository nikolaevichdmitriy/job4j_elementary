package ru.job4j.math;

public class MathFunction {
    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double subtraction(double first, double second) {
        return first - second;
    }

    public static double division(double first, double second) {
        return first / second;
    }

    public static double sumA(double first, double second) {
       double i = first * second;
       double a = first - second;
       double b = first / second;
       double x = first + second;
       return i + a + b + x;

    }

}






