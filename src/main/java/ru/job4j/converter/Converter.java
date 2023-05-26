package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float v = value / 70;
        return v;
    }
    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println(euro + " " + "euro");
        System.out.println(dollar + " " + "rubles");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 140;
        expected = 2;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }
}
