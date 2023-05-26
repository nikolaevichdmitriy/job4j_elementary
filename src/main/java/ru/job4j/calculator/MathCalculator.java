package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subtractionAndDivision(double first, double second) {
        double answer = subtraction(first, second) + division(first, second);
        return answer;
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + multiply(first, second) + subtraction(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + MathCalculator.sumAll(20, 20));
        System.out.println("Результат расчета равен: " + subtractionAndDivision(20, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiply(20, 20));
    }
}