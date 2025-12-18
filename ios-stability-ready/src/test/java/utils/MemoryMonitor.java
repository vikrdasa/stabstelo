
package utils;
public class MemoryMonitor {
    public static void log(String app) {
        try {
            Process p = Runtime.getRuntime().exec("ps -axo rss,command | grep " + app);
            p.getInputStream().transferTo(System.out);
        } catch(Exception e) {}
    }
}
