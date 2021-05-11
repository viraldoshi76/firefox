package firefoxSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Barclays {

    public static void main(String[] args) {
        String baseUrl= "https://www.barclays.co.uk/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(title.length());

        driver.close();
    }
}
