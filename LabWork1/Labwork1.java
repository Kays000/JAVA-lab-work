import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО студента: ");
        String fullName = scanner.nextLine();

        System.out.print("Введите группу: ");
        String group = scanner.nextLine();

        System.out.print("Введите специальность: ");
        String specialty = scanner.nextLine();

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        System.out.println("\n--- Информация о студенте ---");
        System.out.println("ФИО: " + fullName);
        System.out.println("Группа: " + group);
        System.out.println("Специальность: " + specialty);
        System.out.println("Возраст: " + age + " лет");

        scanner.close();
    }
}
