package xcartwebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestWithChrome {
    public static void main(String[] args) {
        String string ="https://www.x-cart.com/";
        System.setProperty( "webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );
        driver.get( string );
        String title = driver.getTitle();
        System.out.println(title);
        boolean verifyTitle = title.equals( "X-Cart | The Last Ecommerce Platform You Will Ever Need" );
        System.out.println(verifyTitle);
        boolean verifyIfTitleHas = title.contains( "ecommerce");
        System.out.println(verifyIfTitleHas);
        System.out.println(title.length());
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        driver.close();
    }
}
