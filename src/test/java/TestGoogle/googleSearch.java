package TestGoogle;

import Utilities.Mylibraray;
import Utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static PagesElements.GoogleElements.*;

public class googleSearch extends TestBase {

    @Test
    public void SearchApple(){

        searchbox.sendKeys("Apple");
        Mylibraray.sleepForNow(3);
        searchbox.sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
                                    // Keys is the class for our keyboard.
        Mylibraray.sleepForNow(10);


    }

}
