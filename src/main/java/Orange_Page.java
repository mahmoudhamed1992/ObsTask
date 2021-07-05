import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Orange_Page extends PageBase{

    @FindBy(linkText = "Solutions")
    public WebElement Solution_tab;
    @FindBy(xpath = "//header/div[1]/nav//div[3]/ul//a[1]")
    public WebElement All_Products_tab;


    public Orange_Page(WebDriver driver) {
        super(driver);
    }

    public void Click_On_Solution(){
        Click_Button(Solution_tab);
    }
    public void Click_On_All_Products(){
        Click_Button(All_Products_tab);
    }

    }


