package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // Code to navigate to the login page
        System.out.println("User is on the login page");
    }

    @When("the user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {
        // Code to enter valid username and password
        System.out.println("User enters valid credentials");
    }

    @And("clicks the login button")
    public void clicks_the_login_button() {
        // Code to click the login button
        System.out.println("User clicks the login button");
    }

    @Then("the user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() {
        // Code to verify redirection to the homepage
        System.out.println("User is redirected to the homepage");	
}
}