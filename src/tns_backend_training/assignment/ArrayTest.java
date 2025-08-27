package tns_backend_training.assignment;
// Question given for the first paper-pen test

/*Question: Declare an array of 10 elements, use for loop and enhanced for loop to iterate all the elements in the array and print them onto the console, and also finding the sum of all elements of the array */


public class ArrayTest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        //iterating using for loop
        System.out.println("The elements in the array are: ");

        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);

        }

        //printing the sum of the elements in the array
        int sum = 0;
        for (int num:arr){
            sum+=num;

        }

        System.out.println("The sum of the elements in the array is: " + sum);
    }
    
}
