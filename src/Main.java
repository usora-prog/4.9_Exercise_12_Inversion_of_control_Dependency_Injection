import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a");
        double a = in.nextDouble();
        System.out.println("Введите число b");
        double b = in.nextDouble();

        System.out.print("Результат сложения a и b: ");
        Calculator calculator = new Calculator(new Adder());
        calculator.calc(a, b);

        System.out.print("Результат вычитания a и b: ");
        calculator = new Calculator(new Subtractor());
        calculator.calc(a, b);

        System.out.print("Результат умножения a и b: ");
        calculator = new Calculator(new Multiplier());
        calculator.calc(a, b);

        System.out.print("Результат деления a и b: ");
        calculator = new Calculator(new Divider());
        calculator.calc(a, b);
    }
}