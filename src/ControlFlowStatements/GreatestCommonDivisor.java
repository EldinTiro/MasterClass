package ControlFlowStatements;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10)
            return -1;
        else {
            int max,min;
            int maxCommonDivisor=0;
            if (first>second){
                max=first;
                min=second;
            }else {
                max=second;
                min=first;
            }
            for (int i = 1; i <=min; i++) {
                if(min%i==0 && max%i==0 )
                    maxCommonDivisor=i;
            }
            return maxCommonDivisor;
        }

    }
}
