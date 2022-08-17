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
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //click on the ‘Computers’ Tab
        //driver.findElement(By.linkText("Computers")).click();
        WebElement computer = driver.findElement(By.linkText("Computers"));
        computer.click();


        //Verify the text ‘Computers’
        //driver.findElement(By.linkText("Computers")).getText();
        WebElement computerbutton = driver.findElement(By.linkText("Computers"));
        String actualmess = computerbutton.getText();

        String expectedmess = "Computers";

        Assert.assertEquals(expectedmess, actualmess);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //* click on the ‘Electronics’ Tab
        // driver.findElement(By.linkText("Electronics")).click();
        WebElement electro = driver.findElement(By.linkText("Electronics"));
        electro.click();


        //* Verify the text ‘Electronics’
        //driver.findElement(By.linkText("Electronics")).getText();
        WebElement electronics = driver.findElement(By.linkText("Electronics"));
        String actualmess = electronics.getText();

        String expectedmess = "Electronics";

        Assert.assertEquals(expectedmess, actualmess);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //click on the ‘Apparel’ Tab
        //driver.findElement(By.linkText("Apparel")).click();
        WebElement apparel = driver.findElement(By.linkText("Apparel"));
        apparel.click();

        //* Verify the text ‘Apparel’
        // driver.findElement(By.linkText("Apparel")).getText();
        WebElement apparelbutton = driver.findElement(By.linkText("Apparel"));
        String acctualmess = apparelbutton.getText();
        String expectedmess = "Apparel";
        Assert.assertEquals(expectedmess, acctualmess);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //click on the ‘Digital downloads’ Tab
        // driver.findElement(By.linkText("Digital downloads")).click();
        WebElement digitaldownloads = driver.findElement(By.linkText("Digital downloads"));
        digitaldownloads.click();

        //Verify the text ‘Digital downloads’
        //driver.findElement(By.linkText("Digital downloads")).getText();
        WebElement digitalbutton = driver.findElement(By.linkText("Digital downloads"));
        String acctualmess = digitalbutton.getText();
        String expectedmess = "Digital downloads";
        Assert.assertEquals(expectedmess, acctualmess);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //click on the ‘Books’ Tab
        // driver.findElement(By.linkText("Books")).click();
        WebElement digitaldownloads = driver.findElement(By.linkText("Books"));
        digitaldownloads.click();

        //Verify the text ‘Books’
        //driver.findElement(By.linkText("Books")).getText();
        WebElement digitalbutton = driver.findElement(By.linkText("Books"));
        String acctualmess = digitalbutton.getText();
        String expectedmess = "Books";
        Assert.assertEquals(expectedmess, acctualmess);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //click on the ‘Jewelry’ Tab
        // driver.findElement(By.linkText("Jewelry")).click();
        WebElement digitaldownloads = driver.findElement(By.linkText("Jewelry"));
        digitaldownloads.click();

        //Verify the text ‘jewelry’
        //driver.findElement(By.linkText("Jewelry")).getText();
        WebElement digitalbutton = driver.findElement(By.linkText("Jewelry"));
        String acctualmess = digitalbutton.getText();
        String expectedmess = "Jewelry";
        Assert.assertEquals(expectedmess, acctualmess);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //click on the ‘Gift Cards’ Tab
        // driver.findElement(By.linkText("Gift Cards")).click();
        WebElement digitaldownloads = driver.findElement(By.linkText("Gift Cards"));
        digitaldownloads.click();

        //Verify the text ‘Gift Cards’
        //driver.findElement(By.linkText("Gift Cards")).getText();
        WebElement digitalbutton = driver.findElement(By.linkText("Gift Cards"));
        String acctualmess = digitalbutton.getText();
        String expectedmess = "Gift Cards";
        Assert.assertEquals(expectedmess, acctualmess);
    }

    @After
    public void teardown() {
        closeBrowser();

    }
}