package sel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class table {
	
	
	public static void main(String[] args) {
		
	

	
		
		
		try {
				WebDriverManager.chromedriver().setup();
				
				WebDriver driver = new ChromeDriver();
				
				
				
			 
			 File f = new File("/Users/gowtham/eclipse-workspace/sel/src/main/resources/data.xlsx");
		     Workbook w = new XSSFWorkbook();
		       Sheet s = w.createSheet("data");
		       driver.get("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");	
				driver.manage().window().maximize();
				
			WebElement table = driver.findElement(By.xpath("(//table)[1]"));
			List<WebElement> totalrow = table.findElements(By.tagName("tr"));
			for (int i = 0; i < totalrow.size(); i++) {
				Row createrow = s.createRow(i);
				WebElement col = totalrow.get(i);
				
				List<WebElement> colval = col.findElements(By.tagName("td"));
				
				
				for (int j = 0; j < colval.size(); j++) {
					WebElement cellvalue = colval.get(i);
					
					String text = cellvalue.getText();
					createrow.createCell(j).setCellValue(text);
					
					
				}
			}
				
				
		
			FileOutputStream f2 = new FileOutputStream(f);
			
			w.write(f2);
			f2.close();	
				
				
				
				
				
				
				
				
				
				
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
