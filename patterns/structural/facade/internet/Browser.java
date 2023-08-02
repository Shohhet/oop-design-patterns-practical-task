package patterns.structural.facade.internet;

public class Browser {
    public String getWebPage(String url) {
        System.out.println(resolveUrl(url));
        System.out.println(OperationSystem.resolveUrl(url));
        System.out.println(Router.resolveURL(url));
        String ip = DnsServer.resolveUrl(url);
        System.out.println(connectToIp(ip));
        System.out.println(sendHttpRequest());
        System.out.println(Host.processRequest(ip));
        return renderWebPage();
    }
    private String resolveUrl(String url) {
        return "Searching IP at browser cache for URL " + url;
    }
    private String connectToIp(String ip) {
        return ("Connecting to IP " + ip);
    }

    private String sendHttpRequest() {
        return "Sending HTTP request";
    }

    private String renderWebPage() {
        return "CONGRATULATIONS!!! This is content of web page at browser window";
    }
}
