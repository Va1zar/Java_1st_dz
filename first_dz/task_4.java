// Вводится массив (сначала количество элементов, потом сами элементы)
// Найдите сумму его элементов с чётными индексами и выведите её
// А потом выведите числа, которые суммировались.

package first_dz;

import java.util.Scanner;;

public class task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите кол-во элементов массива : ");
        int arr_size = sc.nextInt(); // задаем длину массива
        int arr[] = new int[arr_size]; // создаем массив длины arr_size
        System.out.print("Введите элементы массива : ");
        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextInt(); // заполняем массив с клавы элементами
        }
        for (int i = 0; i < arr_size; i++) {
            System.out.printf(" " + arr[i]); // Выводим на экран, полученный массив
        }
        int sum = 0;
        for (int i = 0; i < arr_size; i += 2) {
            sum += arr[i];
        }
        System.out.printf("\n Сумма элементов с четными индексами массива = %d \n", sum);
        sc.close();
    }
}
