package patterns.behavioral.observer.socialnetwork;

public class Celebrity {
    private final String name;
    private final SocialNetwork socialNetwork;

    public Celebrity(String name, SocialNetwork socialNetwork) {
        this.name = name;
        this.socialNetwork = socialNetwork;
    }
    public void publish(Post post) {
        System.out.println("Celebrity " + name + " create new " + post.type() + " post.");
        socialNetwork.notifyAllSubscribers(post);
    }
}
