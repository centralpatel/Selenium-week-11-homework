package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        WebElement forgotPassword = driver.findElement(By.linkText("Forgot your password?"));
        forgotPassword.click();
        //Find Element of forgot your password
        String expectedMessage = "Forgot Your Password?";
        //find text element
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
        String actualMessage = actualMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals("Can not verify Message : ", expectedMessage, actualMessage);
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
