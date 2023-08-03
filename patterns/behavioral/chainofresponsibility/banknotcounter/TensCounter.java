package patterns.behavioral.chainofresponsibility.banknotcounter;

public class TensCounter extends BanknoteCounter{
    @Override
    public String count(int moneyAmount) {
        int tens = moneyAmount / 10;
        System.out.println("counting tens...");
        return tens != 0
                ? tens + " tens " + countNext(moneyAmount % 10)
                : countNext(moneyAmount % 10);
    }
}
