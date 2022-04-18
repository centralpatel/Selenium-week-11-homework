package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //Find register and click on register
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        //Requirement
        String expectedMessage = "Register";
        WebElement actualMessageElement = driver.findElement(By.xpath("//div[@class='page-title']"));
        //WebElement actualMessageElement = driver.findElement(By.linkText("Register"));
        //find message text element
        String actualMessage = actualMessageElement.getText();
        Assert.assertEquals("Can not Verify Register : ", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //Find register and click on register
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        //Select and click on gender button
        WebElement genderButton = driver.findElement(By.cssSelector("input#gender-female"));
        genderButton.click();
        // Find Element of First Name
        WebElement firstNameField = driver.findElement(By.id("FirstName"));
        //Send First name to First name field
        firstNameField.sendKeys("Rashila");
        //Find Element of Last name field
        WebElement lastNameField = driver.findElement(By.name("LastName"));
        //Send Last Name to Last name field
        lastNameField.sendKeys("Patel");
        //Find Element of Day field
        WebElement dayField = driver.findElement(By.name("DateOfBirthDay"));
        //Send Date of Birth to Day field
        dayField.sendKeys("13");
        //Find Element of Month field
        WebElement monthField = driver.findElement(By.name("DateOfBirthMonth"));
        //Send Month of Birth to Month field
        monthField.sendKeys("June");
        //Find element of year field
        WebElement yearField = driver.findElement(By.name("DateOfBirthYear"));
        //send Year of birth to Year field
        yearField.sendKeys("1985");
        //Find Element of Email field
        WebElement emailField = driver.findElement(By.id("Email"));
        //Send email address to email field
        emailField.sendKeys("rashila8@gmail.com");
        //Find Element of Password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        // Send password to Password field
        passwordField.sendKeys("Abc123!");
        //Find Element of Confirm Password field
        WebElement confirmPasswordField = driver.findElement(By.id("ConfirmPassword"));
        //Send Password to Confirm Password field
        confirmPasswordField.sendKeys("Abc123!");
        //Find Element of Register button
        WebElement registerButton = driver.findElement(By.id("register-button"));
        //click register button
        registerButton.click();
        String expectedMessage = "Your registration completed";
        //find message text element
        WebElement actualMessageElement = driver.findElement(By.xpath("//div[@class='result']"));
        String actualMessage = actualMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals("Can not verify Message : ", expectedMessage, actualMessage);

    }

    @After

    public void tearDown() {
        closeBrowser();
    }
}
