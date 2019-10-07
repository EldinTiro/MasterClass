package ExpressionsStatementsCodeBlocksMethodsAndMore;

public class TeenNumberChecker {
    public static boolean hasTeen(int numberOne, int numberTwo, int numberTree)
    {
        if((numberOne>=13 && numberOne<=19) || (numberTwo>=13 && numberTwo<=19) || (numberTree>=13 && numberTree<=19))
            return true;
        else return false;
    }

    public static boolean isTeen(int numberOne)
    {
        if(numberOne>=13 && numberOne<=19)
            return true;
        else return false;
    }
}
