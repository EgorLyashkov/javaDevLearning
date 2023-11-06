package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MathPrograms {
    private final String[] treeDom = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    /**
     * "Программа выводит список, а затем переворачивает его"
     */

    public void arrayReverse(String text) {
        System.out.println("Let started program with cycle \"for each\"");
        System.out.println("Выводим изначальный список: \n" + Arrays.toString(treeDom) + "\n");

        Collections.reverse(Arrays.asList(treeDom));

        for (String seconds : treeDom) {
            System.out.println(seconds + text);
        }
        System.out.println("\n" + "А теперь в обратном порядке: \n" + Arrays.toString(treeDom));
        System.out.println("\n");
    }

    /**
     * "Программа выводит только четные числа"
     */
    public void getOnlyEventNumbers(int initialization) {
        System.out.println("Выводим заданное число для формирования списка: " + initialization);
        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> finalList = new ArrayList<>();

        for (int i = 1; i <= initialization; i++) {
            firstList.add(i);
        }

        System.out.println("Выводим сформированный список: \n" + firstList);

        for (int j : firstList) {
            if (0 == j % 2) {
                finalList.add(j);
            }
        }
        System.out.println("Выводим результат работы программы: \n" + finalList + "\n");

    }

    /**
     * "Программа выводит звездочки"
     */
    public void getStarProgram(int matrixLeight, int fieldLeight) {
        String[][] result = new String[matrixLeight][fieldLeight];

        for (int field = 0; field < matrixLeight; field++) {
            for (int number = 0; number < fieldLeight; number++) {
                result[field][number] = "*";
            }
        }
        System.out.println(Arrays.deepToString(result)
                .replace("[", "")
                .replace("]", "\n")
                .replace(",", "")
                .replace(" ", ""));
    }


    /**
     * "заполняем массив рандомными значениями и ищем наибольшее"
     */
    public void getMax(int lengthOfArray, int max) {
        int maxNumber = 0;
        int[] list = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            int num = (int) (Math.random() * max);
            list[i] = num;
        }

        System.out.println(Arrays.toString(list));

        for (int i = 0; i <= lengthOfArray - 1; i++) {
            maxNumber = list[i];
            for (int j = 0; j <= lengthOfArray - 1; j++) {
                if (maxNumber <= list[j]) {
                    maxNumber = list[j];
                }
            }
        }
        System.out.println("Максимальное значение из цикла = " + maxNumber);

        int maxNumberByStream = Arrays.stream(list).max().getAsInt();

        System.out.println("Максимальное значение из стрима = " + maxNumberByStream);
    }

    /**
     * "Вычисляем факториал обычным способом"
     */
    public void getFactorial (int factorial) {
        int result = 1;
        for (int i = 1; i <= factorial; i++) {
            result = result * i;
        }
        System.out.println("Факториал числа " + factorial + " равен " + result);
    }

    /**
     * "Вычисляем факториал через рекурсию"
     */
    public int getRecursionFactorial(int factorial) {
        if(factorial <= 1) {
            return 1;
        }
        else {
            return factorial * getRecursionFactorial(factorial -1);
        }
    }

}
