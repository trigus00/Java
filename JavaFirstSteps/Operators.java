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



    }
    
}
