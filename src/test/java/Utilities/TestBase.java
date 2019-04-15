package Utilities;

import PagesElements.DropDownElemnts;
import PagesElements.RadioButtonsElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.scene.layout.Priority;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;


    @BeforeMethod()   // controls how the @Test method will be executed.
    public void setup01(){
        // this before method is to setup browsers.
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @BeforeMethod
    public void setup02(){
        // this before method is to run each weblemnt page' constructor. (PageFactory).
        new RadioButtonsElement();  new DropDownElemnts();

    }

    @AfterMethod
    public void end(){
        driver.quit();
        driver = null;
    }





}
