// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package first_dz;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во чисел n : ");
        int number = in.nextInt();
        in.close();
        int sum_of_numbers = (number * (number + 1)) / 2;
        int product_of_numbers = 1;
        for (int i = 2; i <= number; i++) {
            product_of_numbers *= i;
        }
        System.out.printf("Сумма чисел от 1 до %d = %d", number, sum_of_numbers);
        System.out.printf("Произведение чисело от 1 до %d = %d \n", number, product_of_numbers);
    }
}