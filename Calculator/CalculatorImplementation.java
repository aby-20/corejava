public class CalculatorImplementation implements Calculator {
public int addition(int a, int b) {
return a + b;
}

public int subtraction(int a, int b) {
return a - b;
}

public int multiplication(int a, int b) {
return a * b;
}

public int division(int a, int b) throws DivisionByZeroException {
if (b == 0) {
throw new DivisionByZeroException("Cannot divide by zero");
}
return a / b;
}
}