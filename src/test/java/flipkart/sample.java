package flipkart;

import java.lang.ref.PhantomReference;
import java.util.concurrent.TimeUnit;

public class sample extends basee {
	
	public static void main(String[] args) throws Exception {
		launchbrowser();
		
		launchurl("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		login l=new login();
		cancelbtn(l.getCancbtn());
		serachh(l.getSearchhhhh(), "Iphone");
	    serachclick(l.getSerachbtn());
	   Thread.sleep(5000);
	    phone();
	    price();
	    ascendingg();
	    driver.quit();
	    
	}
	
	

}
