package sel;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptandscreenshot {
	
	
	public static void main(String[] args) {
		
		try {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		 
             driver.get("https://www.flipkart.com");
             
             JavascriptExecutor js = (JavascriptExecutor)driver ;
		
		    WebElement a = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		      a.click();
	
		 WebElement ser = driver.findElement(By.xpath("//input[@name='q']"));
		 
		 js.executeScript("arguments[0].setAttribute('value','iphone 13')", ser);
//		 js.executeScript("arguments[0].setAttribute('style','border:3px solid black');('background:Yellow')", ser);
		 Object print = js.executeScript("return arguments[0].getAttribute('value')", ser);
		 System.out.println(print);
		 
		 TakesScreenshot sh = (TakesScreenshot)driver ;
		 
		 File loc = sh.getScreenshotAs(OutputType.FILE);
		 File store = new File("/Users/gowtham/eclipse-workspace/sel/src/test/resources/sk1.png");
		 
		 FileUtils.copyFile(loc, store);
		 
		 
		
		 
		 
		 
		 
		 WebElement s = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		 
		 js.executeScript("arguments[0].click()", s);
	     
	    
		 
		
		
//		driver.findElement(By.xpath("//a[contains(text(),'Return Policy')]")).click();
		
		
//		js.executeScript("arguments[0].scrollIntoView(true)", returnn);
		
	
		js.executeScript("argumument[0].s", args)
		
		
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
	}


}
