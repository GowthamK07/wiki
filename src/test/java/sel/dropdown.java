package sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	
	
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement drop = driver.findElement(By.xpath("//select[@id='first']"));
		
		Select s = new Select(drop);
		s.selectByVisibleText("Iphone");
		List<WebElement> options = s.getOptions();
	for (int i = 0; i < options.size(); i++) {
		
		WebElement a = options.get(i);
		System.out.println(a.getText());
	
	}
	
	WebElement drop1 = driver.findElement(By.xpath("//select[@id='second']"));
	Select s1 = new Select(drop1);
	s1.selectByIndex(1);
	s1.selectByIndex(2);
	s1.deselectByIndex(1);
	
	List<WebElement> all = s1.getAllSelectedOptions();
	
	for (int i = 0; i < all.size(); i++) {
		WebElement b = all.get(i);
		System.out.println(b.getText());
	}

	

		
	}
	

}
