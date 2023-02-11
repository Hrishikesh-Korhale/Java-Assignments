// 1. Define a class Employee having private members-id,name,department,salary. Define default and parameterized constructors. Create a subclass called "Manager" with private member bonus. Define methods accept and display in both the classes. Create n objects of the Manager class and display the details of the manager having the maximum total salary(salary+bonus)
import java.util.*;
class emp {
    private int id;
    private String name;
    private String dept;
    private double salary;

    public emp() {
        id = 0;
        name = null;
        dept = null;
        salary = 0;
    }

    public emp(int eid, String ename, String edept, float esalary) {
        id = eid;
        name = ename;
        dept = edept;
        salary = esalary;
    }

    public void acceptE() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter id:");
        id = s.nextInt();
        System.out.println("Enter name:");
        name = s.next();
        System.out.println("Enter dept:");
        dept = s.next();
        System.out.println("Enter salary:");
        salary = s.nextDouble();
    }

    public void displayE() {
        System.out.println("Emp id:" + id);
        System.out.println("Emp name:" + name);
        System.out.println("Emp department:" + dept);
        System.out.println("Enp Salary:" + salary);
    }

    public double salary() {
        return salary;
    }

    static class Manager extends emp {
        private double bonus;

        public void acceptM() {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter bonus:");
            bonus = s.nextDouble();
        }

        public void displayM() {
            System.out.println("Manager bonus:" + bonus);
        }

        public static int max(Manager[] m, int n) {
            double max = 0;
            int t = 0;
            for (int i = 0; i < n; i++) {
                if (max > (m[i].salary() + m[i].bonus)) {
                    max = m[i].salary() + m[i].bonus;
                    t = i;
                }
            }
            System.out.println("\n Max salary:" + max);
            return t;
        }
    }

      class Assign3_A_Q1 {
        public static void main(String[] args) {
            int n, i, ans;
            Scanner s = new Scanner(System.in);
            System.out.println("\nEnter how many records");
            n = s.nextInt();
            Manager[]m = new Manager[n];
            for (i = 0; i < n; i++) {
                m[i]=new Manager();
                m[i].acceptE();
                m[i].displayE();
                m[i].acceptM();
                m[i].displayM();
            }
            ans = Manager.max(m, n);
            m[ans].displayE();
            m[ans].displayM();
        }
    }
}



