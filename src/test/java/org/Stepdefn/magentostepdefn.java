package org.Stepdefn;

import java.net.URL;

import org.Basemag.Basemag;
import org.Pomclass.Pommag;
import org.Runnerfile.Magentorunner;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class magentostepdefn extends Basemag{
	
	WebDriver driver = Magentorunner.driver;
	Pommag mag= new Pommag(driver);
	

	@Given("User launch URL and maximize the site")
	public void user_launch_url_and_maximize_the_site() {
	    url(driver,"https://magento.softwaretestingboard.com/");
	    maximize(driver);
	}
	@When("User click on Sign In")
	public void user_click_on_sign_in() {
	    toClick(mag.getSignin());
	}
	@When("Enter  valid email id")
	public void enter_valid_email_id() {
		tosenduser(mag.getEmail(),"kfzahira@gmail.com");
	}
	@When("Enter valid password")
	public void enter_valid_password() {
		tosendvalue(mag.getPassword(),"Magento@123");
	}
	@When("Enter on Sign In")
	public void enter_on_sign_in() {
		tologin(mag.getLogin());
	}
	

	@When("User clicks on women")
	public void user_clicks_on_women() {
	    toClick(mag.getWomen());
	}
	@When("User click on jackets")
	public void user_click_on_jackets() {
	    toClick(mag.getJackets());
	}
	@Then("click on Juno jacket")
	public void click_on_juno_jacket() {
	    toClick(mag.getJunojack());
	}
	@Then("Select the size and color")
	public void select_the_size_and_color() {
	    toClick(mag.getSize());
	    toClick(mag.getColor());
	}
	@Then("Add to cart")
	public void add_to_cart() throws InterruptedException {
	    toClick(mag.getAddtocart());
	    Thread.sleep(3000);
	}
    @Then("scroll up the page")
	public void scroll_up_the_page() {
    	toscroll(mag.getScrollup());
	}
	
	@Then("Back to home page")
	public void back_to_home_page() {
	    toClick(mag.getHomepage());
	}
	
	@Then("Click on men")
	public void click_on_men() {
	    toClick(mag.getMen());
	}
	@Then("Click on shorts")
	public void click_on_shorts() {
	    toClick(mag.getShorts());
	}
	@Then("Click pierce gym short")
	public void click_pierce_gym_short() {
	    toClick(mag.getPierceshorts());
	}
	@Then("Select size and color")
	public void select_size_and_color() {
	    toClick(mag.getSize1());
	    toClick(mag.getColor1());
	}

     @Then("Click on cart")
   public void click_on_cart() {
    toClick(mag.getClickcart());
  }
    @Then("Remove shorts")
   public void remove_shorts() {
    toClick(mag.getRemoveshorts());
  }





}
