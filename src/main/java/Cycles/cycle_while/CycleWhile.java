package Cycles.cycle_while;

public class CycleWhile {

    public void getWhileCycle (int var) {
        System.out.println("Let started program with cycle \"while\"");

        while(var > 0) {
            System.out.println(var + " before program will start");
            var--;
        }
        System.out.println("\n");
    }
}
