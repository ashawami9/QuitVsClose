import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CloseTheTest {
    private WebDriver driver;

    @BeforeMethod
    public void initialSetup(){
        System.setProperty("webdriver.chrome.driver" , "/Users/ashawami/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://in.indeed.com/");
    }

    @AfterMethod
    public void endSetup(){
        driver.close();
    }

    @Test
    public void testDriverDotClose() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement login_button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("gnav-LoggedOutAccountLink")));
        login_button.click();
        WebElement facebook_login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pass-SocialButton--facebook")));
        facebook_login.click();
    }
}
