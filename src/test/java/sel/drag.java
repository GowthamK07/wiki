package sel;

import java.awt.Robot;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag   {

	public static void main(String[] args) {
	
		try {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions a = new Actions(driver);
		
//		WebElement source = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
//		WebElement target = driver.findElement(By.xpath("//li[contains(@class,'placeholder')][1]"));
//		
//		
//		a.dragAndDrop(source, target).build().perform();
//		
//		WebElement source2 = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
//		WebElement target2 = driver.findElement(By.xpath("(//li[contains(@class,'placeholder')])[2]"));
//		
//		a.dragAndDrop(source2, target2).build().perform();
		
		WebElement source3 = driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
		WebElement target3 = driver.findElement(By.xpath("(//li[contains(@class,'placeholder')])[3]"));
	
		a.dragAndDrop(source3, target3).build().perform();
        
//		WebElement source4 = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[4]"));
//		WebElement target4 = driver.findElement(By.xpath("//li[contains(@class,'placeholder')][1]"));
//		a.dragAndDrop(source4, target4).build().perform();
		
	
		TakesScreenshot sh = (TakesScreenshot)driver ;
		
		
		
		
		
		}
		catch (Exception e) {
			
			System.out.println(e.toString());
		}
	}
	
	
}
