package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class LoginTest extends BaseTest {
    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValid() {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        //Send email address to email field
        usernameField.sendKeys("standard_user");
        //Find Element of Password field
        WebElement passwordField = driver.findElement(By.name("password"));
        // Send password to Password field
        passwordField.sendKeys("secret_sauce");
        //Find Element of login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        //Find Element of Log out button
        String expectedMessage = "PRODUCTS";
        //find log out text element
        WebElement actualMessageElement = driver.findElement(By.xpath("//span[@class='title']"));
        String actualMessage = actualMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals("Can not verify Message : ", expectedMessage, actualMessage);
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        //Send email address to email field
        usernameField.sendKeys("standard_user");
        //Find Element of Password field
        WebElement passwordField = driver.findElement(By.name("password"));
        // Send password to Password field
        passwordField.sendKeys("secret_sauce");
        //Find Element of login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        //Find Element of products
        List<WebElement> products = driver.findElements(By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name']\n"));
        //Print number of Items
        System.out.println("Items displayed : " + products.size());
        //to Count how many items
        for (WebElement element : products)
            Assert.assertEquals(true, element.isDisplayed());
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}