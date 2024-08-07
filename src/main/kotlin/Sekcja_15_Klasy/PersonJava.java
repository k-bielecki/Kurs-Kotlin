package main.kotlin.Sekcja_15_Klasy;

class PersonJava {

    String name;
    String lastName;
    int age;
    String adress;

    PersonJava(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    PersonJava(String name, String lastName, int age) {
        this(name, lastName);
        this.age = age;
    }

    PersonJava(String name, String lastName, int age, String adress) {
        this(name, lastName, age);
        this.adress = adress;
    }
}
