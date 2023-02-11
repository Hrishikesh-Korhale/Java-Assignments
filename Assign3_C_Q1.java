// 1. Create an interface "CreditCardInterface" with methods: viewCreditAmount(), useCard() and increaseLimit(). Create a class SilverCardCustomer(name, card number(16digits), creditAmount-initialized to 0, creditLimit - set to 50,000) which implements the above interface. Inherit class GoldCardCustomer from SilverCardCustomer having he same methods but creditLimit of 1,00,000. Create an object of each class and perform operations. Display appropriate message for success or failure of transactions. (Use method overriding)
// i. useCard() method increases the creditAmount by a specific amount up to credit Limit
// ii. payCredit() reduces the creditAmount by a specific amount.
// iii. increaseLimit() increases the credtiLimit for GoldCardCustomers(only 3 times,not more than 5000Rs. each time).
import java.io.*;

interface Crditcard//CreditCard
{
    void viewCreditAmount();
    void increaseLimit()throws IOException;
    void useCard()throws IOException;
    void payCard()throws IOException;
}

class SliverCardCustomer implements Crditcard//CreditCard
{
    String name;
    int card_no;
    double creditAmount;
    double creditLimit;
    static int cnt;
    BufferedReader br= new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));

    SliverCardCustomer()
    {
        name="Noname";
        card_no=0;
        creditAmount=0;
        creditLimit=50000;
    }
    public void viewCreditAmount()
    {
        System.out.println("Your amount is : "+creditAmount);
    }

    public void getdata()throws IOException
    {
        System.out.println("Enter the name");
        String name=(br.readLine());
        System.out.println("Enter the card number :");
        card_no=Integer.parseInt(br.readLine());
        System.out.println("Enter Credit amount :");
        creditAmount=Double.parseDouble(br.readLine());
    }

    public void payCard()throws IOException
    {
        System.out.println("Enter amount to be pay");
        double pay=Double.parseDouble(br.readLine());
        creditAmount=creditAmount+pay;
        System.out.println("Balance is paid");
    }

    public void useCard()throws IOException
    {
        System.out.println("Enter amount :");
        double amount=Double.parseDouble(br.readLine());
        if(amount<creditAmount)
        {
            creditAmount=creditAmount-amount;
            viewCreditAmount();
            System.out.println("Thank for using the service");
        }
        else
        {
            System.out.println("\nerror!");
        }
    }

    public void increaseLimit()throws IOException
    {
        cnt++;
        if(cnt<=3)
        {
            System.out.println("Enter amount limit to increase");
            double amt=Double.parseDouble(br.readLine());
            if(amt<=2500)
            {
                creditLimit=creditLimit+amt;
                System.out.println("Amount limit to increase Successfully");
            }
            else
            {
                System.out.println("You can't increase credit amount more than 2500 at a time");
            }
        }
        else
        {
            System.out.println("You can't increase limit more than 3 times");
        }
    }
}// end of class

class GoldCardCustomer extends SliverCardCustomer
{
    static int cnt;
    public void increaseLimit()throws IOException
    {
        cnt++;
        if(cnt<=3)
        {
            System.out.println("Enter amount limit to increase");
            double amt=Double.parseDouble(br.readLine());
            if(amt<=5000)
            {
                creditLimit=creditLimit+amt;
                System.out.println("Amount limit to increase Successfully");
            }
            System.out.println("You can't increase credit amount more than 5000 at a time");
        }
        else
            System.out.println("You can't increase limit more than 3 times");
    }
}
// end of class

class Assign3_C_Q1
{
    public static void main(String[] args)throws IOException
    {
        int ch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the info for silver card holder:");
        SliverCardCustomer sc=new SliverCardCustomer();
        sc.getdata();
        System.out.println("Enter the info for Gold card holder:");
        GoldCardCustomer gc=new GoldCardCustomer();
        gc.getdata();
        do {
            System.out.println("1.Use silver card \n2.Pay credit for Silver card\n3.Increase limit of Silver card");

            System.out.println("4.Use Gold card\n5.Pay credit for Gold card\n6.Increase limit for Gold card");

            System.out.println("0.exit");
            System.out.println("Enter your choice");

            ch = Integer.parseInt(br.readLine());

            switch (ch) {
                case 1:
                    sc.useCard();
                    break;
                case 2:
                    sc.payCard();
                    break;
                case 3:
                    sc.increaseLimit();
                    break;
                case 4:
                    gc.useCard();
                    break;
                case 5:
                    gc.payCard();
                    break;
                case 6:
                    gc.increaseLimit();
                    break;
                case 0:
                    break;
            }
        }while(ch!=0);
    }
}