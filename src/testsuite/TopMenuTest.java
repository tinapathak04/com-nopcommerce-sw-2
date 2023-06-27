package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Computers ']")).click();
        driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Electronics ']")).click();
        driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
    }
    @Test
    public  void userShouldNavigateToApparelPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Apparel ']")).click();
        driver.findElement(By.xpath("//h1[text()='Apparel']")).getText();
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Digital downloads ']")).click();
        driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Books ']")).click();
        driver.findElement(By.xpath("//h1[text()='Books']")).getText();
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Jewelry ']")).click();
        driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Gift Cards ']")).click();
        driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
    }


    @After
    public void tearDown(){
        closeBrowser();
    }


}
