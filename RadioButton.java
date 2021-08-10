package TestFaceBook;


import static PagesElements.FaceBookElements.*;
import Utilities.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButton extends TestBase {



    @Test(priority = 2)
    public void TestFemaleRadioButton(){
        Mylibraray.sleepForNow(2);
        FmaleRadio.click();

        // verify:
        Assert.assertTrue( FmaleRadio.isSelected());

    }

    @Test(priority = -1)
    public void TestMaleRadioButton(){
        MaleRadio.click();
        Assert.assertTrue(MaleRadio.isSelected());


    }

}
