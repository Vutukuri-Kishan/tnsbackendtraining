package tns_backend_training.Exception_Handling;
//Program to implement the MAIN function of ThrowDemo
public class ThrowDemoMain {
    public static void main(String[] args) {
        
        try{
            ThrowDemo.Checkage(24); 
            ThrowDemo.Checkage(14);
            
        }
        catch(ArithmeticException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

}
