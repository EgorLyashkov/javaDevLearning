package Cycles.cycle_while;

import java.util.Scanner;

public class CycleDoWhile {

    Scanner in = new Scanner(System.in);
    String input;
    public void getDoWhileCycle(int var) {
        System.out.println("Let started program with cycle \"do while\"");

        do{
            System.out.println(var + " before program will start");
            var--;
            if(var == 0){
                System.out.println("\n" + "------------------------------------------Hello world---------------------------------------------");
                break;
            } else if (var < 0){
                break;
            }
            System.out.println("program is ready? (y/n)");
            input = in.next();
        }
        while(input.equals("n"));
    }
}
