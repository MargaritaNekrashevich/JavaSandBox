import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();	
        
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://sephora.com");
        //Search by keyword = "sale"
        driver.findElement(By.cssSelector(".css-1j8lj3k")).sendKeys("sale");
        driver.findElement(By.cssSelector(".css-1j8lj3k")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//select[@data-at='search_sort_by']")).click();
        //Sort by "new"
        new Select(driver.findElement(By.xpath("//select[@data-at='search_sort_by']"))).selectByVisibleText("new");
        driver.findElement(By.cssSelector(".css-1j8lj3k")).click();     
        //Click on SKU = 1966902
        driver.findElement(By.xpath(".//a[@data-at='sku_item_1966902']")).click();
        //Add item to basket
        driver.findElement(By.xpath(".//button[@data-at='pdp_add_to_basket']")).click();
        //Navigate to basket
        driver.findElement(By.cssSelector(".css-1lr2cny")).click();  
        //Change quantity from 1 to 2
        driver.findElement(By.cssSelector(".css-wgwr7e")).click(); 
        new Select(driver.findElement(By.cssSelector(".css-xc8mxw"))).selectByVisibleText("2"); 
        driver.findElement(By.cssSelector(".css-1j8lj3k")).click(); 
        //Get Estimated Total
        String estimatedTotal = driver.findElement(By.xpath(".//span[@data-at='bsk_total_cc']")).getText();
        driver.close();
        //Print Estimated Total
        System.out.println("Estimated Total is " + estimatedTotal);
    }
}