package mmn;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cv extends baseclass{
	public static void main(String[] args) throws IOException, AWTException  {
		launchbrowser();
		launchurl("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		Loginpage l= new Loginpage();
		textuser(l.getTxtuser(), "viki1010");
		textuser(l.getTxtpass(), "Viki@1010");
		btnclick(l.getLogbt());
	     
		
		login2 k=new login2();
	     
	     loc(k.getLoca());
	      hotels(k.getHotel());
	      pickin(k.getDatepick(), "09/03/2021");
	      lastdate(k.getDateout(), "09/04/2021");
	      Submit(k.getSubmit());
	      radio(k.getRadio());
	      conti(k.getConti());
	      first(k.getFirst(),"Praveen");
	      last(k.getLast(), "Nevas");
	      addr(k.getAddr(),"Doshi Appatment,West Tamabaram, Chennai-45");
	      credit(k.getCc(),"1234567891012345");
	      ctyp(k.getCtyp());
	      cmon(k.getCcmon());
	      cyr(k.getCcyr());
	      cvv(k.getCcv(),"993");
	      book(k.getBook());
	      
	  }

	
	}


