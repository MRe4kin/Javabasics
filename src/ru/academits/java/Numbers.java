package ru.academits.java;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int digit = scan.nextInt();
        digit = Math.abs(digit);
        int digitMax = digitMax(digit);
        int digitSum = sum(digit);
        int sumOdd = oddSum(digit);
        System.out.println("Сумма  цифр: " + digitSum);
        System.out.println("Сумма нечетных цифр: " + sumOdd);
        System.out.println("Максимальное  число: " + digitMax);
    }

    private static int sum(int digit) {
        int digitSum = 0;
        while (digit != 0) {
            digitSum += (digit % 10);
            digit /= 10;
        }
        return digitSum;
    }

    private static int oddSum(int digit) {
        int sumOdd = 0;
        while (digit != 0) {

            if ((digit % 2) == 1)
                sumOdd += (digit % 10);
            digit /= 10;
        }
        return sumOdd;

    }

    private static int digitMax(int digit) {
        int maxDigit;
        maxDigit = (digit % 10);
        while (digit > 0) {
            int curDigit = (digit % 10);
            if (curDigit > maxDigit)
                maxDigit = curDigit;
            digit /= 10;
        }
        return maxDigit;

    }

}
