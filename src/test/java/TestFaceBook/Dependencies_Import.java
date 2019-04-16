package TestFaceBook;

import Utilities.Mylibraray;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dependencies_Import {

    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();   // sets up the driver environemnt
        WebDriver driver=new ChromeDriver();   // open with chrome.

    //    driver.get("https://www.facebook.com");    //  get access to a website

        driver.navigate().to("https://www.facebook.com");  // get access to website

        // differences between Get and Navigate.to :
            //  get waits for the page to be fully Uploaded, Navigae.to does not have to wait.      ==> navigate.to is faster

        // refresh the website:
                driver.navigate().refresh();   // refreshes the web.
        Thread.sleep(3000);

        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().back();
        driver.navigate().forward();
        // driver.navigate().back()  ==> previous web
        // driver.navigate().forward() ==>

    }

    @Test
    public void testingBrowsers(){
        WebDriverManager.chromedriver().setup();   // sets up the driver environemnt
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();  // maximizes the window
      //  driver.manage().window().fullscreen();   // full screen the window


        driver.navigate().to("https://www.facebook.com");
        Mylibraray.sleepForNow(5);   // custome method (thread.sleep)

        driver.navigate().to("https://www.google.com");
        Mylibraray.sleepForNow(5);

        driver.navigate().back();
        Mylibraray.sleepForNow(5);

        driver.navigate().forward();
        Mylibraray.sleepForNow(5);

        driver.navigate().refresh();
        Mylibraray.sleepForNow(5);

        driver.quit();


    }


}
