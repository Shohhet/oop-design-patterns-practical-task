package patterns.behavioral.chainofresponsibility.banknotcounter;

public class OnesCounter extends BanknoteCounter{
    @Override
    public String count(int moneyAmount) {
        System.out.println("counting ones...");

        return moneyAmount != 0 ? moneyAmount + " ones" : "";
    }
}
