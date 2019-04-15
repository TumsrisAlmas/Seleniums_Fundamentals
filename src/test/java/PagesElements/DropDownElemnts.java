package PagesElements;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownElemnts extends TestBase {

    public DropDownElemnts(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = ".//select[@id='day']")
    public static WebElement daysBox;

   @FindBy(xpath = " .//select[@id='month']")
    public static WebElement  monthBox;




}
