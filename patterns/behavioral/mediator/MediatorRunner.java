package patterns.behavioral.mediator;

import patterns.behavioral.mediator.exchange.CryptoExchange;
import patterns.behavioral.mediator.exchange.Trader;

public class MediatorRunner {
    public static void main(String[] args) {

        CryptoExchange binance = new CryptoExchange();
        Trader trader1 = new Trader(binance);
        Trader trader2 = new Trader(binance);
        trader1.buy("BTC", 100);
        trader1.sell("USDT", 50);
        trader2.sell("BTC", 100);
        trader2.buy("USDT", 50);

    }

}
