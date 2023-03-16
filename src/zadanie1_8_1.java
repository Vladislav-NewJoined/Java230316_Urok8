import java.util.Scanner;

public class zadanie1_8_1 {
    //1. Посмотрим и узнаем как можно написать программу проверки чисел гораздо меньше
    public static void main(String[] args) {

        /* Было:
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        System.out.println("Max is " + max);

        Стало: */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int max = x > y ? x : y;
        System.out.println("Max is " + max);
        System.out.println("Ответ на задание: см. пример в коде.");
    }
}