import java.util.Scanner;
public class ATM_Program
{
    public static void main(String[] args)
    {
        int balance=5000;
        Scanner scanner= new Scanner(System.in);
        while(true)
        {
            System.out.println("ATM Menu: \n1. Check Balance \n2. Deposit \n3.Withdraw \n4. Exit \nEnter your choice: ");
            int option=scanner.nextInt();

            if (option==1)
            {
                System.out.println("Your balance: "+balance);
            }
            else if (option==2)
            {
                System.out.println("Enter deposit amount: ");
                int deposit=scanner.nextInt();
                balance=balance+deposit;
                System.out.println("Deposit successful. New balance: " +balance);
            }
            else if (option==3)
            {
                System.out.println("Enter withdrawal amount: ");
                int withdraw=scanner.nextInt();
                if (balance>=withdraw)
                {
                    balance=balance-withdraw;
                    System.out.println("Withdrawal successful. New balance: "+balance);
                }
                else
                {
                    System.out.println("Insufficient funds.");
                }
            }
            else if (option==4)
            {
                System.out.println("Thank you for using the ATM!");
                break;
            }
            else
            {
                System.out.println("Invalid option.");
            }
        }
    }
}