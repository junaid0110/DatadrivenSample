package sampleMavenProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClassPOM;

public class SearchPage extends BaseClassPOM {
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildrenRoom() {
		return childrenRoom;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	@FindBy(id="location")
	private WebElement location;

	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement rooms;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement childrenRoom;
	
	@FindBy(id="Submit")
	private WebElement searchButton;
	
}
