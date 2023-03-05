package ru.academits.java;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        str = scanner.nextLine();
        char[] numbers = str.toCharArray();
        System.out.printf("Сумма цифр числа %s = %d%n", str, sumDigit(numbers));
        System.out.printf("Сумма нечетных цифр числа %s = %d%n", str, sumOdd(numbers));
        System.out.printf("Максимальная цифра числа %s = %s%n", str, maxDigit(numbers));
    }

    private static int sumDigit(char[] arr) {
        int sum = 0;
        for (char c : arr) {
            int value = Character.getNumericValue(c);
            sum += value;
        }
        return sum;
    }

    private static int sumOdd(char[] arr) {
        int sum = 0;
        for (char c : arr) {
            int value = Character.getNumericValue(c);
            if (value % 2 == 1)
                sum += value;
        }
        return sum;
    }

    private static char maxDigit(char[] arr) {
        char max = arr[0];
        for (char c : arr) {
            if (c > max) max = c;
        }
        return max;
    }
}
