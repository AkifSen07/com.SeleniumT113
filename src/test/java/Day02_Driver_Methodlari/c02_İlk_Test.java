package Day02_Driver_Methodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class c02_İlk_Test {
    public static void main(String[] args) throws InterruptedException {
        /*




        6. Sayfa adresini(url) yazdirin

        8. Sayfa handle degerini yazdirin
        9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        10. Sayfayi kapatin. */


        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("http://www.amazon.com/");

        // 4. Sayfa basligini(title) yazdirin
        System.out.println("Sayfanın başlığı: "+driver.getTitle());

        //5. Sayfa basliginin “Amazon” icerdigini test edin

        String expectedicerik = "Amazon";
        String sayfabaslik= driver.getTitle();

        if (sayfabaslik.contains(expectedicerik)) {
            System.out.println("sayfanın başlığı Amazon kelimesini içeriyor");
        }else {
            System.out.println("sayfanın başlığı Amazon kelimesini içermiyor");
        }
        //  6. Sayfa adresini(url) yazdirin

        System.out.println("Sayfa URLsi: "+driver.getCurrentUrl());

        //7. Sayfa url’inin “amazon” kelimesini icerdigini test edin.
        expectedicerik="amazon";
        String sayfaurl=driver.getCurrentUrl();


        if (sayfaurl.contains(expectedicerik)) {
            System.out.println("sayfanın urlsi amazon kelimesini içeriyor");
        }else {
            System.out.println("sayfanın urlsi amazon kelimesini içermiyor");}

        //8. Sayfa handle degerini yazdirin
        System.out.println("Sayfanin handle degeri : " + driver.getWindowHandle());
        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin

        expectedicerik="alisveris";
        String actualPageSource= driver.getPageSource();

        if (actualPageSource.contains(expectedicerik)){
            System.out.println("Sayfa kaynak kodlari alisveris iceriyor, test PASSED");
        }else {
            System.out.println("Sayfa kaynak kodlari alisveris icermiyor, test FAILED");
        }




        Thread.sleep(1000);

        driver.close();
    }
}
