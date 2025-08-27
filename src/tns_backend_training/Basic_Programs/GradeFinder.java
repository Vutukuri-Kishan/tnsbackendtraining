// Program to find a student's grade based on marks given to them - using conditional statements

package tns_backend_training.Basic_Programs;
import java.util.Scanner;
public class GradeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if(marks >= 90 && marks <=100){
            System.out.println("A grade");
        }
        else if(marks >= 70 && marks <90){
            System.out.println("B grade");
        }
        else if(marks >= 50 && marks <70){
            System.out.println("C grade");
        }

        else if (marks <50){
            System.out.println("Fail");
        }
        
        
        else {
            System.out.println("Invalid marks entered");
        }

        sc.close();
        }


        
    }


    
