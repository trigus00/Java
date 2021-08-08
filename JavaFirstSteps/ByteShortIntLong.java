package Java.JavaFirstSteps;

public class ByteShortIntLong {
    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        // Integer max and Min  
        System.out.println("Integer Minimum: " + myMinIntValue);
        System.out.println("Integer Maximun: " + myMaxIntValue + "\n");
        // Under and Overflow , Not what we want 
        System.out.println("Busted Max value: " + (myMaxIntValue +1)); 
        System.out.println("Busted Min value: " + ( myMinIntValue - 1+ "\n")); 
        // byte max and min 
        byte  myMinByteValue = Byte.MIN_VALUE;
        byte  myMaxByteValue = Byte.MAX_VALUE; 

        System.out.println("Byte Min: " + myMinByteValue);
        System.out.println("Byte Max: " + myMaxByteValue+ "\n");

        // Short max and min 

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum value: " + myMinShortValue);
        System.out.println("Short Maximum value: " + myMaxShortValue+ "\n");
        
        // Long max and min value 
        long myLongValue = 100L; 

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum value: " + myMinLongValue);
        System.out.println("Long Maximum value: " + myMaxLongValue+ "\n");
    
        // casting 
        int myTotal = (myMinIntValue/2);
        byte mynewByteValue = (byte)(myMinByteValue/2); 
        short myNewShortValue = (short) (myMinShortValue/2); 

    }

    
}
