package org.example;
public class Main {
    public static void main(String[] args) {
        String name = "ИМЯ";
        System.out.println("Hello, " + name);

        Tester tester = new Tester("Oleg", "Ivanov", 3, "C3", 2000);
        tester.displayInfo();
        tester.displayInfo(8);
        tester.displayInfo("C2");
        Tester.printTesterCount(5);
    }
}