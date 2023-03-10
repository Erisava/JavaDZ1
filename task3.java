/*Реализовать простой калькулятор
 */

package Java.DZ1;

import java.util.Scanner;
 
public class task3 {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        int num1 = getInt();   /*Метод int getInt() - должен считывать с консоли целое число и возвращать его */
        int num2 = getInt();
        char operation = getOperation();   /*Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /) */
        int result = calc(num1,operation,num2);
        System.out.println("Результат операции: "+result); /*Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(), передать все методу calc() и вывести на экран результат */
    }
 
    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }
 
    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }
 
    public static int calc(int num1, char operation, int num2){   /*Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation. */
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, getOperation(), num2);//рекурсия
        }
        return result;
    }
}
