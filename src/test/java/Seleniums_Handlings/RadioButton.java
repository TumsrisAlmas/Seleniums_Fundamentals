package Seleniums_Handlings;


import static PagesElements.RadioButtonsElement.*;
import Utilities.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButton extends TestBase {



    @Test(priority = 2)
    public void TestFemaleRadioButton(){
        driver.navigate().to("https://www.facebook.com");
        Mylibraray.sleepForNow(2);
        FmaleRadio.click();

        // verify:
        Assert.assertTrue( FmaleRadio.isSelected());

    }

    @Test(priority = -1)
    public void TestMaleRadioButton(){
        driver.navigate().to("https://www.facebook.com");
        MaleRadio.click();
        Assert.assertTrue(MaleRadio.isSelected());


    }

}
