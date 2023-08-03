package patterns.behavioral.chainofresponsibility;

import patterns.behavioral.chainofresponsibility.banknotcounter.BanknoteCounter;

public class CashMachine {
    BanknoteCounter counter;

    public CashMachine(BanknoteCounter counter) {
        this.counter = counter;
    }

    public void getMoney(int moneyAmount) {
        System.out.println(counter.count(moneyAmount));
    }
}
