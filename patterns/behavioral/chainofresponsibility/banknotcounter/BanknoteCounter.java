package patterns.behavioral.chainofresponsibility.banknotcounter;

public abstract class BanknoteCounter {
    private BanknoteCounter nextCounter;

    public BanknoteCounter setNextCounter(BanknoteCounter counter) {
        this.nextCounter = counter;
        return counter;

    }

    public abstract String count(int moneyAmount);
    protected String countNext(int moneyAmount) {
        if (nextCounter == null) {
            return "";
        }
        return nextCounter.count(moneyAmount);
    }
}
