package mmn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage extends baseclass {
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
		}
	
	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getLogbt() {
		return logbt;
	}

	@FindBy(id="username")
	private WebElement txtuser;
	
	@FindBy(id="password")
	private WebElement txtpass;
	
	@FindBy(id="login")
	private WebElement logbt;
	

	
	
	}


