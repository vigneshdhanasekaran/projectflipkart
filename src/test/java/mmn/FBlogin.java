package mmn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBlogin extends FB{
public FBlogin() {
	PageFactory.initElements(driver, this);
}
		@FindBy(id="email")
		private WebElement txtuser;
		
		
		@FindBy(id="pass")
		private WebElement txtpass;

		@FindBy(name="login")
		private WebElement bt;

		public WebElement getTxtuser() {
			return txtuser;
		}

		public WebElement getTxtpass() {
			return txtpass;
		}

		public WebElement getBt() {
			return bt;
		}
		



	}
	

