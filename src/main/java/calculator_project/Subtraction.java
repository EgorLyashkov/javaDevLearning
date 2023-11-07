package calculator_project;

public class Subtraction extends Calculator{

    @Override
    public void subtraction(double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        System.out.println("Вычитание чисел " + firstNumber + " и " + secondNumber + " = " + result);

    }
}
