// Define a class person(pid,pname,age,gender).Define the default and parametrized constructor.Overload the constructor. Accept the 5 persons details and display it. (use this keyword.)
import java.io.*;
 class person {
    String name,gender;
    int age,pid;
    person(){
        name="rajkumar rao";
        gender="male";
        age=23;
        pid=109;
    }
    person(String n1,String g1,int a1,int p1)
    {
        name=n1;
        gender=g1;
        age=a1;
        pid=p1;
    }
    void accept() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter name of person: ");
        name=br.readLine();

        System.out.println("Enter gender of person: ");
        gender=br.readLine();

        System.out.println("Enter id of Person: ");
        pid=Integer.parseInt(br.readLine());

        System.out.println("Enter age of Person: ");
        age=Integer.parseInt(br.readLine());
    }
    void display() throws IOException
    {
        System.out.println("name="+name);
        System.out.println("gender="+gender);
        System.out.print("pid="+pid);
        System.out.println("age="+age);
    }
}
class Assign2_A_Q6
{
    public static void main(String[] args)throws IOException{
        int i;
        person p1=new person();
        person p2=new person("swer","male",45,45);
        person[] p =new person[5];

        for(i=0;i<5;i++)
        {
            p[i]=new person();
            p[i].accept();
        }
        for(i=0;i<5;i++)
        {
            p[i].display();
        }

    }
}
