package patterns.structural.facade.internet;

public class DnsServer {
    public static String resolveUrl(String url) {
        System.out.println("Searching IP at DNS server for URL " + url);
        System.out.println("IP for URL " + url +" is 23.123.124.25" );
        return "23.123.124.25";
    }

}
