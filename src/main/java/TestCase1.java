import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.util.Arrays;

public class TestCase1 {

    static ChromeDriver driver;

    @BeforeTest
    static void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions().addArguments("incognito");
        driver = new ChromeDriver(options);
    }

    @AfterClass
    void teardown() {
        driver.quit();

    }

    @Test
    static void testCase1() {
        SteamStorePage steamStorePage = new SteamStorePage(driver);
        SteamStorePage.openSteamSorePage();
        }
    }
