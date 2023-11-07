package calculator_project;

public class Calculator implements CalculatorInterface{
    private int firstNumber;
    private int secondNumber;
    private String symbol;

    private double result;

    @Override
    public void getResult(double firstNumber, String symbol, double secondNumber) {
        if (symbol.equals("+")) {
            addition(firstNumber, secondNumber);
        }
        if (symbol.equals("-")) {
           subtraction(firstNumber,secondNumber);
        }
        if (symbol.equals("*")) {
            multiplication(firstNumber,secondNumber);
        }
        if (symbol.equals("/")) {
            division(firstNumber,secondNumber);
        }
    }

    public void addition(double firstNumber, double secondNumber){}


    public void subtraction(double firstNumber, double secondNumber) {}


    public void multiplication(double firstNumber, double secondNumber) {
        System.out.println("Сложение чисел " + firstNumber + " и " + secondNumber + " = " + result);

    }

    public void division(double firstNumber, double secondNumber) {
        System.out.println("Сложение чисел " + firstNumber + " и " + secondNumber + " = " + result);

    }
}
