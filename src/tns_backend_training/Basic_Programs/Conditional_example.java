// program to find the greatest number among three numbers using conditional statements

package tns_backend_training.Basic_Programs;
public class Conditional_example {
     public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        if (a >= b && a >= c) {
            System.out.println("a is greatest: ");
        } else if (b >= a && b >= c) {
            System.out.println("b is greatest: ");
        } else {
            System.out.println("c is greatest: ");
        }
    }
}



    

