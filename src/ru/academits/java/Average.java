package ru.academits.java;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber, endingNumber, count = 0, sum = 0, evenSum = 0, evenCount = 0;
        double average, evenAverage;

        System.out.print("Введите начальное число диапазона чисел: ");
        firstNumber = scan.nextInt();
        if (firstNumber < 1) {
            do {
                System.out.print("Введите число > 1: ");
                firstNumber = scan.nextInt();
            }

            while (firstNumber < 1);
        }
        System.out.print("Введите конечное число диапазона чисел: ");
        endingNumber = scan.nextInt();

        for (int j = firstNumber; j <= endingNumber; j++) {
            count++;
            sum += j;
            if ((j % 2) == 0) {
                evenCount++;
                evenSum += j;
            }


        }

        average = (double) sum / (double) count;
        evenAverage = (double) evenSum / (double) evenCount;
        System.out.println("Среднее арифметическое: " + average);
        System.out.println("Среднее арифметическое четных чисел: " + evenAverage);
    }

}

