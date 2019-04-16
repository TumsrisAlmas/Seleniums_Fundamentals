package PagesElements;

import Utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class FaceBookElements extends TestBase {

    public FaceBookElements(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "firstname")
    public static WebElement firstname;

    @FindBy(name = "lastname")
    public static WebElement lastname;

    @FindBy(name = "reg_email__")
    public static WebElement email;

    @FindBy(name = "reg_passwd__")
    public static WebElement newPassWord;

    @FindBy(xpath = ".//select[@id='day']")
    public static WebElement daysBox;

    @FindBy(xpath = " .//select[@id='month']")
    public static WebElement  monthBox;

    @FindBy(xpath =".//input[@value='1']" )
    public static WebElement FmaleRadio;

    @FindBy(xpath = ".//input[@value='2']")
    public static WebElement MaleRadio;


}
