package Day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class c04_AutomationExercise {

    public static void main(String[] args) {

        //1- Bir test class’i olusturun ilgili ayarlari yapin


        System.setProperty("driver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        //2- https://www.automationexercise.com/ adresine gidin

        driver.get("https://www.automationexercise.com/");

        //3- Sayfada 147 adet link bulundugunu test edin.

        List<WebElement> sitelinktag=driver.findElements(By.tagName("a"));
        int expectedElement=147;
        int actualElement =sitelinktag.size();

        if (expectedElement==actualElement){
            System.out.println("Test başarılı");
        }else {
            System.out.println("Test başarısız");
        }

        //4- Products linkine tiklayin

        WebElement productlink=driver.findElement(By.xpath("//a[@href=\"/products\"]"));
        productlink.click();

        //5- special offer yazisinin gorundugunu test edin
        WebElement specialofferelementi=driver.findElement(By.id("sale_image"));

        if (specialofferelementi.isDisplayed()) {
            System.out.println("test başarılı");
        }else {
            System.out.println("test başarısız");
        }
        //6- Sayfayi kapatin
        driver.close();





    }
}
