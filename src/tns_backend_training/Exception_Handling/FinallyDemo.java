package tns_backend_training.Exception_Handling;

//Program to implement the FINALLY block in exception handling
public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Implementing Division By Zero Exception");
            int a = 100, b = 0;
            int res = a/b;
            System.out.println("The result is: " + res);


        }

        catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }

        finally{

            
            System.out.println();
            System.out.println("We can see that this program threw an exception yet this line is executed because of finally statement");

        }
    }

}
