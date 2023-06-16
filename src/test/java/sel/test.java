package sel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	
	public static void main(String[] args)   {
		
	
		try {
		WebDriverManager.chromedriver().setup();
				
				WebDriver driver =new ChromeDriver();
				
				
				driver.get("https://www.amazon.in");
				
		
				 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 13");
				 
		     driver.findElement(By.xpath("//input[@type='submit']")).click();
              List<WebElement> model = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
             
              int size = model.size();		  
		     System.out.println(size);
		     
     File f = new File("/Users/gowtham/eclipse-workspace/sel/src/main/resources/1mobamz.xlsx");
		
	     Workbook w = new XSSFWorkbook();
		       Sheet s = w.createSheet("iphone");		       
	        for (int i = 0; i <size; i++) {
	        	WebElement web = model.get(i);
	        	String text = web.getText();
	        	Row r = s.createRow(i);
	        	Cell cell = r.createCell(0);
	        	cell.setCellValue(text);
    List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
    
    
    
	    for (int j = i;j==i; j++) {
		       WebElement el = price.get(j);
		       String text2 = el.getText();
	      
			Cell c = r.createCell(1);
			c.setCellValue(text2);
		}		
		}
	       
	     
				FileOutputStream f2 = new FileOutputStream(f);
		
					w.write(f2);
					f2.close();
	     }
	     catch (Exception e){
	    	 System.out.println(e.toString());
	    	 
	     }
	
	

	
	}    
		
	}
		     
			
		

		

	
	



