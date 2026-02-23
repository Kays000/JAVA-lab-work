import java.util.Scanner;
public class LabWork6 {
    // ===== Методы =====
    public static double rectangleArea(double width, double height) {
        return width * height;
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }
    public static long factorial(int n) {
        if (n < 0) return -1;
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    public static long power(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * power(base, exponent - 1);
    }
    public static void LabWork6(String[] args) {5
        Scanner sc = new Scanner(System.in);
        // ---------- Задание 1 ----------
        System.out.print("Задание 1. Введите ширину: ");
        double width = sc.nextDouble();
        System.out.print("Введите высоту: ");
        double height = sc.nextDouble();
        double area = rectangleArea(width, height);
        System.out.println("Площадь прямоугольника: " + area);

        // ---------- Задание 2 ----------
        System.out.print("\nЗадание 2. Введите число: ");
        int number = sc.nextInt();
        boolean even = isEven(number);
        System.out.println(even ? "Число четное" : "Число нечетное");

        // ---------- Задание 3 ----------
        System.out.print("\nЗадание 3. Введите два целых числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Максимум (int): " + max(a, b));

        System.out.print("Введите два дробных числа: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println("Максимум (double): " + max(x, y));

        // ---------- Задание 4 ----------
        System.out.print("\nЗадание 4. Введите число для факториала: ");
        int n = sc.nextInt();
        long fact = factorial(n);
        if (fact == -1)
            System.out.println("Факториал отрицательного числа не определён");
        else
            System.out.println("Факториал: " + fact);

        // ---------- Задание 5 ----------
        System.out.print("\nЗадание 5. Введите основание: ");
        int base = sc.nextInt();
        System.out.print("Введите степень: ");
        int exponent = sc.nextInt();
        long result = power(base, exponent);
        System.out.println("Результат степени: " + result);

        sc.close();
    }
}