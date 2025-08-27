package tns_backend_training.Exception_Handling;
// Program to implement Custom Exceptions

class CustomException extends Exception {
        public CustomException (String message) {
            super(message);
        }
    }
class BankAcc { 
    private double bal = 10000;
    //Checking the bank balance using IF-ELSE
    public void withdraw(double amount) throws CustomException {
        if (amount > bal){
            throw new CustomException("Insufficient Funds. The available balance: " + bal);//to throw the custom exception
        }
        bal-=amount;
        System.out.println("Withdrawl successful!\nRemaining Balance in your account: " + bal);
    }
}

        

    


