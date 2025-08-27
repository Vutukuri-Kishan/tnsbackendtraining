package tns_backend_training.Exception_Handling;
//Program to implement multiple CATCH blocks for one try statement

public class MultipleCatchDemo {

    public static void main(String[] args) {
        try {
            int arr[] = new int[4];
            arr[8] = 100;
            int num = Integer.parseInt("null");
            System.out.println(num);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array Index out of range ");

        }

        catch (NumberFormatException e) {
            System.out.println("Error: Invalid Number Format");

        }

        catch (Exception e){
            System.out.println("General Error: " + e.getMessage());
        }
    }


}
