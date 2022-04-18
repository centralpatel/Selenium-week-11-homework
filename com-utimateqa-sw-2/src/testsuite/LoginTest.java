package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://courses.ultimateqa.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //Find signin Element and click it
        WebElement signin = driver.findElement(By.xpath("//li[@class='header__nav-item header__nav-sign-in']"));
        signin.click();
        //Find Element of Welcome Back Message
        String expectedMessage = "Welcome Back!";
        //Find text element
        WebElement actualMessageElement = driver.findElement(By.linkText("Welcome Back!"));
        String actualMessage = actualMessageElement.getText();
        //Validate actual and expected Message
        Assert.assertEquals("Not a valid Message : ", expectedMessage, actualMessage);
    }

    @Test
    public void verifyTheErrorMessage() {
        //Find signin element and click it
        WebElement signin = driver.findElement(By.xpath("//li[@class='header__nav-item header__nav-sign-in']"));
        signin.click();
        //Find element of email field
        WebElement emailfield = driver.findElement(By.id("user[email]"));
        // send username to username field
        emailfield.sendKeys("rashila13@gmail.com");
        //Find element of password field
        WebElement passwordfield = driver.findElement(By.name("user[password]"));
        // Send password to password field
        passwordfield.sendKeys("Abc123");
        //Find login element and click
        WebElement login = driver.findElement(By.xpath("//input[@class='button button-primary g-recaptcha']"));
        login.click();
        //From requirement
        String expectedMessage = "Invalid email or password.";
        //Find the error message element
        WebElement actualMessageElement = driver.findElement(By.xpath("//li[@class='form-error__list-item']"));
        String actualMessage = actualMessageElement.getText();
        //Validate actual and expected Message
        Assert.assertEquals("Can not Verify Message : ", expectedMessage, actualMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
