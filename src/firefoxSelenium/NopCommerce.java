package firefoxSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class NopCommerce {
    public static void main(String[] args) {
        String baseUrl = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.close();

    }

}
