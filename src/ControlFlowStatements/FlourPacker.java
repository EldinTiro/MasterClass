package ControlFlowStatements;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        else if(bigCount==0 && smallCount>=goal)
            return true;
        else {
            int bigCountValue=0;
            for (int i = 0; i < bigCount; i++) {
                bigCountValue+=5;
                if (bigCountValue>goal)
                    return false;
                else if((bigCountValue==goal)||bigCountValue+smallCount>=goal)
                    return true;

            }
            return false;

        }
    }
}
