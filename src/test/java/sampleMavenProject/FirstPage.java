package sampleMavenProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClassPOM;

public class FirstPage extends BaseClassPOM {
	public FirstPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtUserName;
	@FindBy(name="password")
	private WebElement txtPassword;
	@FindBy(id="login")
	private WebElement btnLogin;
	
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	
	
	
	
	
	
}
