package patterns.behavioral.observer.socialnetwork;

public class CommonSubscriber implements Subscriber{
    private final String name;

    public CommonSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Post post) {
        System.out.println(name + " read " + post.type() + " post: " + post.content());
    }
}
