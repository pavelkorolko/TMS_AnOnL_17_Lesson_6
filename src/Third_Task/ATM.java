package Third_Task;

public class ATM {
    private int twentiesBanknotes;
    private int fiftiesBanknotes;
    private int hundredsBanknotes;
    private int wholeSum;


    public ATM(int twentiesBanknotes, int fiftiesBanknotes, int hundredsBanknotes) {
        this.twentiesBanknotes = twentiesBanknotes;
        this.fiftiesBanknotes = fiftiesBanknotes;
        this.hundredsBanknotes = hundredsBanknotes;
        this.wholeSum = twentiesBanknotes * 20 + fiftiesBanknotes * 50 + hundredsBanknotes * 100;
    }

    public boolean addMoney(int amount) {
        return auxiliaryHelper(amount, '+');
    }

    public boolean withdrawMoney(int amount) {
        if (wholeSum < amount) {
            return false;
        } else {
            return auxiliaryHelper(amount, '-');
        }
    }


    public int getWholeSum() {
        return wholeSum;
    }

    private boolean auxiliaryHelper(int amount, char sign) {
        //priority for 100, then 50, then 20
        int tempForHundreds = amount / 100;
        int residual = amount % 100;

        int tempForFifties = residual / 50;
        residual = residual % 50;

        int tempForTwenties = residual / 20;
        residual = residual % 20;

        if (residual == 0) {
            switch (sign) {
                case '+':
                    twentiesBanknotes += tempForTwenties;
                    fiftiesBanknotes += tempForFifties;
                    hundredsBanknotes += tempForHundreds;
                    break;
                case '-':
                    twentiesBanknotes -= tempForTwenties;
                    fiftiesBanknotes -= tempForFifties;
                    hundredsBanknotes -= tempForHundreds;
                    System.out.println("Returning: " + tempForFifties + "x20 banknotes, " + tempForFifties + "x50 banknotes and " + tempForHundreds + "x100 banknotes!");
                    break;
            }

            this.wholeSum = twentiesBanknotes * 20 + fiftiesBanknotes * 50 + hundredsBanknotes * 100;
            return true;
        } else {
            System.out.println("Operation can not be done!");
            return false;
        }
    }
}
