package calculator_project;

public class Addition extends Calculator {
    @Override
    public void addition(double firstNumber, double secondNumber) {
        Calculator calculator = new Addition();
        double result = firstNumber + secondNumber;
        System.out.println("Сложение чисел " + firstNumber + " и " + secondNumber + " = " + result);
    }
}
