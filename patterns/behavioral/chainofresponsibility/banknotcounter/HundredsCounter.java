package patterns.behavioral.chainofresponsibility.banknotcounter;

public class HundredsCounter extends BanknoteCounter {
    @Override
    public String count(int moneyAmount) {
        int hundreds = moneyAmount / 100;
        System.out.println("counting hundreds...");
        return hundreds != 0
                ? hundreds + " hundreds " + countNext(moneyAmount % 100)
                : countNext(moneyAmount % 100);
    }
}
