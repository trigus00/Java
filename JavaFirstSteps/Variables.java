package Java.JavaFirstSteps;
public class Variables {
    public static void main(String [] args) {
        System.out.println("Hello, Gus");
        
        int myFirstNumber = (5 + 10) + (2*10) ; 
        int mySecondNumber = 12; 
        int myThirdNumber = myFirstNumber * 2;
        int sum = mySecondNumber + myThirdNumber+ myFirstNumber;
        int myLastOne = 1000 - sum; 

        

        System.out.println("My first number is: "+myFirstNumber);
        System.out.println("Sum of 2 numbers is:" + sum);
        System.out.println("My last one: " + myLastOne);

    }
    
}
