package Day03_Locators;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class c02_FindElements {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://automationexercise.com/");
        List<WebElement> kategoriElementi=driver.findElements(By.className("panel-title"));

        int expectedsize=3;
        int actualsize=kategoriElementi.size();

        if (expectedsize==actualsize){
            System.out.println("Kategori elementi 3 eleman bulunduruyor");
        }else {
            System.out.println("Kategori elementi 3 eleman bulundurmuyor");
        }

         /*  System.out.println(categoryElementsList);
            Normalde bir list direk yazdirilabilir
            Ancak findElements() ile bulunan elementler Webelement oldugundan direk YAZDIRILAMAZ
            bir for-each loop kullanilarak listenin elementleri yazdirilabilir
         */

        for (WebElement eachElement: kategoriElementi
        ) {
            System.out.println(eachElement.getText());
        }

        //6- Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();


    }
}
