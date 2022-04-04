/*1. Write a java program using the following descriptions
        1. Create one package with name calculate
        2. Create two class with name “Calculator” and “Main”
        3. Create four methods with manes “addition”, “subtraction”, “division”,
        and “multiplication”. All methods are instance method and it doesn’t
        return anything. But it has two parameters with name “int a” and “int
        b”. Also each method have System.out.println(). This prints the result.
        Also create all one more method with name “calculateResult” with
        three parameter with name int a, int b and char symbol. Write the logic
        in calculateResult method that when user enter first number and
        second number and symbol based on symbol it does calculate.*/

package calculate;

public class Calculator {
    int add, sub, div, mul;
    char c;

    public void addition(int a, int b) {
        System.out.println(add);
    }

    public void subtraction(int a, int b) {
        System.out.println(sub);
    }

    public void division(int a, int b) {
        System.out.println(div);
    }

    public void multiplication(int a, int b) {
        System.out.println(mul);
    }

    public void calculateResult(int a, int b, char c) {
        if (c == '+') {
            int add = a + b;
            System.out.println(add);

        } else if (c == '-') {
            int sub = a - b;
            System.out.println(sub);
        } else if (c == '/') {
            double div = a / b;
            System.out.println(div);
        } else if (c == '*') {
            int mul = a * b;
            System.out.println(mul);
        } else {
            System.out.println("invalid symbol");
        }
    }

}
