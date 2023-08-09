package patterns.behavioral.observer.socialnetwork;

import java.util.*;

public class SocialNetwork {
    private final Map<PostType, List<Subscriber>> subscribers;

    public SocialNetwork() {
        subscribers = new HashMap<>();
        Arrays.stream(PostType.values()).forEach(type -> subscribers.put(type, new ArrayList<>()));
    }

    public void addSubscriber(Subscriber subscriber, PostType type) {
        subscribers.get(type).add(subscriber);
    }

    public void notifyAllSubscribers(Post post) {
        subscribers.get(post.type()).forEach(s -> s.update(post));
    }
}
