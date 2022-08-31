package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        int startSalary = 0;
        while (startSalary < amount) {
            startSalary += salary;
            amount += amount * (percent / 100);
            year++;
        }
        return year;
    }
}
