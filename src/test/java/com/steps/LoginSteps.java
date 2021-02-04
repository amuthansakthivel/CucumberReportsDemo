package com.steps;

import org.junit.runner.RunWith;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class LoginSteps {



	@Given("^user enters valid url$")
	public void user_enters_valid_url() throws Throwable {
		//LogStatus.pass();
		//LogStatus.info("just checking whether it is working");
		
		System.out.println("user enters valid url");
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		//LogStatus.pass("user clicks on login button");
		
		System.out.println("user clicks on login button");
	}

	@Then("^user should be successfully logged in$")
	public void user_should_be_successfully_logged_in() throws Throwable {
		//LogStatus.pass("user should be successfully logged in");
		System.out.println("user should be successfully logged in");
		Assert.assertEquals(1, 2);
	}

	@And("^valid username and password$")
	public void valid_username_and_password() throws Throwable {
		
		System.out.println("valid username and password");
	}

	@And("^title of the login page should be title$")
	public void title_of_the_login_page_should_be() throws Throwable {

		System.out.println("title of the login page should be title");
	}


	@Then("title of the login page should be {string}")
	public void title_of_the_login_page_should_be(String string) {
		System.out.println(string);
	}

	/*@And("^valid (.+) and (.+)$")
    public void valid_and(String username, String password) throws Throwable {
		
		System.out.println(username);
		System.out.println(passwro);
    }
*/

}
