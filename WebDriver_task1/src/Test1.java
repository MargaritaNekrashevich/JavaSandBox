import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;

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
        
        //Verify keyword for search results
        String keyword = driver.findElement(By.xpath(".//b[@class='u-fwb ng-binding']")).getText();
        Assert.assertEquals(keyword, "“sale”");            
        
        //Sort by "new"
        new Select(driver.findElement(By.xpath("//select[@data-at='search_sort_by']"))).selectByVisibleText("new");
        driver.findElement(By.cssSelector(".css-1j8lj3k")).click(); 
       
        //Click on SKU = 1966902
        driver.findElement(By.xpath(".//div[@class='SkuItem-nameDisplay ng-binding' and @data-at='sku_item_name' and .='Notes of Joy, Love, & Grace Coffret']")).click();
        
        //Add item to basket
        driver.findElement(By.xpath(".//button[@data-at='pdp_add_to_basket']")).click();
       
        //Navigate to basket
        driver.findElement(By.cssSelector(".css-1lr2cny")).click();
        
        //Get estimated price
        String estimatedPrice_Actual = driver.findElement(By.xpath (".//span[@data-at='bsk_total_cc']")).getText();
        estimatedPrice_Actual = estimatedPrice_Actual.replace("$","");
       
        //Change quantity from 1 to 2
        driver.findElement(By.cssSelector(".css-wgwr7e")).click(); 
        String newQuantity="2";
        new Select(driver.findElement(By.cssSelector(".css-xc8mxw"))).selectByVisibleText(newQuantity); 
        driver.findElement(By.cssSelector(".css-1j8lj3k")).click(); 
        
        //Get Estimated Total
        String estimatedTotal_Actual = driver.findElement(By.xpath(".//span[@data-at='bsk_total_cc']")).getText();
        estimatedTotal_Actual = estimatedTotal_Actual.replace("$","");
        driver.close();  
           
        //Verify basket calculations and print them out             
        Float newQuantity_Float = Float.parseFloat(newQuantity);
        Float estimatedPrice_Actual_Float = Float.parseFloat(estimatedPrice_Actual);
        Float estimatedTotal_Actaul_Float = Float.parseFloat(estimatedTotal_Actual);     
        
        Float estimatedTotal_Expected = newQuantity_Float*estimatedPrice_Actual_Float;
        
        Assert.assertEquals(estimatedTotal_Actaul_Float, estimatedTotal_Expected, 0, "FAILED - Basket calculations are incorrect");
        
        System.out.println("Estimated Price for 1 item is " + estimatedPrice_Actual_Float);
        System.out.println("Number of items " + newQuantity_Float);
        System.out.println("Estimated Total (actual) is " + estimatedTotal_Actaul_Float);
        System.out.println("Estimated Total (expected) is  " + estimatedTotal_Expected);   
  
    }
}