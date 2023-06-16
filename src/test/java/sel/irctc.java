package sel;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class irctc {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
				
				WebDriver driver = new ChromeDriver();
				
				WebDriverWait wait = new WebDriverWait(driver, 20);
				
				driver.get("https://www.irctc.co.in/nget/train-search");
				
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@aria-controls='pr_id_7_list']")));
				
				WebElement drop = driver.findElement(By.xpath("//input[@aria-controls='pr_id_7_list']"));
				
				drop.sendKeys("egmore");
				
				Select s = new Select(drop);
				s.selectByVisibleText("egmore");
				
	
	}
}
