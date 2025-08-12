package ATM;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperation implements AtmInterface {

    private Atm atmMachine = new Atm();
    private Map<Double, String> miniStatement = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Current Balance: " + atmMachine.getBalance());
    }

    @Override
    public void withdrawAmount(double amountToWithdraw) {
        if (amountToWithdraw % 500 == 0) {
            if (amountToWithdraw <= atmMachine.getBalance()) {
                System.out.println("Please collect your cash: " + amountToWithdraw);
                atmMachine.setBalance(atmMachine.getBalance() - amountToWithdraw);
                miniStatement.put(amountToWithdraw, "Amount Withdrawn");
                viewBalance();
            } else {
                System.out.println("Insufficient Funds");
            }
        } else {
            System.out.println("Please enter the amount in multiples of 500");
        }
    }

    @Override
    public void depositAmount(double amountToDeposit) {
        System.out.println("Deposited Amount: " + amountToDeposit);
        atmMachine.setBalance(atmMachine.getBalance() + amountToDeposit);
        miniStatement.put(amountToDeposit, "Deposit Successful");
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        Set<Double> keys = miniStatement.keySet();
        for (Double key : keys) {
            System.out.println(key + " = " + miniStatement.get(key));
        }
    }
}
