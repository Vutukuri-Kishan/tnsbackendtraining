package tns_backend_training.assignment;

import java.util.ArrayList;

public class Evenarray {
    public static void main(String[] args) {
        int num[] = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                evenNumbers.add(num[i]);
            }
        }

        System.out.println("Even Numbers: " + evenNumbers);
    }
}