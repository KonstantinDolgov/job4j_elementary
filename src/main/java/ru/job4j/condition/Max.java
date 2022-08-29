package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        System.out.println(max(8, 4));
    }

    public static int max(int left, int right) {
        boolean condition = left > right;
        return condition ? left : right;
    }
}
