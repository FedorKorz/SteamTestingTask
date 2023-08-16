package Tests;

import Pages.LoginPage;
import test.TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SteamStoreLoginTest extends BaseTest {

    @Test
    public void testLoginForm() {
        LoginPage loginPage = launchApplication().loginApplication();
        Assert.assertTrue(loginPage.getLoginPage().isDisplayed());
        loginPage.login();
        Assert.assertTrue(loginPage.getLoginLoadingBar().isDisplayed());
        Assert.assertTrue(loginPage.getErrorMessage().isDisplayed());
    }
}
