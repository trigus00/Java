package Java.JavaFirstSteps;



public class Strings {
    public static void main(String[] args) {
        //Primetive types 
            //byte
            //shore
            //int
            //long
            //float
            //double
            //char
            //boolean

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        
        myString = myString + ", and this is more";
        System.out.println("myString is equal to " + myString);
        
        myString += " \u00A9 2019";
        System.out.println("myString is eqaul to " + myString);
       
        String numbeString = "250.55";
        numbeString += "49.95";
        System.out.println(numbeString);
        
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is eqaul to " + lastString);
        double doubleNumber = 120.47d; 
        lastString = lastString + doubleNumber;
        System.out.println("LastString is eqaul to " + lastString);

        
    }
    
}
