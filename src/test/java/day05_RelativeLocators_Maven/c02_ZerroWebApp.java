package day05_RelativeLocators_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c02_ZerroWebApp {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

        //2. Signin buttonuna tiklayin
        driver.findElement(By.className("icon-signin")).click();
        Thread.sleep(1000);

        //3. Login alanine “username” yazdirin

        WebElement loginelementi=driver.findElement(By.id("user_login"));
        loginelementi.sendKeys("username");
        Thread.sleep(1000);

        //4. Password alanina “password” yazdirin
        WebElement PasswordElementi=driver.findElement(By.id("user_password"));
        PasswordElementi.sendKeys("password");
        Thread.sleep(1000);

        // 5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//*[@name=\"submit\"]")).click();

        //6. Back tusu ile sayfaya donun

        driver.navigate().back();

        //7. Online Banking menusunden Pay Bills sayfasina gidin

        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.id("pay_bills_link")).click();


        //8. amount kismina yatirmak istediginiz herhangi bir miktari yazin

        WebElement amount= driver.findElement(By.id("sp_amount"));

        amount.sendKeys("200");
        Thread.sleep(1000);


        //9. tarih kismina “2020-09-10” yazdirin

        WebElement tarihElementi=driver.findElement(By.id("sp_date"));
        tarihElementi.sendKeys("2020-09-10");
        Thread.sleep(1000);


        //10. Pay buttonuna tiklayin

        driver.findElement(By.id("pay_saved_payees")).click();
        Thread.sleep(1000);

        //11. “The payment was successfully submitted.” mesajinin ciktigini test edin*/

        WebElement mesajElementi=driver.findElement(By.xpath("//span[text()=\"The payment was successfully submitted.\"]"));
        if (mesajElementi.isDisplayed()){
            System.out.println("Test Başarılı");

        }else {
            System.out.println("Test Başarısız");
        }
        driver.close();














    }

}
