//// 1.Define an abstract class"Staff" with members name and address. Define two sub-classes of this class - "FullTimeStaff"(department,salary)and "PartTimeStaff" (number-of-hours,rateperhour).Define appropriate constructors. Create n objects which could be of either FullTimeStaff of PartTimeStaff class by asking the user's choice. Display details of all "FullTimeStaff" objects and all "PartTimeStaff" objects.

import java.io.*;
abstract class Staff
{
    String name,address;
    public Staff(String name, String address)
    {
        this.name=name;
        this.address=address;
    }
    abstract public void display();
}

class FullTime extends Staff
{
    String department;
    double salary;

    public FullTime(String name,String address,String department,double salary)
    {
        super(name,address);
        this.department=department;
        this.salary=salary;
    }
    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Department:"+department);
        System.out.println("Salary:"+salary);
    }
}

class PartTime extends Staff
{
    int noofhrs;
    double rate;

    public PartTime(String name,String address,int noofhrs,double rate)
    {
        super(name,address);
        this.noofhrs=noofhrs;
        this.rate=rate;
    }
    public void display()
    {
         System.out.println("Name:"+name);
         System.out.println("Address:"+address);
         System.out.println("Number of Hours:"+noofhrs);
         System.out.println("Rate per hour:"+rate);
    }
}

class Assign3_B_Q1 {
    public static void main(String[] args) throws Exception {
        int ch = 0, n = 0, noofhrs;
        String name, address, department;
        double salary, rate;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("\n1:Full Time \n2:Part Time \n3:Exit");
            System.out.print("Enter your choice: ");
            ch = Integer.parseInt(br.readLine());
            switch (ch) {
                case 1:
                    System.out.println("Enter how many menbers:");
                    n = Integer.parseInt(br.readLine());
                    FullTime[] F = new FullTime[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter name");
                        name = br.readLine();
                        System.out.println("Enter Address:");
                        address = br.readLine();
                        System.out.println("Enter Department:");
                        department = br.readLine();
                        System.out.println("Enter salary");
                        salary = Double.parseDouble(br.readLine());
                        F[i] = new FullTime(name, address, department, salary);
                    }
                    System.out.println("Full Time details:");
                    System.out.println("=====================");
                    for (int i = 0; i < n; i++) {
                        F[i].display();
                        break;
                    }
                case 2:
                    System.out.println("Enter how many staff members:");
                    n = Integer.parseInt(br.readLine());
                    PartTime obj[] = new PartTime[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter name:");
                        name = br.readLine();
                        System.out.println("Enter Address");
                        address = br.readLine();
                        System.out.println("Enter no of hrs");
                        noofhrs = Integer.parseInt(br.readLine());
                        System.out.println("Enter rate:");
                        rate = Double.parseDouble(br.readLine());
                        obj[i] = new PartTime(name, address, noofhrs, rate);
                        System.out.println("Part Time details");
                        System.out.println("===================");
                        for (i = 0; i < n; i++) {
                            obj[i].display();
                            break;
                        }

                    }
                case 3:
                    break;

                default:
                    System.out.println(" invalid input");
                    break;

            }

        } while (ch != 3) ;
    }
}