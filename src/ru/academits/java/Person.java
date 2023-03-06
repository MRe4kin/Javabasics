package ru.academits.java;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private String age;
    public static final int MIN_AGE = 15;
    public static final int birthYear = 1989;

    public Person(String name, String middleName, String familyName) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    public static int getMinAge() {
        return MIN_AGE;
    }

    public static int getbirthYear() {
        return birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name.length() == 0)) {
            this.name = name;
        }
        System.out.println("Имя изменено");
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if (!(name.length() == 0)) {
            this.middleName = middleName;
        }
        System.out.println("Отчество изменено");
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        if (!(name.length() == 0)) {
            this.familyName = familyName;
        }
        System.out.println("Фамилия измена");
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;

        System.out.println("Возраст изменен " + age);
    }

    public String toString() {
        return "{" + familyName + " " + name + " " + middleName + "}";
    }

    public void printName() {
        System.out.print("Name =" + name);
    }
}
