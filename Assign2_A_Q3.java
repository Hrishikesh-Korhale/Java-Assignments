// Write a java program which define class employee with data member as name and salary. program store the information of 5 Employees. display the name who earn maximum salary.(use array of object).
import java.util.*;
public class Assign2_A_Q3 {
    Scanner sc= new Scanner(System.in);
    String name;
    public float salary;
    void input()
    {
        System.out.println("Enter Employee name: ");
        name=sc.next();
        System.out.println("Enter Salary: ");
        salary=sc.nextFloat();

    }
    void show()
    {
        System.out.println("Employee name :"+name);
        System.out.println("Salary is  :"+salary);

    }
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter How many information you want to store ?");

        int n=s.nextInt();

        Assign2_A_Q3 e[]=new Assign2_A_Q3[n];

        float sal[]=new float[5];

        for(int i=0;i<n;i++)
        {
            e[i]=new Assign2_A_Q3();
            e[i].input();
            sal[i]=e[i].salary;
        }
        for(int i=0;i<n;i++)
        {
            e[i].show();
        }
        float max=sal[0];
        float arr[]=new float[5];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(max<sal[i])
            {
                max=sal[i];
                arr[j]=max;
                j=i;
            }
        }
        System.out.println("********Employee having Maximum Salary*********");
        e[j].show();
    }
}

