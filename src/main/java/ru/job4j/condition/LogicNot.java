package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !(num % 2 == 0);
    }

    public static boolean notPositive(int num) {
        return !(num > 0);
    }

    public static boolean notEvenAndPositive(int num) {
        return !(num % 2 == 0) && num > 0;
    }

    public static boolean evenOrNotPositive(int num) {
        return num % 2 == 0 || !(num > 0);
    }

    public static void main(String[] args) {
        System.out.println(LogicNot.isEven(4));
        System.out.println(LogicNot.isPositive(1));
        System.out.println(LogicNot.notEven(5));
        System.out.println(LogicNot.evenOrNotPositive(6));
        System.out.println(LogicNot.notEvenAndPositive(1));
        System.out.println(LogicNot.notPositive(6));
    }
}
