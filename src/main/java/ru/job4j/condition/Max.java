package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        System.out.println(max(8, 20, 16));
    }

    public static int max(int left, int right) {
        boolean condition = left > right;
        return condition ? left : right;
    }

    public static int max(int left, int central, int right) {
        int temp = max(left, right);
        return max(central, temp);
    }
}
