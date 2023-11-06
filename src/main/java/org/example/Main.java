package org.example;

import animals_project.aqua.Shark;
import animals_project.base.Animal;
import animals_project.common.Color;
import animals_project.common.Food;
import animals_project.common.Legs;
import animals_project.common.Sound;
import animals_project.mammals.Bear;
import animals_project.mammals.Cat;
import math.MathPrograms;
import bank_contribution.DepositCalculation;

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
        Animal bear = new Bear();
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

        System.out.println(shark.getName() + "\n" + shark.getDescription() + "\n");

    }

}