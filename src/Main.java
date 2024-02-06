import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int num2 = scanner.nextInt();

        // Вывод суммы и разности
        System.out.println("Сумма: " + (num1 + num2));
        System.out.println("Разница: " + Math.abs(num1 - num2));

        // Вывод ряда чисел от минимального до максимального
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}