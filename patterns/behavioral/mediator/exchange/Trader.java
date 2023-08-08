package patterns.behavioral.mediator.exchange;

public class Trader {
    private final Exchange cryptoExchange;
    private int traderId;

    public Trader(Exchange cryptoExchange) {
        this.cryptoExchange = cryptoExchange;
        cryptoExchange.registerTrader(this);
    }

    public void setTraderId(int traderId) {
        this.traderId = traderId;
    }

    public void buy(String cryptoCurrency, int amount) {
        cryptoExchange.setBuyOrder(cryptoCurrency, amount, traderId);
    }

    public void sell(String cryptoCurrency, int amount) {
        cryptoExchange.setSellOrder(cryptoCurrency, amount, traderId);
    }
}
