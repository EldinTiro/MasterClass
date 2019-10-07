package ControlFlowStatements;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0)
            return -1;
        else {
            int digit;
            while (number > 0) {
                if (number % 2 == 0) {
                    digit = number % 10;
                    sum += digit;
                }
                number /= 10;

            }
            return sum;
        }
    }
}
