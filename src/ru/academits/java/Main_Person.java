package ru.academits.java;

import java.util.Scanner;

public class Main_Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите отчество: ");
        String middleName = scanner.nextLine();

        System.out.print("Введите фамилию: ");
        String familyName = scanner.nextLine();

        Person person = new Person(name, middleName, familyName);

        System.out.println("Объект класса Person был создан: " + person);
        person.setName("Petr");
        System.out.println("Имя изменано на : " + person.getName());
        System.out.println("Минимальный возраст: " + person.getMinAge());
        System.out.println(person);
        person.setAge("33");
        System.out.println("Возраст: " + person.getAge());
        System.out.println("Год рождения: " + person.getbirthYear());
    }
}
