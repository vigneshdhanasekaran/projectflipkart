package flipkart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basee {
	public static WebDriver driver;
	
	 public static WebDriver launchbrowser() {
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\VIGNESH\\\\eclipse-workspace\\\\vignesh\\\\driveresss\\\\chromedriver.exe");
		return driver=new ChromeDriver();
}
	 public static void launchurl(String e) {
       driver.get(e);
	}
	 public static void serachh(WebElement e,String value) {
       e.sendKeys(value);
	}
	 public static void serachclick(WebElement e) {
     e.click();
	}
	 public static void cancelbtn(WebElement k) {
	     k.click();
		}
	 
	public static void phone() {
		
		List<WebElement> phone = driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
             for (int i = 0; i <phone.size() ; i++) {
				String txt=phone.get(i).getAttribute("title");
			    System.out.println(txt);
			}
	}
	  
	      public static void price() {
                 List<WebElement> pri = driver.findElements(By.xpath("//div[@class='_30jeq3']"));
                  for (int i = 0; i < pri.size(); i++) {
					String price=pri.get(i).getText();
					System.out.println(price);
				}
		}
	      
	      public static void ascendingg() {
	    	  List<WebElement> pri = driver.findElements(By.xpath("//div[@class='_30jeq3']"));
              for (int i = 0; i < pri.size(); i++) {
				String price=pri.get(i).getText();
				System.out.println(price);
			}
              List<String> lo=new ArrayList<String>();
                       for (int i = 0; i <pri.size(); i++) {
                    	   String a=pri.get(i).getText();
                    	   lo.add(a.replace(",", ""));
						}
                       Collections.sort(lo);
                       for (int i = 0; i < lo.size(); i++) {
                    	   String aa=lo.get(i);
                    	   System.out.println(aa);
						
					}
		}
	      
	      
	      
}

