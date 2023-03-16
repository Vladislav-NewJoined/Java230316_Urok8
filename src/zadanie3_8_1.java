import java.util.Scanner;

public class zadanie3_8_1 {
    // 3.Сделаем поиск максимального числа из 3 введенных, используя тернарный оператор (рис.5).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter x, y, z:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int max;
        boolean xMax = x > y && x > z;
        boolean yMax = y > x && y > z;
        max = xMax ? x : (yMax ? y : z);

        System.out.println("Max is: " +  max);
    }
}
