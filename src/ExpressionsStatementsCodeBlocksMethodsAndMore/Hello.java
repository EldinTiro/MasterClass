package ExpressionsStatementsCodeBlocksMethodsAndMore;

public class Hello {

public static void main (String [] args)
{

    System.out.println("This is call by the fuuu akak");

    long km = SpeedConverter.toMilesPerHour(23);
    //System.out.println("kms " + km);
    SpeedConverter.printConversion(75.114);

    MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);

    System.out.println(BarkingDog.shouldWakeUp(true,9));
}
}