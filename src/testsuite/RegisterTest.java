package testsuite;

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String baseUrl ="https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //* click on the ‘Register’ link
        //driver.findElement(By.linkText("Register")).click();
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();

        // * Verify the text ‘Register’
       // driver.findElement(By.linkText("Register")).getText();
        WebElement digitalbutton = driver.findElement(By.linkText("Register"));
        String acctualmess = digitalbutton.getText();
        String expectedmess = "Register";
        Assert.assertEquals(expectedmess, acctualmess);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //* click on the ‘Register’ link
        //driver.findElement(By.linkText("Register")).click();
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();

        //* Select gender radio button
        //driver.findElement(By.xpath("//input[@id='gender-female']")).click();
        WebElement radiobuton = driver.findElement(By.xpath("//input[@id='gender-female']"));
        radiobuton.click();

        //driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        WebElement radiobutton = driver.findElement(By.xpath("//input[@id='gender-male']"));
        radiobutton.click();

      //* Enter First name
        //driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("john");
        WebElement firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstname.sendKeys("john");

        //* Enter Last name
        //driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("patric");
        WebElement lastname = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastname.sendKeys("patric");

        //* Select Day Month and Year
        //driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("2");
        WebElement day = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        day.sendKeys("2");

        //driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("june");
        WebElement month = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        month.sendKeys("june");


        //driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1995");
        WebElement year = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        year.sendKeys("1995");


        //* Enter Email address
        //driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("test1234@gmail.com");
        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("test1234@gmail.com");

        //* Enter Password
        //driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Test12");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("Test12");

        //* Enter Confirm password
        //driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Test12");
        WebElement confirmpass = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmpass.sendKeys("Test12");


        //* Click on REGISTER button
        //driver.findElement(By.xpath("//button[@id='register-button']")).click();
        WebElement registerbut= driver.findElement(By.xpath("//button[@id='register-button']"));
        registerbut.click();

        //* Verify the text 'Your registration completed’

        WebElement verifyText=driver.findElement(By.xpath("//div[@class='result']"));
        String actualText= verifyText.getText();
        String expectedText="Your registration completed";

        Assert.assertEquals(expectedText,actualText);
    }



     @After
     public void teardown(){
        //closeBrowser();

}
}