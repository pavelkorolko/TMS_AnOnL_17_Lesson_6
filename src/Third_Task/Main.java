package Third_Task;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(2500, 1500, 1000);
        System.out.println(atm.getWholeSum());
        System.out.println(atm.addMoney(1200));
        System.out.println(atm.getWholeSum());
        atm.withdrawMoney(1000);
    }
}
