import java.util.Scanner;

// -------------------------------
// Задание 1. Вывод чисел от 1 до N (for)
// -------------------------------
class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        System.out.println("Числа от 1 до " + n + ":");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}


// -------------------------------
// Задание 2. Сумма чисел от 1 до N (while)
// -------------------------------
class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Сумма чисел от 1 до " + n + " равна: " + sum);

        scanner.close();
    }
}


// -------------------------------
// Задание 3. Факториал числа (for)
// -------------------------------
class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Факториал числа " + n + " равен: " + factorial);

        scanner.close();
    }
}


// -------------------------------
// Задание 4. Чётные числа от 1 до 100 (while + continue)
// -------------------------------
class Task4 {
    public static void main(String[] args) {

        int i = 1;

        System.out.println("Чётные числа от 1 до 100:");

        while (i <= 100) {

            if (i % 2 != 0) {
                i++;
                continue;
            }

            System.out.print(i + " ");
            i++;
        }
    }
}


// -------------------------------
// Задание 5. Ввод чисел до 0 (do-while)
// -------------------------------
class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.println("Вводите числа (0 для завершения):");

        do {
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Сумма введённых чисел равна: " + sum);

        scanner.close();
    }
}