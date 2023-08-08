package patterns.behavioral.mediator.exchange;

import java.util.ArrayList;
import java.util.List;

public class CryptoExchange implements Exchange{
    private final List<Order> sellOrders;
    private final List<Order> buyOrders;

    private int traderId;

    public CryptoExchange() {
        sellOrders = new ArrayList<>();
        buyOrders = new ArrayList<>();
        traderId = 0;
    }

    @Override
    public void setBuyOrder(String cryptoCurrency, int amount, int traderId) {
        sellOrders.stream()
                .filter(order -> order.cryptoCurrency().equals(cryptoCurrency)
                        && order.amount() == amount
                        && order.traderId() != traderId)
                        .findFirst()
                .ifPresentOrElse(order -> {
                    sellOrders.remove(order);
                    System.out.println("Trader " + traderId + " sell " + amount + " of " + cryptoCurrency);},
                        () -> {
                            buyOrders.add(new Order(cryptoCurrency, amount, traderId));
                            System.out.println("Order from trader " + traderId + " for buying " + amount + " of " + cryptoCurrency + " was add to the buy query for execution");
                        });
    }

    @Override
    public void setSellOrder(String cryptoCurrency, int amount, int traderId) {
        buyOrders.stream()
                .filter(order -> order.cryptoCurrency().equals(cryptoCurrency)
                        && order.amount() == amount
                        && order.traderId() != traderId)
                .findFirst()
                .ifPresentOrElse(order -> {
                            buyOrders.remove(order);
                            System.out.println("Trader " + traderId + " buy " + amount + " of " + cryptoCurrency);},
                        () -> {
                            sellOrders.add(new Order(cryptoCurrency, amount, traderId));
                            System.out.println("Order from trader " + traderId + " for selling " + amount + " of " + cryptoCurrency + " was add to the sell query for execution");
                        });
    }

    @Override
    public void registerTrader(Trader trader) {
        trader.setTraderId(traderId++);
    }
}
