import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase extends TestBase{
    String arr[] = { "Solution" , "Business innovation", "cloud" , "collaborative workspace" , "Customer exp" ,"Cyberdefense" , "Data Intelligence" , "IOT" , "Mobile connectivity" , "Network transformation" , "services"};
    Google_Search_Page Google_Obj;
    Orange_Page Orange_Obj;
    Products_Page Products_Obj;
    Cloud_Page Cloud_Obj;

    @Test
    public void Validate_DropDownList_Values(){

        SoftAssert softAssertion= new SoftAssert();
        Google_Obj.Search();
        Google_Obj.Click_On_First_Link();
        Orange_Obj.Click_On_Solution();
        Orange_Obj.Click_On_All_Products();
        Products_Obj.Click_on_DropDownList();
        for(int i=0; i<Products_Obj.List_0f_Values(driver).size(); i++) {
            System.out.println("Item " + i + " is : " + Products_Obj.List_0f_Values(driver).get(i).getText());
            softAssertion.assertEquals(arr[i],Products_Obj.List_0f_Values(driver).get(i).getText());
        }
        softAssertion.assertAll();
    }

    @Test
    public void Validate_Selected_Option(){
        Products_Obj.Select_Cloud();
        Cloud_Obj.Select_specified_Article();
        Wait_Element_Visible(Cloud_Obj.Article_Title);
        Assert.assertTrue((Cloud_Obj.Opened_Article().contains("Managed Applications")));
    }

    @BeforeClass
    public void Page_Obj(){
        Google_Obj = new  Google_Search_Page(driver);
        Orange_Obj = new Orange_Page(driver);
        Products_Obj = new Products_Page(driver);
        Cloud_Obj = new Cloud_Page(driver);
    }
}
