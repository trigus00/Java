package Java.JavaFirstSteps;

public class FloatsAndDoubles {
    public static void main(String[] args)  {

        //Min and max Values for Floats 
         float myMinFloatValue = Float.MIN_VALUE;
         float myMaxFloatValue = Float.MAX_VALUE;
        //Min and Max Value for Doubles 
         double myMinDoubleValue = Double.MIN_VALUE;
         double myMaxDoubleValue = Double.MAX_VALUE; 
        
         System.out.println("Float Minimum value: " + myMinFloatValue);
         System.out.println("Float Maximum value: " + myMaxFloatValue+ "\n");

         System.out.println("Double Minimum value: " + myMinDoubleValue);
         System.out.println("Double Maximum value: " + myMaxDoubleValue + "\n" );
         
        int myIntValue = 5/3;
        //float myFloatValue = 5.25f;
        //Casting 
        float myFloatValue = (float) 5 / 3f;
        double myDoubleValue = 5d/3d;

        //Precision with all primative values 
        System.out.println("My IntValue: " + myIntValue);
        System.out.println("My FloatValue: " + myFloatValue);
        System.out.println("My DoubleValue: " + myDoubleValue); 




        
    }
    
}
