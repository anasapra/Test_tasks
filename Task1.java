import java.util.Scanner;
//Составить алгоритм: если введенное число больше 7, то вывести “Привет”

public class Task1 {
    public static void main(String[] args) {
        do {
            System.out.println("Введите целое число");

            Scanner sc = new Scanner(System.in);
            int d = sc.nextInt(); //чтение целого числа в переменную d
            if (d <= 7) {
                System.out.println("Введите число больше семи");
            } else if (d > 7) {
                System.out.println("Привет!");
                break;
            } else {
                break;
            }
            //

        } while (true);

    }
}

// do {
//         System.out.println("Введите координаты в формате X Y");
//         x = readInt(scanner) - 1;
//         y = readInt(scanner) - 1;
//
//         if (x == -1 || y == -1) {
//         System.out.println("Координаты должны быть числом!");
//         scanner.nextLine();
//         } else if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
//        System.out.println("Данные введены некорректно!");
//        } else if (map[x][y] != DOT_EMPTY) {
//        System.out.println("Клетка уже занята!");
//        } else {
//        break;
//        }
//        } while (true);