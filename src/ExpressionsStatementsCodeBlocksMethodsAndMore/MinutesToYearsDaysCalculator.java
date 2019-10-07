package ExpressionsStatementsCodeBlocksMethodsAndMore;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes<0)
            System.out.printf("Invalid Value");
        else {
            int years = (int)(minutes/525600);
            int remainingMinutes = (int)(minutes%525600);
            int days = remainingMinutes/1440;
            System.out.printf(minutes+" min = "+years+" y and "+days+" d");
        }
    }
}
