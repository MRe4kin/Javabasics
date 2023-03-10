package ru.academits.java;

public class CycleFor {
    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {
            if (multiplicity(i)) {
                System.out.println("Число кратное 4: " + i);
            }
        }
    }

    private static boolean multiplicity(int i) {
        return (i % 4) == 0;
    }
}
