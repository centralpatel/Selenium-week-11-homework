package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        //Send email address to email field
        usernameField.sendKeys("Admin");
        //Find Element of Password field
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        // Send password to Password field
        passwordField.sendKeys("admin123");
        //Find Element of login button
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        //Find Element of Welcome Message
        String expectedMessage = "Welcome Paul";
        //find text element
        WebElement actualMessageElement = driver.findElement(By.partialLinkText("Welcome"));
        String actualMessage = actualMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals("Can not verify Message : ", expectedMessage, actualMessage);
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
