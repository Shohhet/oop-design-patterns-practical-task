package patterns.structural.facade.internet;

public class Host {
    public static String processRequest(String host) {
        return "Host " + host + " send web page at HTTP response";
    }
}
