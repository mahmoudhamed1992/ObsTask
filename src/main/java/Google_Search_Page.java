import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Google_Search_Page extends PageBase{

    final String Search_Value = "Orange business services" ;

    @FindBy(name="q")
    public WebElement Search_Box;

    @FindBy(xpath="//*[@id=\"rso\"]/div[1]//h3")
    public WebElement First_Link;

    public Google_Search_Page(WebDriver driver) {
        super(driver);
    }
    public void Search (){
       Click_Button(Search_Box);
       Clear_Text(Search_Box);
       Type(Search_Box,Search_Value);
       Search_Box.sendKeys(Keys.ENTER);
    }
    public void Click_On_First_Link(){
        Click_Button(First_Link);
    }


}
