//Define a Student Class (roll number, name, percentage). Define a default and parameterized constructor Keep a count of object created. Create object using parameterized constructor and display the object count after each object is created.(use static member and method). Also display the contents of each object .
import java.util.*;
public class Assign2_A_Q4 {
    int rno;
    String name;
    float per;
    Assign2_A_Q4()
    {
        System.out.println("You are in default constructor : ");
    }
    Assign2_A_Q4(int rno,String name,float per)
    {
        this.rno=rno;
        this.name=name;
        this.per=per;
    }
    static int cnt=0;
    static void obj()
    {
        cnt++;
        System.out.println("Object created : "+cnt);
    }
    void display()
    {
        System.out.println("Student roll no: "+rno);
        System.out.println("Student name: "+name);
        System.out.println("Student percentage: "+per);
    }
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How many student information do you want to store?");
        int n=sc.nextInt();
        Assign2_A_Q4 s=new Assign2_A_Q4();
        Assign2_A_Q4 s1[]=new Assign2_A_Q4[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Student Roll no : ");
            int rno=sc.nextInt();
            System.out.println("Enter Student Name: ");
            String name=sc.next();
            System.out.println("Enter Student percentage: ");
            float per=sc.nextFloat();
            s1[i]=new Assign2_A_Q4(rno,name,per);
            s1[i].obj();
            s1[i].display();
        }

    }
}
