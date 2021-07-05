import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
    protected WebDriver driver;

    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public static void Click_Button(WebElement button) {
            button.click();
    }

    public static void Type (WebElement textElement, String value) {
        textElement.sendKeys(value);
    }

    public void Clear_Text(WebElement element) {
        element.clear();
    }



}
