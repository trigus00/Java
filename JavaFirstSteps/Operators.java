package Java.JavaFirstSteps;

public class Operators {
    public static void main(String[] args) {

        int result = 1+2; //1+2 =3 Operand(1 & 2) and operator(+)
        System.out.println("Result: " + result);
        int previousResult = result; 
        System.out.println("previousResult = " + previousResult);
        result = previousResult -1 ; // 3-1 =2
        System.out.println("new Result: " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; 
        System.out.println("2 * 10: " + result );

        result =result /5 ; //20/5=4
        System.out.println("20 / 4 : " + result );

        result = result%2; // 4%2 = 0 the remainder of 4 divided by 2 
        System.out.println("4 % 2 : " + result);

        // result  abbreviation 
        result ++; // 0+1 = 1 
        System.out.println("0+1" +result);
        
        result -- ; // 1-1 = 0 
        System.out.println("1-1: " +result);

        result +=2 ; // result = result + 2 

        System.out.println("0+2: " +result);

        result *=10 ; // result 2*10 = 20 
        System.out.println("2 * 10: " + result);

        result /=2 ; // result  20/2 = 10 

        System.out.println("20 / 2: " + result);

        result -=2 ; // result = 10 - 2 

        System.out.println("10 - 2: " +result);

        // if-statement 
        boolean isAlien = false;

        if(isAlien == false) {

            // I'm a code block for the if-statement 
            System.out.println("It is not an alien! ");
        }

        //if-statement logic and operator 
        int topSpcore = 80;

        if (topSpcore < 100 ){

            System.out.println("You got the high score !");

        }

        //logical AND operator both condition to be true 
        int secondTopScore = 91; 
        if((topSpcore > secondTopScore) && (topSpcore <100)){
            System.out.println("Greater than second top score and less than 100");
        }

        //logical OR operator, one condition must be true
        if( (topSpcore >90) || (secondTopScore <=90) ){
            System.out.println("Either ot both of the condition are true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.err.println("This is true");
        }

        boolean isCar = false ; 
        if(isCar){
            System.out.println("This is not suppose to happen ");

        }
        //ternary
        isCar=true;
        boolean wasCar = isCar ? true : false; 
        
        if(wasCar){
            System.out.println("wasCar is true");
            
        }

    }
    
}
