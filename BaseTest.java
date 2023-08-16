package test.TestComponents;

import Pages.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;

import java.time.Duration;

public class BaseTest {

    public ChromeOptions options;
    ChromeDriver driver;
    MainPage mainPage;

    public WebDriver initializeDriver() {
        WebDriverManager.chromedriver().setup();
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        this.driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    public MainPage launchApplication() {
        mainPage = new MainPage(initializeDriver());
        mainPage.goTo();
        return mainPage;
    }

    @AfterSuite
    public void tearDown() {
        driver.close();
    }
}
