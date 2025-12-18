
package base;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.testng.annotations.*;
import java.net.URL;

public class BaseTest {
    protected IOSDriver driver;

    @BeforeClass
    public void setup() throws Exception {
        BaseOptions options = new BaseOptions()
            .amend("platformName", "iOS")
            .amend("automationName", "XCUITest")
            .amend("deviceName", "iPhone")
            .amend("udid", "YOUR_UDID")
            .amend("bundleId", "com.yourcompany.yourapp");

        driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}
