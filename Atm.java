package ATM;

public class Atm {
    private double balance;
    private double amountToDeposit;
    private double amountToWithdraw;

    public Atm() {
        // Default constructor
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmountToDeposit() {
        return amountToDeposit;
    }

    public void setAmountToDeposit(double amountToDeposit) {
        this.amountToDeposit = amountToDeposit;
    }

    public double getAmountToWithdraw() {
        return amountToWithdraw;
    }

    public void setAmountToWithdraw(double amountToWithdraw) {
        this.amountToWithdraw = amountToWithdraw;
    }

    @Override
    public String toString() {
        return "Atm [balance=" + balance +
               ", amountToDeposit=" + amountToDeposit +
               ", amountToWithdraw=" + amountToWithdraw + "]";
    }
}
