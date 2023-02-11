// Write a java program which accept a string and characters to be search from the user the program should display the total no of string.
import java.util.*;
public class Assign2_A_Q5{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.next();
        System.out.println("Enter Character");
        String ch=sc.next();
        int len=str.length();
        char c=ch.charAt(0);
        System.out.println(c);
        char[] search =new char[len];
        int cnt=0;
        for(int i=0;i<len;i++)
        {
            search[i]=str.charAt(i);
        }
        for(int i=0;i<len;i++)
        {
            if(search[i]==c){
                System.out.println("Character Found:");
            }
            else
            {
                cnt++;
            }
        }
        if(cnt==len)
        {
            System.out.println("Character not Found");
        }
        System.out.println("No of Character is :"+len);

    }
}