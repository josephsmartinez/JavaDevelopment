public class Main {

    public static void main(String[] args){
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Values = " + myMinIntValue);
        System.out.println("Integer Maximum Values = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));

        int myMaxIntTest = 2_147_483_647;
        byte myMinByteValue  = Byte.MIN_VALUE;
        byte myMaxByteValue  = Byte.MAX_VALUE;

        byte someByteToCast = 100;
        int someInt = (int) someByteToCast;

    }

}


