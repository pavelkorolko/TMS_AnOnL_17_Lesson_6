package First_Task;

import java.util.UUID;

public class CreditCard {
    private UUID accNumber;
    private double currentDeposit;

    public UUID getAccNumber() {
        return accNumber;
    }

    public CreditCard(UUID accNumber, double currentDeposit) {
        this.accNumber = accNumber;
        this.currentDeposit = currentDeposit;
    }

    public double getCurrentDeposit() {
        return currentDeposit;
    }

    public void addDeposit(double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Wrong amount!");
        }
        currentDeposit += amount;
    }

    public void withdrawDeposit(double amount) throws Exception {
        if (amount > currentDeposit) {
            throw new Exception("Not sufficient money!");
        } else if (amount < 0) {
            throw new Exception("Wrong amount!");
        }
        currentDeposit -= amount;
    }

    @Override
    public String toString() {
        return "Your account number: " + this.accNumber + ". Current deposit: " + this.currentDeposit;
    }
}


