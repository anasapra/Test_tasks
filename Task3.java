
//3.  на входе есть числовой массив, необходимо вывести элементы массива, кратные 3;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 12, 4, 6, 4, 8, 9};
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value % 3 == 0)
                System.out.print(value + " ");
        }
    }
}



