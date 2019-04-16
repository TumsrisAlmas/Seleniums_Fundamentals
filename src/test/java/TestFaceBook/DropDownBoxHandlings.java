package TestFaceBook;

import Utilities.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import static PagesElements.FaceBookElements.*;

public class DropDownBoxHandlings extends TestBase {


    @Test(priority = 1)       // we use the priority to give the order numbers of the test cases.
    public void TestingMonthDropDown(){

        // implicity wait makes time out for elemnt to be found, only applies for findElemnt(s) method
            // only need to declarer one time

        Select slect=new Select(monthBox);
        // what ever options in monthbox dropdown box will be avilable to select.

        Mylibraray.sleepForNow(2);
        slect.selectByVisibleText("May");

        Mylibraray.sleepForNow(2);
        slect.selectByValue("8");

        Mylibraray.sleepForNow(2);
        slect.selectByIndex(11);



    }

    @Test(priority = 2)
    public void TestDaysDropDown(){

        Select select=new Select(daysBox);
        Mylibraray.sleepForNow(2);
        select.selectByVisibleText("19");

    }




}
