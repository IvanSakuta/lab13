package org.example;
public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0, "C2", 0.0);
    }
    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "C2", 0.0);
    }
    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("Имя: " + name + ", фамилия: " + surname);
    }
    public void displayInfo(int years) {
        System.out.println("Имя: " + name + ", фамилия: " + surname + ", опыт: " + years + " лет");
    }
    public void displayInfo(String level) {
        System.out.println("Имя: " + name + ", фамилия: " + surname + ", уровень английского: " + level);
    }
    public static void printTesterCount(int count) {
        System.out.println("Кол-во тестеров: " + count);
    }
}

