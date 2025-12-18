
package utils;
public class NetworkMonitor {
    public static void log() {
        try {
            Process p = Runtime.getRuntime().exec("nettop -l 1");
            p.getInputStream().transferTo(System.out);
        } catch(Exception e) {}
    }
}
