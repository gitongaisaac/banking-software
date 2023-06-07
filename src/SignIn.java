import java.util.Scanner;

public class SignIn {
    static int cardNo;
    static int pinNo;

    public static void signIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Card Number: ");
        cardNo = scanner.nextInt();

        System.out.print("Enter Pin Number: ");
        pinNo = scanner.nextInt();
    }
    public static void main(String[] args) {
        signIn();

        System.out.println(cardNo);
        System.out.println(pinNo);
    }
}
