package Overall;

import org.openqa.selenium.WebElement;
import org.test.BaseClassPOM;

import sampleMavenProject.BookedConfirmation;
import sampleMavenProject.BookingPage;
import sampleMavenProject.FirstPage;
import sampleMavenProject.SearchPage;
import sampleMavenProject.SelectHotel;

public class AdacitinPOM1 extends BaseClassPOM {

	public static void main(String[] args) throws InterruptedException {
		
		BaseClassPOM ab = new BaseClassPOM();
		ab.getDriver();
		ab.launchUrl("http://adactinhotelapp.com/");

		FirstPage fp = new FirstPage();
		WebElement txtUserName = fp.getTxtUserName();
		ab.enterText(txtUserName, "jerrykarthikeyan");
		
		WebElement txtPassword = fp.getTxtPassword();
		ab.enterText(txtPassword, "qwerty");
		
		WebElement btnLogin = fp.getBtnLogin();
		ab.btnClick(btnLogin);
		
		SearchPage sp = new SearchPage();
		
		WebElement location = sp.getLocation();
		ab.visibleText(location, "London");
		
		WebElement hotels = sp.getHotels();
		ab.visibleText(hotels, "Hotel Sunshine");
		
		WebElement roomtype = sp.getRoomtype();
		ab.visibleText(roomtype, "Super Deluxe");
		
		WebElement rooms = sp.getRooms();
		ab.visibleText(rooms, "7 - Seven");
		
		WebElement adultRoom = sp.getAdultRoom();
		ab.visibleText(adultRoom, "3 - Three");
		
		WebElement childrenRoom = sp.getChildrenRoom();
		ab.visibleText(childrenRoom, "0 - None");
		
		WebElement searchButton = sp.getSearchButton();
		ab.btnClick(searchButton);
		
		SelectHotel third = new SelectHotel();
		WebElement radio = third.getRadio();
		ab.btnClick(radio);
		
		WebElement continue1 = third.getContinue();
		ab.btnClick(continue1);
		
		BookingPage fourth = new BookingPage();
		WebElement firstName = fourth.getFirstName();
		ab.enterText(firstName, "junaid");
		
		WebElement lastName = fourth.getLastName();
		ab.enterText(lastName, "ahmed");
		
		WebElement address = fourth.getAddress();
		ab.enterText(address, "ponnappa mudali street");
		
		WebElement cc = fourth.getCC();
		ab.enterText(cc, "1111 2222 3333 4444");
		
		WebElement creditcardtype = fourth.getCreditcardtype();
		ab.visibleText(creditcardtype, "American Express");
		
		WebElement expiryDate = fourth.getExpiryDate();
		ab.visibleText(expiryDate, "April");
		
		WebElement year = fourth.getYear();
		ab.visibleText(year, "2019");
		
		WebElement cvv = fourth.getCVV();
		ab.enterText(cvv, "444111");
		
		WebElement booknow = fourth.getBooknow();
		ab.btnClick(booknow);
	
		
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
