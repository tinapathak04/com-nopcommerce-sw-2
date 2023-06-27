package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){

        driver.findElement(By.linkText("Log in")).click();
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("tinap@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("Tp@123");
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        driver.findElement(By.xpath("//a[text()='Log out']")).getText();
    }
    @Test
    public void verifyTheErrorMessage(){
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("tp@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("tp123");
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

        String expectedText = "Login was unsuccessful. Please correct the error and try again." + "No customer account found";
        String actualTextElement = driver.findElement(By.xpath("//li[text()='No customer account found']")).getText();
        Assert.assertEquals("Error message not displayed",expectedText,actualTextElement);
    }




    @After
    public void tearDown(){
        closeBrowser();
    }

}
