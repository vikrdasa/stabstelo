
package utils;
public class CpuMonitor {
    public static void logCpu(String app) {
        try {
            Process p = Runtime.getRuntime().exec("ps -axo %cpu,command | grep " + app);
            p.getInputStream().transferTo(System.out);
        } catch(Exception e) {}
    }
}
