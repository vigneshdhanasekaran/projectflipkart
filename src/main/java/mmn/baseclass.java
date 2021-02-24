package mmn;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.dynamic.TypeResolutionStrategy.Passive;

public class baseclass {
	//private static final int type = 0;
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
	
	public static void loc(WebElement g) throws AWTException {
	
	g.click();
	
	Robot r1= new Robot();
	for (int i = 0; i <3; i++) {
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
	}
	
	
	r1.keyPress(KeyEvent.VK_ENTER);
	r1.keyRelease(KeyEvent.VK_ENTER);
}	
	public static void hotels(WebElement e) throws AWTException {
  e.click();
  Robot r2= new Robot();
	r2.keyPress(KeyEvent.VK_DOWN);
	r2.keyRelease(KeyEvent.VK_DOWN);
	r2.keyPress(KeyEvent.VK_ENTER);
	r2.keyRelease(KeyEvent.VK_ENTER);
  
  }
	
	
	public static void pickin(WebElement g, String value) {
     g.sendKeys(value);
	}
	public static void lastdate(WebElement g, String value) {
            g.sendKeys(value);
	}
	
	public static void Submit (WebElement d) {
		d.click();
	}
	public static void radio(WebElement r) {
		r.click();
	}
	public static void conti(WebElement p) {
		p.click();
		
	}
	
	public static  void first(WebElement e, String value) {
		e.sendKeys(value);
	
	}
	
	public static  void last(WebElement e, String value) {
		e.sendKeys(value);
	
}
	
	public static  void addr(WebElement e, String value) {
		e.sendKeys(value);
	
}
	
	public static  void credit(WebElement e, String value) {
		e.sendKeys(value);
	   
}
	
	public static void ctyp(WebElement e)throws AWTException {
		e.click();
		
		 Robot r3=new Robot();
		  r3.keyPress(KeyEvent.VK_DOWN);
		  r3.keyRelease(KeyEvent.VK_DOWN);
		  r3.keyPress(KeyEvent.VK_ENTER);
		  r3.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public static void cmon(WebElement e)throws AWTException {
		e.click();
		
		Robot r4=new Robot();
		  r4.keyPress(KeyEvent.VK_DOWN);
		  r4.keyRelease(KeyEvent.VK_DOWN);
		  r4.keyPress(KeyEvent.VK_ENTER);
		  r4.keyRelease(KeyEvent.VK_ENTER);
	
}
	public static void cyr(WebElement e)throws AWTException {
		e.click();
		
		Robot r5=new Robot();
		  r5.keyPress(KeyEvent.VK_DOWN);
		  r5.keyRelease(KeyEvent.VK_DOWN);
		  r5.keyPress(KeyEvent.VK_DOWN);
		  r5.keyRelease(KeyEvent.VK_DOWN);
		  r5.keyPress(KeyEvent.VK_DOWN);
		  r5.keyRelease(KeyEvent.VK_DOWN);
		  r5.keyPress(KeyEvent.VK_DOWN);
		  r5.keyRelease(KeyEvent.VK_DOWN);
		  r5.keyPress(KeyEvent.VK_DOWN);
		  r5.keyRelease(KeyEvent.VK_DOWN);
		  r5.keyPress(KeyEvent.VK_DOWN);
		  r5.keyRelease(KeyEvent.VK_DOWN);
		  r5.keyPress(KeyEvent.VK_DOWN);
		  r5.keyRelease(KeyEvent.VK_DOWN);
		  r5.keyPress(KeyEvent.VK_DOWN);
		  r5.keyRelease(KeyEvent.VK_DOWN);
		  r5.keyPress(KeyEvent.VK_DOWN);
		  r5.keyRelease(KeyEvent.VK_DOWN);
		  r5.keyPress(KeyEvent.VK_DOWN);
		  r5.keyRelease(KeyEvent.VK_DOWN);
		  r5.keyPress(KeyEvent.VK_ENTER);
		  r5.keyRelease(KeyEvent.VK_ENTER);
		  }
	
	public static  void cvv(WebElement e, String value) {
		e.sendKeys(value);
}
	public static void book(WebElement q) {
		q.click();
	
}
}
       
              
       

