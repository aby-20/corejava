import java.util.Scanner;

public class Test {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Calculator calc = new CalculatorImplementation();
String choice;
do {
System.out.println("\nChoose an operation: add, subtract, multiply, divide or exit");
choice = scanner.next().toLowerCase();

if (choice.equals("exit")) {
System.out.println("Exiting the calculator. Goodbye!");
break;
}

System.out.print("Enter first number: ");
int a = scanner.nextInt();

System.out.print("Enter second number: ");
int b = scanner.nextInt();

try {
switch (choice) {
case "add":
System.out.print("Result: " + calc.addition(a, b));
break;
case "subtract":
System.out.print("Result: " + calc.subtraction(a, b));
break;
case "multiply":
System.out.print("Result: " + calc.multiplication(a, b));
break;
case "divide":
System.out.print("Result: " + calc.division(a, b));
break;
default:
System.out.print("Invalid operation. Please try again.");
}
} catch (DivisionByZeroException e) {
System.out.print("Error: " + e.getMessage());
}

} while (true);

scanner.close();
}
}