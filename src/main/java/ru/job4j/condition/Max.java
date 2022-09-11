package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        System.out.println(max(28, 20, 32, 1));
    }

    public static int max(int left, int right) {
        boolean condition = left > right;
        return condition ? left : right;
    }

    public static int max(int left, int central, int right) {
        return max(central, max(left, right));
    }

    public static int max(int left, int central, int internal, int right) {
        return max(internal, max(central, max(left, right)));
    }
}
