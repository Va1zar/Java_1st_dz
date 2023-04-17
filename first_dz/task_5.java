// Дан список. Выведите те его элементы, которые встречаются в списке только один раз
// Элементы нужно выводить в том порядке, в котором они встречаются в списке.

package first_dz;

import java.util.Random;
import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Random random = new Random(); // рандомное заполнение массива
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите кол-во элементов массива : ");
        int arr_size = sc.nextInt();
        int[] arr = new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            arr[i] = random.nextInt(11); // рандомные числа до 10, не включая 11
        }
        for (int i = 0; i < arr_size; i++) {
            System.out.print(" " + arr[i]);
        }
        sc.close();
    }
}