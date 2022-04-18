package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUP() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        // Find computer tab and click on computer tab
        WebElement computerTab = driver.findElement(By.linkText("Computers"));
        computerTab.click();
        //Requirement
        String expectedMessage = "Computers";
        // Find the Computers text element and get text
        WebElement actualMessageElement = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualMessage = actualMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals("Can not Verify Tab name : ", expectedMessage, actualMessage);
    }

    @Test
    // userShouldNavigateToElectronicsPageSuccessfully
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        // Find Electronics tab and click on Electronics tab
        WebElement electronicsTab = driver.findElement(By.linkText("Electronics"));
        electronicsTab.click();
        //Requirement
        String expectedMessage = "Electronics";
        // Find the Electronics text element and get text
        WebElement actualMessageElement = driver.findElement(By.linkText("Electronics"));
        String actualMessage = actualMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals("Can not Verify Tab name : ", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        // Find Apparel tab and click on Apparel tab
        WebElement apparelTab = driver.findElement(By.linkText("Apparel"));
        apparelTab.click();
        //Requirement
        String expectedMessage = "Apparel";
        // Find the Apparel text element and get text
        WebElement actualMessageElement = driver.findElement(By.linkText("Apparel"));
        String actualMessage = actualMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals("Can not Verify Tab name : ", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        // Find Digital downloads tab and click on Digital downloads tab
        WebElement digitalDownloadsTab = driver.findElement(By.linkText("Digital downloads"));
        digitalDownloadsTab.click();
        //Requirement
        String expectedMessage = "Digital downloads";
        // Find the Digital downloads text element and get text
        WebElement actualMessageElement = driver.findElement(By.linkText("Digital downloads"));
        String actualMessage = actualMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals("Can not Verify Tab name : ", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        // Find Books tab and click on Books tab
        WebElement booksTab = driver.findElement(By.linkText("Books"));
        booksTab.click();
        //Requirement
        String expectedMessage = "Books";
        // Find the Books text element and get text
        WebElement actualMessageElement = driver.findElement(By.linkText("Books"));
        String actualMessage = actualMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals("Can not Verify Tab name : ", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        // Find Jewelry tab and click on Jewelry tab
        WebElement Jewelrytab = driver.findElement(By.linkText("Jewelry"));
        Jewelrytab.click();
        //Requirement
        String expectedMessage = "Jewelry";
        // Find the Jewelry text element and get text
        WebElement actualMessageElement = driver.findElement(By.linkText("Jewelry"));
        String actualMessage = actualMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals("Can not Verify Tab name : ", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        // Find Gift Cards tab and click on Gift Cards tab
        WebElement computerTab = driver.findElement(By.linkText("Gift Cards"));
        computerTab.click();
        //Requirement
        String expectedMessage = "Gift Cards";
        // Find the Gift Cards text element and get text
        WebElement actualMessageElement = driver.findElement(By.linkText("Gift Cards"));
        String actualMessage = actualMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals("Can not Verify Tab name : ", expectedMessage, actualMessage);
    }

    @After

    public void tearDown() {
        closeBrowser();
    }
}
