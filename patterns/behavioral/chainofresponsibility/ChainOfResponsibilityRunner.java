package patterns.behavioral.chainofresponsibility;

import patterns.behavioral.chainofresponsibility.banknotcounter.BanknoteCounter;
import patterns.behavioral.chainofresponsibility.banknotcounter.HundredsCounter;
import patterns.behavioral.chainofresponsibility.banknotcounter.OnesCounter;
import patterns.behavioral.chainofresponsibility.banknotcounter.TensCounter;

public class ChainOfResponsibilityRunner {
    public static void main(String[] args) {
        BanknoteCounter counter = new HundredsCounter();
        counter.setNextCounter(new TensCounter())
                .setNextCounter(new OnesCounter());
        CashMachine cashMachine = new CashMachine(counter);

        cashMachine.getMoney(1000);

    }
}
