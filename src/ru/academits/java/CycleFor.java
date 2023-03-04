package ru.academits.java;

public class CycleFor {
    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {
            boolean numbers = multiplicity(i);
            if (numbers) {
                System.out.println("Число кратное 4: " + i);
            }
        }
    }

    public static boolean multiplicity(int i) {
        return (i % 4) == 0;
    }
}
