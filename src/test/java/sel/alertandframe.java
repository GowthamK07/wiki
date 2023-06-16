package sel;

import java.sql.Driver;
import java.sql.DriverManager;

import javax.swing.Action;
import javax.xml.datatype.Duration;

import org.apache.commons.lang3.time.DurationUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertandframe {
	
	
	public static void main(String[] args) {
		try {
		
		WebDriverManager.chromedriver().setup();
		
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
	WebDriverWait wait = new WebDriverWait(driver, 10);
	 
	driver.findElement(By.xpath("//button[@id='alertButton']"));
	
	alert.click();
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert();
		
	Alert a = driver.switchTo().alert();
		
		a.accept();
		 
		
	driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert();
		
		
		a.dismiss();
		
		
		}
		catch (Exception e) {
			 System.out.println(e.toString());
		}
		
		
		
	}

}
