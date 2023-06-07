import java.util.Scanner;

public class Accounts {
    static int ac;
    static int balance;

    public static void accounts() {
        System.out.println("Which accounts do you wish to access? \n " +
                "1) Check Balance \n " +
                "2) Deposit Cash \n " +
                "3) Withdraw Cash \n " +
                "4) History \n " +
                "5) Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Account: ");
        ac = scanner.nextInt();

        switch (ac) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("Thank you For using our services");
                break;
            default:
                System.out.println("Account " + ac + " does not exist");

        }
    }

    public static int deposit() {
        System.out.println("Enter the amount you with to deposit");

        return 0;
    }

    public static int withdraw() {
        int amount;

        System.out.println("Enter amount you with to withdraw");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Amount: ");
        amount = scanner.nextInt();

        balance += amount;

        return balance;
    }

    public static int checkBalance() {
        System.out.println(balance);

        return balance;
    }

    public static void main(String[] args) {
        accounts();
    }
}
