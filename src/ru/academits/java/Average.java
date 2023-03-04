package ru.academits.java;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n, m, count = 0, sum = 0, average = 0;

        System.out.print("Введите начальное число диапазона чисел: ");
        n = scan.nextDouble();
        if (n < 1) {
            do {
                System.out.print("Введите число > 1: ");
                n = scan.nextDouble();
            }

            while (n < 1);
        }
        System.out.print("Введите конечное число диапазона чисел: ");
        m = scan.nextDouble();

        for (double i = n; i <= m; i++) {
            count++;
            sum += i;
            average = sum / count;

        }
        System.out.println("Среднее арифметическое: " + average);
    }

}

