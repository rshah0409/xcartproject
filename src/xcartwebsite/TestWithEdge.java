package xcartwebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestWithEdge {
    public static void main(String[] args) {
        String string = "https://www.x-cart.com/";
        System.setProperty( "webdriver.edge.driver", "drivers/msedgedriver.exe" );
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
        driver.get( string );
        String title = driver.getTitle();
        System.out.println( title );
        boolean verifyTheTitle = title.equals( "X-Cart | The Last Ecommerce Platform You Will Ever Need" );
        System.out.println( verifyTheTitle );
        boolean verifyIfTitleContain = title.contains( "The Last" );
        System.out.println(verifyIfTitleContain);
        System.out.println( title.length() );
        String pageSource = driver.getPageSource();
        System.out.println( pageSource );
        driver.close();

    }





}
