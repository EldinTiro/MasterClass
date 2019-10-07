package ControlFlowStatements;

public class SharedDigit {
    public static boolean hasSharedDigit(int numberOne,int numberTwo) {
        if ((numberOne < 10 || numberOne > 99) || (numberTwo < 10 || numberTwo > 99))
            return false;
        else {
            while (numberOne > 0) {
                if ((numberOne % 10 == numberTwo % 10) || numberOne % 10 == (numberTwo / 10) % 10) {
                    return true;
                }
                numberOne = numberOne / 10;
            }
            return false;
        }
    }
}
