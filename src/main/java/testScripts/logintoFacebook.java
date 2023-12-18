package testScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logintoFacebook {
    private static WebDriver driver;

    @Test(priority = 0)
    public void test1(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.facebook.com");
    }
    /*
    */
    @Test(priority = 1)
    public void test2(){
        System.out.println("This test executing through jenkins");
        System.out.println("heheheheheehe");
    }
}
