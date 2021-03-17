package sampleMavenProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClassPOM;

public class BookingPage extends BaseClassPOM {
	public BookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="first_name")
	private WebElement firstName;

	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(id="address")
	private WebElement Address;
	
	@FindBy(id="cc_num")
	private WebElement CC;
	
	@FindBy(id="cc_type")
	private WebElement creditcardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement ExpiryDate;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement CVV;
	
	@FindBy(id="book_now")
	private WebElement booknow;
	
	@FindBy(id="my_itinerary")
	private WebElement tinerary;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCC() {
		return CC;
	}

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public WebElement getExpiryDate() {
		return ExpiryDate;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getTinerary() {
		return tinerary;
	}
	
}
