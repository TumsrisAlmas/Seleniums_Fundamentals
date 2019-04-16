package PagesElements;

import Utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleElements extends TestBase {

    public GoogleElements(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@title='Search']")
    public static WebElement searchbox;


}
