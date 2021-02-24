package mmn;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

////import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Ignore;
//import org.junit.Test;

public class jjunit extends baseclass {

	@BeforeClass
	public static void beforeclass() {
             launchbrowser();
}
	
	@AfterClass
	public static void afterclass() {
     quit();
	}
	
	@Test
	public void test() throws AWTException {
		launchurl("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		Loginpage l= new Loginpage();
		textuser(l.getTxtuser(), "viki1010");
		textuser(l.getTxtpass(), "Viki@1010");
		btnclick(l.getLogbt());
		
		login2 k=new login2();
	     
	     loc(k.getLoca());
	      hotels(k.getHotel());
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
	
	

