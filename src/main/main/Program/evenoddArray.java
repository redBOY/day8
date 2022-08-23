package main.Program;

import java.util.Scanner;

public class evenoddArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n = reader.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = reader.nextInt();
        }
        System.out.println("The even elements are");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + "");
            }
        }
        System.out.println(" ");
        System.out.println("The odd elements are");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i] + "");
            }
        }
    }
}
