package patterns.behavioral.observer;

import patterns.behavioral.observer.socialnetwork.*;

public class ObserverRunner {
    public static void main(String[] args) {
        SocialNetwork twitter = new SocialNetwork();
        Celebrity celebrity = new Celebrity("Jason Statham", twitter);
        Subscriber commonSubscriber = new CommonSubscriber("Ivan Ivanov");
        Subscriber premiumSubscriber = new PremiumSubscriber("Petr Petrov");
        twitter.addSubscriber(commonSubscriber, PostType.COMMON);
        twitter.addSubscriber(premiumSubscriber, PostType.PREMIUM);
        celebrity.publish(new Post(PostType.COMMON, "If you're going to do something, do it with style! "));
        celebrity.publish(new Post(PostType.COMMON, "High risk is high adrenaline."));
        celebrity.publish(new Post(PostType.PREMIUM, "Never give up, go for your goal, and if it gets difficult, give up"));
    }
}
