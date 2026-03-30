import java.util.*;

public class Lab11 {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> history = new ArrayList<>();

    // --- Методы (задание 3) ---
    public static double add(double a, double b) { return a + b; }
    public static double sub(double a, double b) { return a - b; }
    public static double mul(double a, double b) { return a * b; }

    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на 0!");
            return 0;
        }
        return a / b;
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static double sqrt(double a) {
        if (a < 0) {
            System.out.println("Ошибка: нельзя извлечь корень!");
            return 0;
        }
        return Math.sqrt(a);
    }

    public static double percent(double a, double b) {
        return (a / 100) * b;
    }

    public static double sin(double a) { return Math.sin(Math.toRadians(a)); }
    public static double cos(double a) { return Math.cos(Math.toRadians(a)); }
    public static double tan(double a) { return Math.tan(Math.toRadians(a)); }

    // --- Главная программа ---
    public static void main(String[] args) {

        while (true) { // Задание 2 (цикл)

            try {
                System.out.println("\n===== КАЛЬКУЛЯТОР =====");
                System.out.println("1 - Сложение");
                System.out.println("2 - Вычитание");
                System.out.println("3 - Умножение");
                System.out.println("4 - Деление");
                System.out.println("5 - Степень");
                System.out.println("6 - Корень");
                System.out.println("7 - Процент");
                System.out.println("8 - sin");
                System.out.println("9 - cos");
                System.out.println("10 - tan");
                System.out.println("11 - История");
                System.out.println("0 - Выход");

                System.out.print("Выбери действие: ");
                int choice = scanner.nextInt();

                if (choice == 0) {
                    System.out.println("Выход...");
                    break;
                }

                double a, b, result = 0;
                String record = "";

                switch (choice) {

                    case 1:
                        System.out.print("Введите первое число: ");
                        a = scanner.nextDouble();
                        System.out.print("Введите второе число: ");
                        b = scanner.nextDouble();
                        result = add(a, b);
                        record = a + " + " + b + " = " + result;
                        break;

                    case 2:
                        System.out.print("Введите первое число: ");
                        a = scanner.nextDouble();
                        System.out.print("Введите второе число: ");
                        b = scanner.nextDouble();
                        result = sub(a, b);
                        record = a + " - " + b + " = " + result;
                        break;

                    case 3:
                        System.out.print("Введите первое число: ");
                        a = scanner.nextDouble();
                        System.out.print("Введите второе число: ");
                        b = scanner.nextDouble();
                        result = mul(a, b);
                        record = a + " * " + b + " = " + result;
                        break;

                    case 4:
                        System.out.print("Введите первое число: ");
                        a = scanner.nextDouble();
                        System.out.print("Введите второе число: ");
                        b = scanner.nextDouble();
                        result = div(a, b);
                        record = a + " / " + b + " = " + result;
                        break;

                    case 5:
                        System.out.print("Введите число: ");
                        a = scanner.nextDouble();
                        System.out.print("Введите степень: ");
                        b = scanner.nextDouble();
                        result = power(a, b);
                        record = a + "^" + b + " = " + result;
                        break;

                    case 6:
                        System.out.print("Введите число: ");
                        a = scanner.nextDouble();
                        result = sqrt(a);
                        record = "√" + a + " = " + result;
                        break;

                    case 7:
                        System.out.print("Введите процент: ");
                        a = scanner.nextDouble();
                        System.out.print("Введите число: ");
                        b = scanner.nextDouble();
                        result = percent(a, b);
                        record = a + "% от " + b + " = " + result;
                        break;

                    case 8:
                        System.out.print("Введите угол: ");
                        a = scanner.nextDouble();
                        result = sin(a);
                        record = "sin(" + a + ") = " + result;
                        break;

                    case 9:
                        System.out.print("Введите угол: ");
                        a = scanner.nextDouble();
                        result = cos(a);
                        record = "cos(" + a + ") = " + result;
                        break;

                    case 10:
                        System.out.print("Введите угол: ");
                        a = scanner.nextDouble();
                        result = tan(a);
                        record = "tan(" + a + ") = " + result;
                        break;

                    case 11:
                        System.out.println("\nИстория вычислений:");
                        for (String h : history) {
                            System.out.println(h);
                        }
                        continue;

                    default:
                        System.out.println("Ошибка выбора!");
                        continue;
                }

                System.out.println("Результат = " + result);
                history.add(record); // Задание 10

            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Введи число.");
                scanner.nextLine();
            }
        }
    }
}