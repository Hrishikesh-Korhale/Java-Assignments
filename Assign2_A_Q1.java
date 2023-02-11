// Write a java program which accept 3int values and prints the maximum and minimum.
import java.sql.SQLOutput;
import java.util.Scanner;
public class Assign2_A_Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer");
        int a = sc.nextInt();
        System.out.println("Enter second integer");
        int b = sc.nextInt();
        System.out.println("Enter second integer");
        int c = sc.nextInt();

        int m=Math.max(a,b);
        m=Math.max(b,c);
        int mn=Math.min(a,b);
        mn=Math.min(b,c);
        System.out.println("The maximum number is: "+m);
        System.out.println("The minimum number is: "+mn);


    }
}
