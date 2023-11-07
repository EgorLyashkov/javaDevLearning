package calculator_project;

public class Multiplication extends Calculator {

    @Override
    public void multiplication(double firstNumber, double secondNumber) {

        double result = firstNumber * secondNumber;
        System.out.println("Умножение чисел " + firstNumber + " и " + secondNumber + " = " + result);

    }
}
