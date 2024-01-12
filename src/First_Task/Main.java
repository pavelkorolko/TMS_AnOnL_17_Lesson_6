package First_Task;

import java.util.UUID;

public class Main {
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
