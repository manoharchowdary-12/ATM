
import java.util.Scanner;

public class UserInterface {

    private static int exitStatus;

    public static void main(String[] args) {
        AtmOperation atmOps = new AtmOperation();
        Scanner scanner = new Scanner(System.in);

        int validAtmNumber = 123456;
        int validAtmPin = 123;

        System.out.print("Enter ATM Number: ");
        int enteredAtmNumber = scanner.nextInt();

        System.out.print("Enter ATM PIN: ");
        int enteredAtmPin = scanner.nextInt();

        if (enteredAtmNumber == validAtmNumber && enteredAtmPin == validAtmPin) {
            while (true) {
                System.out.println("\n===== ATM Menu =====");
                System.out.println("1. View Available Balance");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Deposit Amount");
                System.out.println("4. View Mini Statement");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        atmOps.viewBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawalAmount = scanner.nextDouble();
                        atmOps.withdrawAmount(withdrawalAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        atmOps.depositAmount(depositAmount);
                        break;
                    case 4:
                        atmOps.viewMiniStatement();
                        break;
                    case 5:
                        System.out.println("Please collect your ATM card.\nThank you for using our service.");
                        System.exit(exitStatus);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            System.out.println("Incorrect ATM number or PIN.");
        }
    }
}
