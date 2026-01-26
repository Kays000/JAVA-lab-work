// ===== Задача 1, 2, 3, 4, 5 в одном проекте =====

// Базовый класс
class Person {
    String name;   // поле класса
    int age;       // поле класса

    void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}

// Производный класс
class Student extends Person {
    String group;

    // Переопределение метода (Задача 5)
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Группа: " + group);
    }
}

public class Labwork2 {

    // поле класса (Задача 3)
    static int classVariable = 100;

    public static void main(String[] args) {

        // ===== Задача 1. Переменные и константы =====
        int a = 10;
        double b = 5.5;
        boolean isStudent = true;
        final int MAX_SCORE = 100;

        System.out.println("Переменные:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("isStudent = " + isStudent);
        System.out.println("Константа MAX_SCORE = " + MAX_SCORE);
        System.out.println();

        // ===== Задача 2. Примитивные и ссылочные типы =====
        int number = 25;            // примитивный тип
        String text = "Java";       // ссылочный тип

        System.out.println("Примитивный тип int: " + number);
        System.out.println("Ссылочный тип String: " + text);
        System.out.println();

        // ===== Задача 3. Область видимости =====
        int localVariable = 50; // локальная переменная

        System.out.println("Поле класса: " + classVariable);
        System.out.println("Локальная переменная: " + localVariable);
        System.out.println();

        // ===== Задача 4 и 5. Наследование и полиморфизм =====
        Person person = new Student(); // полиморфизм
        person.name = "Иван";
        person.age = 20;

        ((Student) person).group = "ИС-2204";

        // Вызов переопределённого метода
        person.displayInfo();
    }
}