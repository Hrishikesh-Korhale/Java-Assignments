// Q2. Write a java program to display the system data and time in various format shown below:
//Current date is  : 31/07/2015
// Current date is  : 07-31-2015
// Current date is  : Friday July 31 2015
// Current date and time is  : Fri July 31 16:25:56 IST 2015
// Current date and time is  :  31/07/15 16:25:56 PM +0530
// Current time is  :   16:25:56
// Current week of year is : 31
// Current week of month : 5
// Current day of the year is : 212
//  Note: Use java.util.Date and java.text.SimpleDateFormat class

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class Assign1_B_Q1 {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Current date is: "+strDate);

        formatter = new SimpleDateFormat("MM-dd-yyyy");
        strDate= formatter.format(date);
        System.out.println("Current Date is: "+strDate);

        formatter = new SimpleDateFormat("EEEEEE MMMM dd yyyy");
        strDate = formatter.format(date);
        System.out.println("Current date is: "+strDate);

        formatter = new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
        strDate = formatter.format(date);
        System.out.println("Current date & Time is: "+strDate);

        formatter = new SimpleDateFormat("dd/MM/yy HH:mm:ss z yyyy");
        strDate = formatter.format(date);
        System.out.println("Current date & Time is: "+strDate);

        formatter= new SimpleDateFormat("hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Current Time is: "+strDate);

        formatter =new SimpleDateFormat("w");
        strDate=formatter.format(date);
        System.out.println("Current week of year is  : "+strDate);

        formatter = new SimpleDateFormat("W");
        strDate=formatter.format(date);
        System.out.println("Current week of year is: "+strDate);

        formatter=new SimpleDateFormat("D");
        strDate=formatter.format(date);
        System.out.println("Current day of the year: "+strDate);

    }
}
