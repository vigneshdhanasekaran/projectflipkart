package flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class login extends basee {
	public login(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="q")
    private WebElement searchhhhh;
	
	
	public WebElement getSearchhhhh() {

		
		return searchhhhh;
	}
@FindBy(xpath="//button[@type='submit']")
private WebElement serachbtn;


public WebElement getSerachbtn() {
	return serachbtn;
}
  @FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
   private WebElement cancbtn;


public WebElement getCancbtn() {
	return cancbtn;
}


public void setSearchhhhh(WebElement searchhhhh) {
	this.searchhhhh = searchhhhh;
}


public void setSerachbtn(WebElement serachbtn) {
	this.serachbtn = serachbtn;
}


public void setCancbtn(WebElement cancbtn) {
	this.cancbtn = cancbtn;
}

	
public WebElement getPrice() {
	return price;
}
@FindBy(xpath="//a[@class='s1Q9rs']")
private WebElement iphone;

@FindBy(xpath="//div[@class='30jeq3']")
private WebElement price;


public WebElement getIphone() {
	return iphone;
}









}



