import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Products_Page extends PageBase {

   @FindBy(css = "#edit-solutions")
    public WebElement dropDownList ;
    @FindBy(xpath = "//option[contains(text(),'Cloud')]")
    public WebElement Cloud_Selection;
    @FindBy(xpath = "//*[@id=\"edit-submit-subhomes\"]")
    public WebElement Apply_Button;

    public Products_Page(WebDriver driver) {
        super(driver);
    }

    public void Click_on_DropDownList(){ Click_Button(dropDownList); }

    public List <WebElement> List_0f_Values(WebDriver driver){
        List<WebElement> dropdownvalues = driver.findElements(By.xpath("//option"));
        return dropdownvalues;
    }

    public void Select_Cloud() {
        Click_Button(Cloud_Selection);
        Click_Button(Apply_Button);
    }
}
