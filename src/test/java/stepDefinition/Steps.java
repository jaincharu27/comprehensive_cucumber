package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import actions.Comprehensive_actions;

public class Steps {

	WebDriver driver;
	Select dropdown;
	
	Comprehensive_actions com_actions;
	
	public Steps(Comprehensive_actions com_actions) {
		this.com_actions = com_actions;
	}
	
	@Given("launch url")
	public void launch_url() {
		com_actions.getURL("https://www.makemytrip.com/");
	}
		
	@When("click on flights")
	public void click_on_flights() {
		com_actions.click_flights_menu();
	}

	@When("select round trip")
	public void select_round_trip() {
	    com_actions.click_round_trip();
	}
	
	@When("select From location {string}")
	public void select_From_location(String string) {
	    com_actions.click_from_location(string);
	}

	@When("select To location {string}")
	public void select_To_location(String string) {
	    com_actions.click_to_location(string);
	}

	@When("select departure date")
	public void select_departure_date() {
	    com_actions.select_departure_date();
	}

	@When("select return date")
	public void select_return_date() {
	    com_actions.select_return_date();
	}

	@When("click on search flights")
	public void click_on_search_flights() {
		com_actions.click_search_button();
	}

	@Then("verify search page is displayed")
	public void verify_search_page_is_displayed() {
		String flight_search_page_label = com_actions.get_text_flight_search_page_label();		
		Assert.assertEquals("Flights from Hyderabad to Chennai, and back", flight_search_page_label);
	}
}
