import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String enterFirstName = scanner.next();
        String firstName = Character.toUpperCase(enterFirstName.charAt(0)) + enterFirstName.substring(1).toLowerCase();

        System.out.println("Введите отчество");
        String enterMiddleName = scanner.next();
        String middleName = Character.toUpperCase(enterMiddleName.charAt(0)) + enterMiddleName.substring(1).toLowerCase();

        System.out.println("Введите фамилию");
        String enterFullName = scanner.next();
        String fullName = Character.toUpperCase(enterFullName.charAt(0)) + enterFullName.substring(1).toLowerCase();

        System.out.println("ФИО  сотрудника - " + fullName + " " + firstName + " " + middleName);
    }

    public static void task2() {
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String enterFirstName = scanner.next();
        String firstName = Character.toUpperCase(enterFirstName.charAt(0)) + enterFirstName.substring(1).toLowerCase();

        System.out.println("Введите отчество");
        String enterMiddleName = scanner.next();
        String middleName = Character.toUpperCase(enterMiddleName.charAt(0)) + enterMiddleName.substring(1).toLowerCase();

        System.out.println("Введите фамилию");
        String enterFullName = scanner.next();
        String fullName = Character.toUpperCase(enterFullName.charAt(0)) + enterFullName.substring(1).toLowerCase();

        System.out.println("ФИО  сотрудника - " + fullName.toUpperCase() + " " + firstName.toUpperCase() + " " + middleName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String enterFirstName = scanner.next();
        String firstName = Character.toUpperCase(enterFirstName.charAt(0)) + enterFirstName.substring(1).toLowerCase();
        firstName = firstName.replace('ё', 'е');
        firstName = firstName.replace('Ё', 'Е');

        System.out.println("Введите отчество");
        String enterMiddleName = scanner.next();
        String middleName = Character.toUpperCase(enterMiddleName.charAt(0)) + enterMiddleName.substring(1).toLowerCase();
        middleName = middleName.replace('ё', 'е');
        middleName = middleName.replace('Ё', 'Е');

        System.out.println("Введите фамилию");
        String enterFullName = scanner.next();
        String fullName = Character.toUpperCase(enterFullName.charAt(0)) + enterFullName.substring(1).toLowerCase();
        fullName = fullName.replace('ё', 'е');
        fullName = fullName.replace('Ё', 'Е');

        System.out.println("ФИО  сотрудника - " + fullName + " " + firstName + " " + middleName);
    }
}