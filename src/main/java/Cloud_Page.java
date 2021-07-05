import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cloud_Page extends PageBase{
    @FindBy(xpath = "//span[contains(text(),'Managed Applications: improve operational capabili')]")
    public WebElement Selected_Article;
    @FindBy(xpath = "//*[@id=\"topzonebg\"]//div[2]/div")
    public WebElement Article_Title;



    public Cloud_Page(WebDriver driver) {
        super(driver);
    }

    public void Select_specified_Article() {
        Click_Button(Selected_Article);
    }
    public String Opened_Article(){
        return Article_Title.getText();
    }
}
