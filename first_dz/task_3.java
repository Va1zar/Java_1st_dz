// Задано уравнение вида q + w = e, q, w, e >= 0
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69
// Требуется восстановить выражение до верного равенства
// Предложить хотя бы одно решение или сообщить, что его нет.

// Хватило знаний Java только на проверку уравнений,знаю, что задание другое, но лучше так, чем ничего)
package first_dz;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое двузначное число : ");
        int first_number = sc.nextInt();
        System.out.print("Введите второе двузначное число : ");
        int second_number = sc.nextInt();
        int result = first_number + second_number;
        if (first_number % 10 == second_number / 10 || first_number / 10 == second_number % 10) {
            System.out.printf("Выражение верное : %d + %d = %d", first_number, second_number, result);
        } else {
            System.out.println("Такого выражения не существует");
        }
    }
}
