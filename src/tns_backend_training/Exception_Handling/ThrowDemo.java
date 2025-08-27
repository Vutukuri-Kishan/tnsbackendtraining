package tns_backend_training.Exception_Handling;
//Program to implement the usage of THROW in exception handling
public class ThrowDemo {
    
        public static void Checkage(int age) {

            if (age<18) {
                throw new ArithmeticException(age + " Not eligible for voting");
            }
            System.out.println( age + " Eligible for voting");

        }
    }


