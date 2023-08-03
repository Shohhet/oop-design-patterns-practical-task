package patterns.structural.proxy.host;


import java.util.HashSet;
import java.util.Set;

public class ProxyHost implements Host{
    private final Host internetHost;
    private final Set<String> restrictedUrls = new HashSet<>();

    public ProxyHost(Host internetHost) {
        this.internetHost = internetHost;
    }
    public void addRestrictedUrl(String url) {
        restrictedUrls.add(url);
    }

    @Override
    public String getWebPage(String url) {
        if (restrictedUrls.contains(url)) {
            return "Access denied!!!  ";
        }
        return internetHost.getWebPage(url);
    }
}
