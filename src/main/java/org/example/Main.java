package org.example;

import animal_project_base.common.enn.ActionEnn;
import animal_project_base.common.enn.AnimalEnn;
import animal_project_base.common.factory.AnimalFactory;
import animals_project_decorator.aqua.Shark;
import animals_project_decorator.base.Animal;
import animals_project_decorator.common.Color;
import animals_project_decorator.common.Food;
import animals_project_decorator.common.Legs;
import animals_project_decorator.common.Sound;
import animals_project_decorator.mammals.Bear;
import animals_project_decorator.mammals.Cat;
import calculator_project.*;

public class Main {
    public static void main(String[] args) {

 /*       MathPrograms mathPrograms = new MathPrograms();
        DepositCalculation depositCalculation = new DepositCalculation();

        mathPrograms.getOnlyEventNumbers(30);
        mathPrograms.arrayReverse(" before program will start");
        mathPrograms.getStarProgram(3, 6);
        mathPrograms.getMax(10,999);
        mathPrograms.getFactorial(8);
        int factorial = mathPrograms.getRecursionFactorial(8);

        System.out.println("Факториал вычисления через рекурсию равен " + factorial);

        depositCalculation.calculating();
        */
        /*Animal bear = new Bear();
        bear = new Legs(bear);
        bear = new Food(bear);
        bear = new Sound(bear);
        bear = new Color(bear);

        System.out.println(bear.getName()  + "\n" + bear.getDescription() + "\n");

        Animal cat = new Cat();
        cat = new Legs(cat);
        cat = new Food(cat);
        cat = new Sound(cat);
        cat = new Color(cat);

        System.out.println(cat.getName() + "\n" + cat.getDescription() + "\n");

        Animal shark = new Shark();
        shark = new Legs(shark);
        shark = new Food(shark);
        shark = new Sound(shark);
        shark = new Color(shark);

        System.out.println(shark.getName() + "\n" + shark.getDescription() + "\n");*/

        AnimalFactory factory = new AnimalFactory();

        System.out.println(factory.getAnimal(AnimalEnn.BEAR, ", он Бурого цвета", ", а кушать любит рыбу"));

        System.out.println(factory.getAnotherAnimal(AnimalEnn.BEAR, ", он Бурого цвета", ", а кушать любит рыбу"));


        Calculator addition = new Addition();
        addition.getResult(10, "+", 10);

        Calculator division = new Division();
        division.getResult(10, "/", 10);

        Calculator multiplication = new Multiplication();
        multiplication.getResult(10, "*", 10);

        Calculator subtraction = new Subtraction();
        subtraction.getResult(10, "-", 10);

    }

}