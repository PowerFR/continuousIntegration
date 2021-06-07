import java.util.Scanner;

public class Calculator {
    char operator;
    double number1, number2, result;

    public void Calculate()
    {
        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        this.operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        this.number1 = input.nextDouble();

        System.out.println("Enter second number");
        this.number2 = input.nextDouble();

        switch (this.operator) {

            // performs addition between numbers
            case '+' -> {
                this.result = this.number1 + this.number2;
                System.out.println(this.number1 + " + " + this.number2 + " = " + this.result);
            }

            // performs subtraction between numbers
            case '-' -> {
                this.result = this.number1 - this.number2;
                System.out.println(this.number1 + " - " + this.number2 + " = " + this.result);
            }

            // performs multiplication between numbers
            case '*' -> {
                this.result = this.number1 * this.number2;
                System.out.println(this.number1 + " * " + this.number2 + " = " + this.result);
            }

            // performs division between numbers
            case '/' -> {
                this.result = this.number1 / this.number2;
                System.out.println(this.number1 + " / " + this.number2 + " = " + this.result);
            }
            default -> System.out.println("Invalid operator!");
        }

        input.close();
    }
    }
