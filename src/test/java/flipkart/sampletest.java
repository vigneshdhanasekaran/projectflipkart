package flipkart;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sampletest extends basee{
	@BeforeClass
	private void beforeclass() {
launchbrowser();
	}
	@BeforeMethod
	private void beforemethod() {

	}
	
	@AfterClass
	private void afterclass() {
		
	}
	@AfterMethod
	private void aftermethod() {
		
	}
	@Test
	private void test1() {
		launchurl("https://www.flipkart.com/");
		login l=new login();
		serachh(l.getSearchhhhh(), "oneplus");
		serachclick(l.getSerachbtn());

	}
	
	
	
	
	}
