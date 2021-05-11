package xcartwebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class TestWithMultiBrowser {
    static String baseUrl = "https://www.x-cart.com/";
    static String checkeThisUrl = "edge";
   static WebDriver driver;
    public static void main(String[] args) {
        if(checkeThisUrl.equalsIgnoreCase( "chrome" )){
            System.setProperty( "webdriver.chrome.driver","drivers/chromedriver.exe" );
            driver = new ChromeDriver();
        }else if(checkeThisUrl.equalsIgnoreCase( "ie" )){
            System.setProperty( "webdriver.ie.driver","drivers/IEDriverServer.exe" );
            driver = new InternetExplorerDriver();
            driver.close();

        }else if(checkeThisUrl.equalsIgnoreCase( "edge" )){
            System.setProperty( "webdriver.edge.driver","drivers/msedgedriver.exe" );
            driver = new EdgeDriver();

        }else if (checkeThisUrl.equalsIgnoreCase( "firefox" )){
            System.setProperty( "webdriver.gecko.driver","drivers/geckodriver.exe" );
            driver = new FirefoxDriver();
        }else{
            System.out.println("you have wrong browser name");
        }driver.get( baseUrl );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 30, TimeUnit.SECONDS );
        driver.close();

    }
}
