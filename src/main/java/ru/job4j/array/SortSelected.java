package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int step = 0; step < data.length; step++) {
            int min = MinDiapason.findMin(data, step, data.length - 1);
            int index = FindLoop.indexInRange(data, min, step, data.length - 1);
            SwitchArray.swap(data, step, index);
        }
        return data;
    }
}
