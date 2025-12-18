
package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import utils.*;

public class StabilityTest extends BaseTest {

    @Test
    public void runStability() {
        driver.activateApp("com.yourcompany.yourapp");
        BatteryMonitor.log(driver);
        CpuMonitor.logCpu("yourapp");
        MemoryMonitor.log("yourapp");
        NetworkMonitor.log();
    }
}
