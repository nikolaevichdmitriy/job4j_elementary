package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (percent <= amount * (percent / 12)) {
            year += salary;
            year++;

        }
        return year;
    }
}

