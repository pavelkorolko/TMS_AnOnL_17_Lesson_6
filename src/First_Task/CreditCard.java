package First_Task;

import java.util.UUID;
//Создать класс First_Task.CreditCard с полями номер счета, текущая сумма на счету. Добавьте метод, который позволяет
//начислять сумму на карточку.
// Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//Добавьте метод, который выводит текущую информацию о карточке.
//Написать программу, которая создает три объекта класса First_Task.CreditCard у которых заданы номер счета и начальная сумма.
//Тестовый сценарий для проверки:
//Положить деньги на первые две карточки и снимите с третьей.
//Выведите на экран текущее состояние всех трех карточек.


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


