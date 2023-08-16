package test.TestComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractComponents {

    WebDriverWait wait;
    WebDriver driver;
    public AbstractComponents(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void waitForElemToAppear(By findBy) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }
    public void waitForElemToAppear(WebElement elem) {
        wait.until(ExpectedConditions.visibilityOf(elem));
    }
    public void waitForElementToDisappear(WebElement wb) {
        wait.until(ExpectedConditions.invisibilityOf(wb));
    }
}
