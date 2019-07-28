package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the size");
            size = scanner.nextInt();
            if (size >20) {
                System.out.println("size should not exceed 20");
            }
        } while (size >20);

        array = new int[size];
        for (int i =0; i<array.length; i++) {
            System.out.println("Enter element "+ (i +1));
            array[i] = scanner.nextInt();
        }

        System.out.println("Property list");
        for (int j =0; j<array.length; j++) {
            System.out.println(array[j]+"\t");
        }

        int max = array[0];
        int index = 1;
        for (int k = 0; k<array.length; k++) {
            if (array[k] > max) {
                max = array[k];
                index = k+1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
