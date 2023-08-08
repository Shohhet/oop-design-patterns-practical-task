package patterns.behavioral.mediator.exchange;

public interface Exchange {
    void setBuyOrder(String cryptoCurrency, int amount, int traderId);
    void setSellOrder(String cryptoCurrency, int amount, int traderId);
    void registerTrader(Trader trader);

}
