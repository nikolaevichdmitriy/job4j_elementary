package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = 1; i < array.length; i++) {
            if (array[finish] < min) {
                min = array[finish];
                finish = i;
            }
        }
        return min;
    }
}
