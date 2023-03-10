package ru.academits.java;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scan.nextInt();
        digitMax(n);
        sum(n);
        oddSum(n);
    }

    public static void sum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println(sum + " Сумма цифр");
    }

    public static void oddSum(int n) {
        int sumOdd = 0;
        while (n != 0) {

            if ((n % 2) == 1)
                sumOdd += (n % 10);
            n /= 10;
        }
        System.out.println("Сумма нечетных цифр: " + sumOdd);

    }

    public static void digitMax(int n) {
        int maxDigit;
        maxDigit = (n % 10);
        while (n > 0) {
            int curDigit = (n % 10);
            if (curDigit > maxDigit)
                maxDigit = curDigit;
            n /= 10;
        }
        System.out.println("Максимальное  число: " + maxDigit);

    }

}
