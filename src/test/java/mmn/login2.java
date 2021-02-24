package mmn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2 extends baseclass {
	public login2() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="location")
	private WebElement loca;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy (id="Submit")
	private WebElement Submit;
	
 @FindBy (id="radiobutton_1")
 private WebElement radio;
 
 @FindBy (id="continue")
 private WebElement conti;
 
 @FindBy (id="first_name")
 private WebElement first;
 
 @FindBy (id="last_name")
 private WebElement last;
 
 @FindBy (id="address")
 private WebElement addr;
 
 @FindBy (id="cc_num")
 private WebElement cc;
 
 @FindBy (id="cc_type")
 private WebElement ctyp;
 
 @FindBy (id ="cc_exp_month")
 private WebElement ccmon;
 
 @FindBy (id="cc_exp_year")
 private WebElement ccyr;
 
	 @FindBy (id="cc_cvv")
	 private WebElement ccv;
	 
	 @FindBy (id="book_now")
	 private WebElement book;
	 

	public WebElement getBook() {
		return book;
	}

	public void setBook(WebElement book) {
		this.book = book;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public void setCcv(WebElement ccv) {
		this.ccv = ccv;
	}

	public WebElement getCcyr() {
	return ccyr;
}

public void setCcyr(WebElement ccyr) {
	this.ccyr = ccyr;
}

	public WebElement getCcmon() {
	return ccmon;
}

public void setCcmon(WebElement ccmon) {
	this.ccmon = ccmon;
}

	public WebElement getCtyp() {
	return ctyp;
}

public void setCtyp(WebElement ctyp) {
	this.ctyp = ctyp;
}

	public WebElement getCc() {
	return cc;
}

public void setCc(WebElement cc) {
	this.cc = cc;
}

	public WebElement getAddr() {
	return addr;
}

public void setAddr(WebElement addr) {
	this.addr = addr;
}

	public WebElement getLast() {
	return last;
}

public void setLast(WebElement last) {
	this.last = last;
}

	public WebElement getFirst() {
	return first;
}

public void setFirst(WebElement first) {
	this.first = first;
}

	public WebElement getRadio() {
	return radio;
}

public void setRadio(WebElement radio) {
	this.radio = radio;
}

	public WebElement getLoca() {
		return loca;
	}

	public void setLoca(WebElement loca) {
		this.loca = loca;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public void setHotel(WebElement hotel) {
		this.hotel = hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public void setRoom(WebElement room) {
		this.room = room;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public void setRoomno(WebElement roomno) {
		this.roomno = roomno;
	}

	public WebElement getDatepick() {
		return datepick;
	}

	public void setDatepick(WebElement datepick) {
		this.datepick = datepick;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public void setDateout(WebElement dateout) {
		this.dateout = dateout;
	}

	public WebElement getPerperson() {
		return perperson;
	}
	

	public void setPerperson(WebElement perperson) {
		this.perperson = perperson;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public void setChildroom(WebElement childroom) {
		this.childroom = childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	@FindBy(id="room_nos")
	private WebElement roomno;
	

	@FindBy(id="datepick_in")
	private WebElement datepick;
	
	@FindBy(id="datepick_out")
	private WebElement dateout;
	
	public WebElement getConti() {
		return conti;
	}

	public void setConti(WebElement conti) {
		this.conti = conti;
	}

	@FindBy(id="adult_room")
	private WebElement perperson;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement submit;
	

}
