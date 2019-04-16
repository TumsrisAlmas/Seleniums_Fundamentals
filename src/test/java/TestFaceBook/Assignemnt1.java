package TestFaceBook;

import Utilities.*;
import org.testng.annotations.Test;
import static PagesElements.FaceBookElements.*;

public class Assignemnt1 extends TestBase {

    @Test
    public void EnterInputs(){

        firstname.sendKeys("Muhtar");
        lastname.sendKeys("Mahmut");
        email.sendKeys("sadasdasdasdasda");
        newPassWord.sendKeys("12312312312");

        Mylibraray.sleepForNow(10);


    }

}
