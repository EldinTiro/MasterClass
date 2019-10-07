package ControlFlowStatements;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){

        int palindrom = 0;
        int copyNumber = number;
        while (copyNumber!=0){
            int reverse = copyNumber%10;
            copyNumber/=10;
            palindrom*=10;
            palindrom+=reverse;
        }
        if (number==palindrom)
            return true;
        else    return false;
    }
}
