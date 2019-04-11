package Seleniums_Handlings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreatingWebElment {


    @Test
    public void TestFaceBook(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.facebook.com");

        /*
        to create the web element we will need 8 locators:
                        ID, Name, ClassName, TagName, CSS, Xpath, LinkedText, PartialLinkedText

             // formula to write xpath:   .//tagname[@valu1=' ' and @value2='' and  ...]

         */

        WebElement firstNamebox =driver.findElement(By.xpath("//input[@type='text' and @aria-label='First name']"));
        firstNamebox.sendKeys("Muhtar");

        WebElement lastName=driver.findElement(By.xpath(".//input[@type='text' and @name='lastname']"));
                lastName.sendKeys("Mahmut");

        WebElement PhoneNum=driver.findElement(By.xpath("//input[@name='reg_email__']"));
            PhoneNum.sendKeys("00000112312312");

        // formula to write xpath:   .//tagname[@valu1=' ' and @value2='' and  ...]








    }



}
