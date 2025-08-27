package tns_backend_training.Exception_Handling;

public class BasicTryCatch {
// This program is implementing basic try catch
    public static void main(String[] args) {
        try{
            int a = 258;
            int b = 0;
            int result = a/b;
            System.out.println("The result is: " + result);
        }

        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not valid");
        }

        }

    }




