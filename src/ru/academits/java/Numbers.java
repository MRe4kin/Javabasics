package ru.academits.java;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scan.nextInt();
        n=Math.abs(n);
        int digitMax = digitMax(n);
        int summa = sum(n);
        int sumOdd = oddSum(n);
        System.out.println("Сумма  цифр: " + summa);
        System.out.println("Сумма нечетных цифр: " + sumOdd);
        System.out.println("Максимальное  число: " + digitMax);
    }

    private static int sum(int n) {
        int summa = 0;
        while (n != 0) {
            summa += (n % 10);
            n /= 10;
        }
        return summa;
    }

    private static int oddSum(int n) {
        int sumOdd = 0;
        while (n != 0) {

            if ((n % 2) == 1)
                sumOdd += (n % 10);
            n /= 10;
        }
        return sumOdd;

    }

    private static int digitMax(int n) {
        int maxDigit;
        maxDigit = (n % 10);
        while (n > 0) {
            int curDigit = (n % 10);
            if (curDigit > maxDigit)
                maxDigit = curDigit;
            n /= 10;
        }
        return maxDigit;

    }

}
