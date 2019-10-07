package ControlFlowStatements;

public class NumberToWords {
    public static void numberToWords(int number){
        if (number<0)
            System.out.println("Invalid Value");
        else {
            int reverseNumber=reverse(number);
            int count = getDigitCount(number);
            if(reverseNumber==0)
                System.out.println("Zero");
            else{
            while(count>0){
                //System.out.println("U foru sam, ovo je count"+count+" a ovo je reverseNumber"+reverseNumber);
                if (reverseNumber % 10 == 0)
                    System.out.println("Zero");
                else if (reverseNumber % 10 == 1)
                    System.out.println("One");
                else if (reverseNumber % 10 == 2)
                    System.out.println("Two");
                else if (reverseNumber % 10 == 3)
                    System.out.println("Three");
                else if (reverseNumber % 10 == 4)
                    System.out.println("Four");
                else if (reverseNumber % 10 == 5)
                    System.out.println("Five");
                else if (reverseNumber % 10 == 6)
                    System.out.println("Six");
                else if (reverseNumber % 10 == 7)
                    System.out.println("Seven");
                else if (reverseNumber % 10 == 8)
                    System.out.println("Eight");
                else if (reverseNumber % 10 == 9)
                    System.out.println("Nine");

                reverseNumber /= 10;
                count--;
            }
            }

        }
    }
    public static int reverse(int number){
        int reverseNumber=0;
        int digit=0;
        if(number/10==0)
            return number;
        else {
            for (int i = number; i != 0; i/=10) {
                digit = i % 10;
                reverseNumber *= 10;
                reverseNumber += digit;

            }
        return reverseNumber;
        }
    }
    public static int getDigitCount(int number){
        if (number<0)
            return -1;
        else {
            int count=1;
            for (int i = number; i!=0; i/=10 ) {
                if (i / 10 != 0)
                    count++;
            }
            return count;
        }
    }
}
