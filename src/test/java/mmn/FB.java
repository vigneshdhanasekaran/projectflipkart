package mmn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
public static WebDriver driver;
	
	public static WebDriver launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIGNESH\\eclipse-workspace\\vignesh\\driveresss\\chromedriver.exe");
		
		return driver=new ChromeDriver();
		
		}
	public static void launchurl(String url) {
		driver.get(url);
	}
	public static  void textuser(WebElement e, String value) {
		e.sendKeys(value);
		}
	public static void btnclick(WebElement e) {
	 e.click();
	 }
	
	public static void quit() {
		driver.quit();
	}
	
	public static String  datadrive(int rowno, int cellno) throws IOException {
	
		File loc= new File("C:\\Users\\VIGNESH\\eclipse-workspace\\mmn\\target\\data.xlsx");
		FileInputStream st=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(st);
		Sheet sheet=w.getSheet("dat");
		Row row = sheet.getRow(rowno);
		Cell c = row.getCell(cellno);
		
		int type =c.getCellType();
		String value = null;
		if( type ==1) {
			value =c.getStringCellValue();
		}
//		else if(DateUtil.isCellDateFormatted(c)) {
//			Date date=c.getDateCellValue();
//			SimpleDateFormat sf= new SimpleDateFormat("dd/MM/yyyy");
//			value =sf.format(date);
//		}
		else {
			double db = c.getNumericCellValue();
			long lg=(long)db;
			value = String.valueOf(lg);
		}
		return value;
		}

		
		
	}
	




	

