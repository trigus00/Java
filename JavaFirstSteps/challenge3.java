package Java.JavaFirstSteps;

public class Challenge3 {

    public static void main(String[] args) {
        
    
    // initailize my variable 
    double myFistVariable = 20.00d;
    double mySecondVariable = 80.00d;
    
    // Operands and Operator 
    double myValue = ((myFistVariable + mySecondVariable) * 100.00d );
    double myRemainder =  (myValue % 40.00d) ; 
    
    // print statement 
    System.out.println("MyValue: " + myValue);
    System.out.println("Remainder: " + myRemainder);

    // Conditional operator 

    boolean noRemainder = (myRemainder == 0) ? true : false ;
    if(noRemainder){

        System.out.println("The remainder is 0 !");
    }

     
    
    if(!noRemainder){
        System.out.println("Got some remaidner !");
    }


    }
    
}
