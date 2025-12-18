
package utils;
import io.appium.java_client.ios.IOSDriver;
public class BatteryMonitor {
    public static void log(IOSDriver driver) {
        try {
            var b = driver.getBatteryInfo();
            System.out.println("Battery: " + b.getLevel());
        } catch(Exception e) {}
    }
}
