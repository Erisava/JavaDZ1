/*Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */

package Java.DZ1;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Произведение чисел от 1 до " +i+ ": %d\n", giveMeNumber(i));
        iScanner.close();
    }

    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}