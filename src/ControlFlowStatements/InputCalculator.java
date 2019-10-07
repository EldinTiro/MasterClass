package ControlFlowStatements;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAvarage()
    {
        int sum=0;
        long avg=0;
        int count=0;
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            boolean flag = scanner.hasNextInt();
            if (flag) {
                int inputNumber = scanner.nextInt();
                count++;
                sum += inputNumber;
                avg=Math.round((double)sum/count);
            }else break;

            scanner.nextLine();

        }
        scanner.close();
        System.out.println("SUM = "+sum+" AVG = "+avg);
    }
}
