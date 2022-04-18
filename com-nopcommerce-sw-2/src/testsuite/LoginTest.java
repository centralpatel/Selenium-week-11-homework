package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //Find login link and click on login Link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Verify Text
        String expectedMessage = "Welcome, Please Sign In!";
        //Find the welcome text element and text
        WebElement actualMessageElement = driver.findElement(By.xpath("//div[@class='page-title']"));
        //find message text element
        String actualMessage = actualMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals("Can not navigate to Login page; ", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //find element for loging button
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        //click on login button
        loginLink.click();
        //Find element for email field
        WebElement emailField = driver.findElement(By.id("Email"));
        //Send email address to email field
        emailField.sendKeys("rashila6@gmail.com");
        //Find Element of Password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        // Send password to Password field
        passwordField.sendKeys("Abc123!");
        //Find Element of login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        loginButton.click();
        //Find Element of Log out button
        String expectedMessage = "Log out";
        //find log out text element
        WebElement actualMessageElement = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        String actualMessage = actualMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals("Can not verify Message : ", expectedMessage, actualMessage);

    }

    @Test
    public void verifyTheErrorMessage() {
        //find element for login button
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        //click on login button
        loginLink.click();
        //Find element for email field
        WebElement emailField = driver.findElement(By.id("Email"));
        //Send email address to email field
        emailField.sendKeys("rashila123@gmail.com");
        //Find Element of Password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        // Send password to Password field
        passwordField.sendKeys("Abc123!");
        //Find Element of login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        loginButton.click();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        //find log out text element
        WebElement actualMessageElement = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualMessage = actualMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals("Can not verify Message : ", expectedMessage, actualMessage);
    }

    @After

    public void tearDown() {
        closeBrowser();
    }
}
