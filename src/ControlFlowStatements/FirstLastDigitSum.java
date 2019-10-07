package ControlFlowStatements;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int sum=0;
        if (number<0)
            return -1;
        else {
            int lastDigit=number%10;
            int firstDigit=0;

         while (number>0){
             if(number/10==0)
             firstDigit=number%10;
             number/=10;

         }
            return sum=lastDigit+firstDigit;
        }
    }
}
