import java.util.Scanner;

public class zadanie2_8_1 {
    //2. Вернемся к первоначальному виду (рис. 1). И изменим его, сделаем как на рисунке 3.
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
        String answer = x > y ? "икс больше, чем игрик" : "икс <= чем игрик";
        System.out.println(answer);
        System.out.println("Ответ на задание: см. пример в коде.");
    }
}