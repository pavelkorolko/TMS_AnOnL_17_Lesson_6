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


class Main {
    public static void main(String[] args) {
        try {
            CreditCard card_1 = new CreditCard(UUID.randomUUID(), 1000);
            CreditCard card_2 = new CreditCard(UUID.randomUUID(), 2000);
            CreditCard card_3 = new CreditCard(UUID.randomUUID(), 3000);

            card_1.addDeposit(1000);
            card_2.addDeposit(1000);
            card_3.withdrawDeposit(1000);


            System.out.println(card_1);
            System.out.println(card_2);
            System.out.println(card_3);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}