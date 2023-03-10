package ru.academits.java;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstNumber, endingNumber, count = 0, sum = 0, average = 0, evenAverage = 0, evenSum = 0, evenCount = 0;

        System.out.print("Введите начальное число диапазона чисел: ");
        firstNumber = scan.nextDouble();
        if (firstNumber < 1) {
            do {
                System.out.print("Введите число > 1: ");
                firstNumber = scan.nextDouble();
            }

            while (firstNumber < 1);
        }
        System.out.print("Введите конечное число диапазона чисел: ");
        endingNumber = scan.nextDouble();

        for (double j = firstNumber; j <= endingNumber; j++) {
            count++;
            sum += j;
            average = sum / count;
            if ((j % 2) == 0) {
                evenCount++;
                evenSum += j;
                evenAverage = evenSum / evenCount;
            }


        }
        System.out.println("Среднее арифметическое: " + average);
        System.out.println("Среднее арифметическое четных чисел: " + evenAverage);
    }

}

