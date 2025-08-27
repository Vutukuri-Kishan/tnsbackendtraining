package tns_backend_training.Exception_Handling;

//Program to implement the MAIN function of th CustomException Class

public class CustomExceptionMain {

    public static void main(String[] args) {
        BankAcc acc = new BankAcc();

        try  {
            //1. For a valid amount
            System.out.println("For valid amount (2000/-)");
            acc.withdraw(2000);
            System.out.println();
            //2. For Invalid/amount exceeding the bank balance
            System.out.println("For Invalid amount(10000/-)");
            acc.withdraw(10000);
        }

        catch (CustomException e){
            System.out.println("Error: " +e.getMessage());

        }

        }
    }
