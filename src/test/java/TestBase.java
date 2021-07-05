import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    public static WebDriver driver;

    @BeforeSuite
    public void Setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.Google.com");
    }

    public void Wait_Element_Visible(WebElement element) {
        WebDriverWait WebWait = new WebDriverWait(driver, 1000);
        WebWait.until(ExpectedConditions.visibilityOf(element));
    }
    @AfterSuite
   public void TearDown(){
       driver.quit();
  }
}
