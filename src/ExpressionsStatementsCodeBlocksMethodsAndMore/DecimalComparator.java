package ExpressionsStatementsCodeBlocksMethodsAndMore;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo)
    {
        if((int)numberOne==(int)numberTwo){
            if ((int)(numberOne*10)==(int)(numberTwo*10))
            {
                if ((int)(numberOne*100)==(int)(numberTwo*100)){
                    if ((int)(numberOne*1000)==(int)(numberTwo*1000))
                    {
                        return true;
                    }else return false;
                }else return false;
            }else return false;
        }else return false;

    }
}
