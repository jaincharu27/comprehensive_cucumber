package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Comprehensive_elements {
	
	WebDriver driver;
	
	@FindBy(className = "commonModal__close") public WebElement login_model;
	@FindBy(className = "menu_Flights") public WebElement flights_menu;
	@FindBy(xpath = "//li[text()='Round Trip']") public WebElement round_trip;
	@FindBy(id = "fromCity") public WebElement from_city;
	@FindBy(xpath = "//input[@placeholder='From']") public WebElement from_city_type_ahead;
	@FindBy(xpath = "//p[text()='Rajiv Gandhi International Airport']") public WebElement hyd_option;
	@FindBy(id = "toCity") public WebElement to_city;
	@FindBy(xpath = "//input[@placeholder='To']") public WebElement to_city_type_ahead;
	@FindBy(xpath = "//p[text()='Chennai International Airport']") public WebElement chennai_option;
	@FindBy(xpath = "//span[text()='Departure']") public WebElement departure_date;
	@FindBy(className = "DayPicker-Day--today") public WebElement departure_date_option;
	@FindBy(xpath = "(//div[@class='dateInnerCell']/p[text()='1'])[3]") public WebElement return_date;
	@FindBy(xpath = "//p[@data-cy='submit']") public WebElement search_button;
	@FindBy(xpath = "//button[text()='OKAY, GOT IT!']") public WebElement updated_price_model;
	@FindBy(xpath = "//div[@class='listingRhs']/p") public WebElement flight_search_label;
	
	public Comprehensive_elements(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
}
