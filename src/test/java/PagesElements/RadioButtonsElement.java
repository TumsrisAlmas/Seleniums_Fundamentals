package PagesElements;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonsElement extends TestBase {

    public RadioButtonsElement(){
        PageFactory.initElements(driver, this);
    }

        @FindBy(xpath =".//input[@value='1']" )
        public static WebElement FmaleRadio;

        @FindBy(xpath = ".//input[@value='2']")
        public static WebElement MaleRadio;


}
