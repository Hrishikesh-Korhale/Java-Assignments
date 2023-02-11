// Write a java program which accept an integer array and print the data and sort the data in descending order.

import java.util.Scanner;

public class Assign2_A_Q2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = 10;
        int arr[] = new int[n];

        System.out.println("Enter the element of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        //Bubble Sort
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }

        System.out.println("Sorted Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}