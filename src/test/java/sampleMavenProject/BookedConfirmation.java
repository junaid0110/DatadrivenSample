package sampleMavenProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClassPOM;

public class BookedConfirmation extends BaseClassPOM {
	public BookedConfirmation() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement orderNum;

	public WebElement getOrderNum() {
		return orderNum;
	}

	}

	
	
	
	

