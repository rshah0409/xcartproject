package xcartwebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class TestWithIE {
    public static void main(String[] args) {
        String string = "https://www.x-cart.com/";
        System.setProperty( "webdriver.ie.driver", "drivers/IEDriverServer.exe" );
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );
        driver.get( string );
        String title = driver.getTitle();
        System.out.println( title );
        boolean verifyTitle = title.equals( "X-Cart | The Last Ecommerce Platform You Will Ever Need" );
        System.out.println( verifyTitle );
        boolean verifyIfTitleHas = title.contains( "Ecommerce" );
        System.out.println(verifyIfTitleHas);
        System.out.println( title.length() );
        String pageSource = driver.getPageSource();
        System.out.println( pageSource );
        driver.close();
        driver.quit();
    }
}