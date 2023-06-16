package sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowshand {

	
	public static void main(String[] args)   {
		
		 try {	
		
	WebDriverManager.chromedriver().setup();
			
			WebDriver driver =new ChromeDriver();
			
			
			driver.get("https://www.flipkart.com");
			
			WebElement a = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			
			a.click();
		
			 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 13");
			   		   	
	     driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	     
	     Thread.sleep(3000);
	     WebElement ph = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
	     
	     ph.click();
	     
	     String par = driver.getWindowHandle();
	     Set<String> child = driver.getWindowHandles();
	     
	     for (String x : child) {
	    	 
	    	if (!par.equals(x)){
	    		driver.switchTo().window(x);
	    
	    		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
	    		
	    		
	    	}
			
		}
	     
	     
	     
	    
	     
	     
	     
	     
	     
	     
	     
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     
	}
}
