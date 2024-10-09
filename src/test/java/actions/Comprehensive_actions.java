package actions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.Comprehensive_elements;
import stepDefinition.Common_steps;

public class Comprehensive_actions {
	
	private WebDriver driver;
	Comprehensive_elements com_elements;
	private WebDriverWait wait;
	
	public Comprehensive_actions(Common_steps common_steps){
		this.driver = common_steps.getDriver();
		this.wait = common_steps.getWait();
		com_elements = new Comprehensive_elements(driver);
	}
	
	public void getURL(String url) {
		driver.get(url);
	}
	
	public void click_flights_menu() {
		//com_elements.flights_menu.click();
		wait.until(ExpectedConditions.visibilityOf(com_elements.login_model));
		com_elements.login_model.click();
	}

	public void click_round_trip() {
		wait.until(ExpectedConditions.visibilityOf(com_elements.round_trip));
		com_elements.round_trip.click();
	}

	public void click_from_location(String string) {
		com_elements.from_city.click();
		wait.until(ExpectedConditions.visibilityOf(com_elements.from_city_type_ahead));
		com_elements.from_city_type_ahead.sendKeys(string);
		wait.until(ExpectedConditions.visibilityOf(com_elements.hyd_option));
		com_elements.hyd_option.click();
	}
	
	public void click_to_location(String string) {
		com_elements.to_city.click();
		wait.until(ExpectedConditions.visibilityOf(com_elements.to_city_type_ahead));
		com_elements.to_city_type_ahead.sendKeys(string);
		wait.until(ExpectedConditions.visibilityOf(com_elements.chennai_option));
		com_elements.chennai_option.click();
	}

	public void select_departure_date() {
		wait.until(ExpectedConditions.visibilityOf(com_elements.departure_date));
		com_elements.departure_date.click();
		com_elements.departure_date_option.click();
	}

	public void select_return_date() {
		com_elements.return_date.click();
	}

	public void click_search_button() {
		com_elements.search_button.click();
	}

	public String get_text_flight_search_page_label() {
		wait.until(ExpectedConditions.visibilityOf(com_elements.updated_price_model));
		com_elements.updated_price_model.click();
		return com_elements.flight_search_label.getText();
	}
}
