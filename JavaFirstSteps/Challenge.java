package Java.JavaFirstSteps;

public class Challenge {
    
    public static void main(String[] args) {
        // initiate variables 
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        // long variables 
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);
        // using casting 
        short shortTotal = (short) (1000 + 10 * byteValue + shortValue + intValue);
        System.out.println(shortTotal);

    }
}
