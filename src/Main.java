import java.util.Scanner;
class Payroll{
    public static void main(String[] args){
        String name;
        int hour;
        Double payRate;
        Double grossPay;
        Scanner keyboard = new Scanner(System.in);
        //get the user name
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
        System.out.println("your grosspay is $"+ grossPay);
    }
}
