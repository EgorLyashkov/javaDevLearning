package calculator_project;

public class Division extends Calculator{
    @Override
    public void division(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        System.out.println("Деление чисел " + firstNumber + " и " + secondNumber + " = " + result);
    }
}
