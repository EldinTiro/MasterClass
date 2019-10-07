package ControlFlowStatements;

public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }

        int factor = 0;

        for(int i = number; i >= 2; i--){
            if(number%i == 0){
                factor = i;
                int count = 0;
                for(int j = 1; j <= factor; j++){
                    if(factor%j == 0){
                        count++;
                    }
                }
                if(count == 2){
                    return factor;
                }
            }
        }
        return factor;
    }
}
