import java.util.Scanner;
class Payroll{
    public static void main(String[] args){
        String name;
        int hour;
        Double payRate;
        Double grossPay;
        Scanner keyboard = new Scanner(System.in);
        //get the user name
        System.out.print("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
         System.out.print("                         GROSSPAYCALCULATOR IN DIFF CURRENCIES    ");
         System.out.print("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Enter your name");
        name = keyboard.nextLine();
        //get hours
        System.out.print("how many hours did you work ?");
        hour = keyboard.nextInt();
        //payratye
        System.out.print("what is your hourly payrate?");
        payRate =keyboard .nextDouble();
        // gross pay
        grossPay = hour * payRate;
        System.out.println("Hello " +name);
        euro = grosspay/141.16;
        dollar = grosspay/129.17
        System.out.println("your grosspay is ksh"+ grossPay);
        System.out.println("your grosspay in dollars $"+ dollar);
        System.out.println("your grosspay i euros  €"+ euro);
    }
}
