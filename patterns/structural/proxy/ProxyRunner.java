package patterns.structural.proxy;

import patterns.structural.proxy.host.InternetHost;
import patterns.structural.proxy.host.ProxyHost;

import java.util.List;

public class ProxyRunner {
    public static void main(String[] args) {
        List<String> urls = List.of(
                "www.google.com",
                "www.baeldung.com",
                "www.youtube.com",
                "www.github.com",
                "www.brazzers.com");

        ProxyHost proxy = new ProxyHost(new InternetHost());
        proxy.addRestrictedUrl("www.youtube.com");
        proxy.addRestrictedUrl("www.brazzers.com");

        urls.forEach(url -> System.out.println(proxy.getWebPage(url)));

    }
}
