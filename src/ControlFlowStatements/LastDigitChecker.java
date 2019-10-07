package ControlFlowStatements;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int numberOne,int numberTwo, int numberThree){
        if(!isValid(numberOne) || !isValid(numberTwo) || !isValid(numberThree))
            return false;
        else {
            int lastDigOne=numberOne%10;
            int lastDigTwo=numberTwo%10;
            int lastDigThree=numberThree%10;
            if(lastDigOne==lastDigTwo || lastDigOne==lastDigThree || lastDigTwo==lastDigThree)
                return true;
            return false;
        }
    }
    public static boolean isValid (int rangeNumber){
        if (rangeNumber>=10 && rangeNumber<=1000)
            return true;
        return false;
    }

}
