import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();	
        
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://amazon.com");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone SE");
        driver.findElement(By.xpath("//input[@value='Go']")).click();
        driver.findElement(By.cssSelector("#result_0 a.s-access-detail-page")).click();
        String price = driver.findElement(By.cssSelector("#priceblock_ourprice")).getText();
        driver.close();
        System.out.println("iPhone SE price is " + price);
    }
}