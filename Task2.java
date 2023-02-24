import java.util.Scanner;

//2.если введенное имя совпадает с Вячеслав,то вывести “Привет,Вячеслав”,если нет,
//        то вывести"Нет такого имени"

public class Task2 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Пожалуйста,введите имя!");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("Вячеслав")) ;
            {
                System.out.println("Привет, " + name);
                break;
            }
        }
    }
}


