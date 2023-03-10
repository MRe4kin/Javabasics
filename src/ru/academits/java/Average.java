package ru.academits.java;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double intirnalNumber, endingNumber, count = 0, sum = 0, average = 0, evenAverage = 0;

        System.out.print("Введите начальное число диапазона чисел: ");
        intirnalNumber = scan.nextDouble();
        if (intirnalNumber < 1) {
            do {
                System.out.print("Введите число > 1: ");
                intirnalNumber = scan.nextDouble();
            }

            while (intirnalNumber < 1);
        }
        System.out.print("Введите конечное число диапазона чисел: ");
        endingNumber = scan.nextDouble();

        for (double i = intirnalNumber; i <= endingNumber; i++) {
            count++;
            sum += i;
            average = sum / count;

        }
        System.out.println("Среднее арифметическое: " + average);
        count = 0;
        sum = 0;
        for (double j = intirnalNumber; j <= endingNumber; j++) {
            if ((j % 2) == 0) {
                count++;
                sum += j;
                evenAverage = sum / count;
            }

        }
        System.out.println("Среднее арифметическое четных чисел: " + evenAverage);
    }

}

