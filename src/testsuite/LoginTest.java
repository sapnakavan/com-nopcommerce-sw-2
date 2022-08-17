package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl ="https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //driver.findElement(By.linkText("Log in")).click();
       WebElement loginclick = driver.findElement(By.linkText("Log in"));  //* click on the ‘Login’ link
       loginclick.click();


        WebElement loginButton =driver.findElement(By.linkText("Log in"));
        String actualmess =loginButton.getText();

        // String actualmessage = driver.findElement(By.linkText("Log in")).getText();

        String expectedmessage = "Log in";

        // Assert.assertEquals(expectedmessage,actualmessage);
        Assert.assertEquals(expectedmessage,actualmess);   //* Verify the text ‘Welcome, Please Sign in



    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        // driver.findElement(By.linkText("Log in")).click();
        WebElement loginClick =driver.findElement(By.linkText("Log in"));
        loginClick.click();            //* click on the ‘Login’ link

       // driver.findElement(By.cssSelector("#Email")).sendKeys("sap12@gmail.com");
        WebElement usernamefield = driver.findElement(By.cssSelector("#Email"));
        usernamefield.sendKeys("test@gmail.com");  //* Enter valid username


        //driver.findElement(By.cssSelector("#Password")).sendKeys("123456");
        WebElement passwordfield = driver.findElement(By.cssSelector("#Password"));
        passwordfield.sendKeys("Kavan1385");     //Enter valid password

        //driver.findElement(By.cssSelector(".button-1 login-button"));
        WebElement loginbutton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        loginbutton.click();                  //Click on ‘LOGIN’ button

        WebElement actualmess = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        actualmess.getText();





    }

    @Test
    public void verifyTheErrorMessage() {
        // driver.findElement(By.linkText("Log in")).click();
        WebElement loginClick = driver.findElement(By.linkText("Log in"));
        loginClick.click();            //* click on the ‘Login’ link

        // driver.findElement(By.xpath("//input[@class='email']")).sendKeys("sap12@gmail.com");
        WebElement usernamefield = driver.findElement(By.xpath("//input[@class='email']"));
        usernamefield.sendKeys("Sap@gmail.com");   //Enter invalid username

        // driver.findElement(By.xpath("//input[@class='password'")).sendKeys("123456");
        WebElement passwordfield = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordfield.sendKeys("1236");   //Enter invalid password

        //driver.findElement(By.xpath("//div[@class='buttons'")).click();
        WebElement loginclick = driver.findElement(By.xpath("//div[@class='returning-wrapper fieldset']/form/div[3]/button"));
        loginclick.click();                //Click on Login button

        WebElement verifyText= driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualText= verifyText.getText();
        String expectedText="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        //validtion
        Assert.assertEquals(expectedText,actualText);

    }

    public void VerifyMessage() {

    }


    @After
    public void teardown(){
        closeBrowser();
    }
}
