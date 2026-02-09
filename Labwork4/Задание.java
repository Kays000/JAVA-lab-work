import java.util.Scanner;

public class Задание {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------- Пример 1 ----------
        System.out.print("Пример 1. Введите число: ");
        int n1 = sc.nextInt();
        if (n1 > 0) System.out.println("Положительное");
        else if (n1 < 0) System.out.println("Отрицательное");
        else System.out.println("Ноль");

        // ---------- Пример 2 ----------
        System.out.print("\nПример 2. Введите балл (0-100): ");
        int score = sc.nextInt();
        if (score >= 90) System.out.println("Оценка: 5");
        else if (score >= 75) System.out.println("Оценка: 4");
        else if (score >= 60) System.out.println("Оценка: 3");
        else System.out.println("Оценка: 2");

        // ---------- Пример 3 ----------
        System.out.print("\nПример 3. Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        if (a > b) System.out.println("Первое больше");
        else if (a < b) System.out.println("Второе больше");
        else System.out.println("Числа равны");

        // ---------- Пример 4 ----------
        System.out.print("\nПример 4. Введите номер дня (1-7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Ошибка");
        }

        // ---------- Пример 5 ----------
        System.out.print("\nПример 5. Введите число: ");
        int n5 = sc.nextInt();
        if (n5 % 2 == 0) System.out.println("Чётное");
        else System.out.println("Нечётное");

        // ---------- Пример 6 ----------
        System.out.print("\nПример 6. Введите возраст: ");
        int age = sc.nextInt();
        if (age >= 18) System.out.println("Доступ разрешён");
        else System.out.println("Доступ запрещён");

        // ---------- Пример 7 ----------
        System.out.print("\nПример 7. Введите месяц (1-12): ");
        int month = sc.nextInt();
        switch (month) {
            case 1,3,5,7,8,10,12 -> System.out.println("31 день");
            case 4,6,9,11 -> System.out.println("30 дней");
            case 2 -> System.out.println("28 или 29 дней");
            default -> System.out.println("Ошибка");
        }

        // ---------- Пример 8 ----------
        System.out.print("\nПример 8. Введите температуру: ");
        int t = sc.nextInt();
        if (t < 0) System.out.println("Холодно");
        else if (t <= 25) System.out.println("Тепло");
        else System.out.println("Жарко");

        // ---------- Пример 9 ----------
        System.out.print("\nПример 9. Введите число: ");
        int n9 = sc.nextInt();
        if (n9 >= 10 && n9 <= 50)
            System.out.println("Входит в диапазон");
        else
            System.out.println("Не входит в диапазон");

        // ---------- Пример 10 ----------
        System.out.print("\nПример 10. Введите первое число: ");
        double x = sc.nextDouble();
        System.out.print("Введите второе число: ");
        double y = sc.nextDouble();
        System.out.print("Введите операцию (+ - * /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+' -> System.out.println("Результат: " + (x + y));
            case '-' -> System.out.println("Результат: " + (x - y));
            case '*' -> System.out.println("Результат: " + (x * y));
            case '/' -> {
                if (y != 0) System.out.println("Результат: " + (x / y));
                else System.out.println("Деление на ноль");
            }
            default -> System.out.println("Неверная операция");
        }
    }
}