/*4. Write a “main” method into main class. It has scanner that takes user
        input. Also write the logic that it ask user to “Enter first Number:”,
        “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
        enter + symbol result like “Addition of 5 and 10 is: 15” and respective
        for other symbol.
        5. With the result it’s also print one more message “Would you like to do
        more calculation Please enter “Y” or “N” :” (Hint use while loop if user
        enter Y program asking the user to enter First Number, and if user enter
        N programme should terminate)*/
package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int x = scr.nextInt();
        System.out.println("Enter the second number :");
        int y = scr.nextInt();
        System.out.println("Please enter one of the symbol +,-,*,/ :");
        char z = scr.next().charAt(0);
        Main t = new Main();
        t.calculateResult(x, y, z);
        System.out.println("Would you like to do more calculation Please enter Y or N :");
        char v = scr.next().charAt(0);
        while (v == 'y' || v == 'Y') {
            System.out.println("Enter the first number :");
            int x1 = scr.nextInt();
            System.out.println("Enter the second number :");
            int y1 = scr.nextInt();
            System.out.println("Please enter one of the symbol +,-,*,/ :");
            char z1 = scr.next().charAt(0);
            Main t1 = new Main();
            t.calculateResult(x1, y1, z1);
            System.out.println("Would you like to do more calculation Please enter Y or N :");
            char v1 = scr.next().charAt(0);
            v = v1;
        }
    }
}
