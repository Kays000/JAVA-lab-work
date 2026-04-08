import java.util.Arrays;
import java.util.Random;

public class Labwork7 {

    static Random rand = new Random();

    // 1. Сумма отрицательных элементов A[20]
    public static void task1() {
        int[] A = new int[20];
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(100) - 50;
            if (A[i] < 0) sum += A[i];
        }

        System.out.println("1) Сумма отрицательных: " + sum);
    }

    // 2. Сумма положительных элементов B[15]
    public static void task2() {
        int[] B = new int[15];
        int sum = 0;

        for (int i = 0; i < B.length; i++) {
            B[i] = rand.nextInt(100) - 50;
            if (B[i] > 0) sum += B[i];
        }

        System.out.println("2) Сумма положительных: " + sum);
    }

    // 3. Произведение отрицательных A[12]
    public static void task3() {
        double[] A = new double[12];
        double prod = 1;

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextDouble() * 20 - 10;
            if (A[i] < 0) prod *= A[i];
        }

        System.out.println("3) Произведение отрицательных: " + prod);
    }

    // 4. Произведение положительных C[25]
    public static void task4() {
        int[] C = new int[25];
        long prod = 1;

        for (int i = 0; i < C.length; i++) {
            C[i] = rand.nextInt(20) - 10;
            if (C[i] > 0) prod *= C[i];
        }

        System.out.println("4) Произведение положительных: " + prod);
    }

    // 5. Среднее D[17]
    public static void task5() {
        int[] D = new int[17];
        double sum = 0;

        for (int i = 0; i < D.length; i++) {
            D[i] = rand.nextInt(100);
            sum += D[i];
        }

        System.out.println("5) Среднее: " + sum / D.length);
    }

    // 6. Сумма отрицательных по строкам A[10][10]
    public static void task6() {
        int[][] A = new int[10][10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                A[i][j] = rand.nextInt(100) - 50;
                if (A[i][j] < 0) B[i] += A[i][j];
            }
        }

        System.out.println("6) Суммы по строкам: " + Arrays.toString(B));
    }

    // 7. Сумма положительных по строкам B[5][5]
    public static void task7() {
        int[][] B = new int[5][5];
        int[] A = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                B[i][j] = rand.nextInt(50) - 25;
                if (B[i][j] > 0) A[i] += B[i][j];
            }
        }

        System.out.println("7) Суммы: " + Arrays.toString(A));
    }

    // 8. Произведение отрицательных по столбцам A[12][6]
    public static void task8() {
        int[][] A = new int[12][6];
        long[] prod = new long[6];
        Arrays.fill(prod, 1);

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = rand.nextInt(20) - 10;
                if (A[i][j] < 0) prod[j] *= A[i][j];
            }
        }

        System.out.println("8) Произведения: " + Arrays.toString(prod));
    }

    // 9. Произведение положительных диагонали
    public static void task9() {
        int[][] C = new int[5][5];
        int prod = 1;

        for (int i = 0; i < 5; i++) {
            C[i][i] = rand.nextInt(10) - 5;
            if (C[i][i] > 0) prod *= C[i][i];
        }

        System.out.println("9) Произведение диагонали: " + prod);
    }

    // 10. Среднее диагонали D[7][7]
    public static void task10() {
        int[][] D = new int[7][7];
        double sum = 0;

        for (int i = 0; i < 7; i++) {
            D[i][i] = rand.nextInt(100);
            sum += D[i][i];
        }

        System.out.println("10) Среднее диагонали: " + sum / 7);
    }

    // 11. Поменять max и min
    public static void task11() {
        int[] A = new int[25];
        for (int i = 0; i < A.length; i++) A[i] = rand.nextInt(100);

        int min = 0, max = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[min]) min = i;
            if (A[i] > A[max]) max = i;
        }

        int temp = A[min];
        A[min] = A[max];
        A[max] = temp;

        System.out.println("11) После обмена: " + Arrays.toString(A));
    }

    // 12. Сортировка
    public static void task12() {
        int[] B = new int[25];
        for (int i = 0; i < B.length; i++) B[i] = rand.nextInt(100);

        Arrays.sort(B);
        System.out.println("12) Отсортированный: " + Arrays.toString(B));
    }

    // 13. Среднее
    public static void task13() {
        int[] C = new int[20];
        double sum = 0;

        for (int i = 0; i < C.length; i++) {
            C[i] = rand.nextInt(100);
            sum += C[i];
        }

        System.out.println("13) Среднее: " + sum / C.length);
    }

    // 14. Сумма четных и нечетных
    public static void task14() {
        int[] D = new int[30];
        int even = 0, odd = 0;

        for (int i = 0; i < D.length; i++) {
            D[i] = rand.nextInt(100);
            if (D[i] % 2 == 0) even += D[i];
            else odd += D[i];
        }

        System.out.println("14) Четные: " + even + " Нечетные: " + odd);
    }

    // 15. Таблица 3x5
    public static void task15() {
        int[][] a = new int[3][5];

        System.out.println("15) Таблица:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = rand.nextInt(10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 16. maxX()
    public static int maxX(int[] array) {
        int max = array[0];
        for (int x : array) if (x > max) max = x;
        return max;
    }

    // 17. Строки
    public static void task17() {
        String s1 = "Hello ";
        String s2 = "World";
        String s3 = "Java";
        String s4 = "test";
        String s5 = "test";

        if (s4.equals(s5))
            System.out.println("17) " + s1 + s2);
        else
            System.out.println("17) " + s1 + s3);
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();

        int[] arr = {1, 5, 3, 9};
        System.out.println("16) max = " + maxX(arr));

        task17();
    }
}