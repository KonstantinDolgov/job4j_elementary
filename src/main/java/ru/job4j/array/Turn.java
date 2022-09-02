package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        for (int i = array.length - 1, j = 0; i >= array.length / 2; i--, j++) {
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
