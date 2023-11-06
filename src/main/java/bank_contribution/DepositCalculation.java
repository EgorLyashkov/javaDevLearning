package bank_contribution;

import java.util.Scanner;

public class DepositCalculation {

    private final float percent = 0.07F;
    Scanner in = new Scanner(System.in);
    public void calculating() {
        System.out.println("Введите сумму вклада: ");
        float deposit = in.nextFloat();

        float middle = deposit * percent;

        System.out.println("Введите срок вклада в месяцах: ");
        int month = in.nextInt();

        for(int i = 0; i < month; i++) {
            deposit += middle;
        }

        String format = String.format("%.6f", deposit);
        System.out.println("После " + month + " месяцев сумма вклада составит " + format);

    }
}
