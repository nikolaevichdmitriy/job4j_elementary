package ru.job4j.calculator;

public class MathFunc {
    public static int func1(int x) {
        int i = x * x + 1;
        return i;
    }
    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }
    public static void main(String[] args) {
        int result3 = MathFunc.func1(100);
        System.out.println(result3);
    }
}


