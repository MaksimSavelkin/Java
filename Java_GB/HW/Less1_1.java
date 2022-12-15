// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package gb.Java_GB.HW;

import java.util.Scanner;

public class Less1_1 {
    public static void main(String[] args) {
        try (Scanner tru = new Scanner(System.in)) {
            System.out.println("Enter number");
            int number = Integer.parseInt(tru.nextLine());
            tru.close();
            int res = (number + 1) * number / 2;
            System.out.printf("Result is %d", res);
        }
    }
    
}