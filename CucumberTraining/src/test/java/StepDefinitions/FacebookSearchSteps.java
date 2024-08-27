package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSearchSteps {
	 WebDriver driver = null;
	 
	@Given("Browser is open")
	public void browser_is_open() {
	    WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();  
	}
	@When("User is on the facebook login page")
	public void user_is_on_the_facebook_login_page() {
		System.out.println("Inside steps - user is on login page");
	    driver.get("https://en-gb.facebook.com/login/");
	}
	@And("the user type the email and password")
	public void the_user_type_the_email_and_password() {
		System.out.println("Inside steps - user able to type email and password");
		driver.findElement(By.id("email")).sendKeys("akshaya@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345");

	}
	@And("hit login button")
	public void hit_login_button() {
		System.out.println("Inside steps - user able to hit login button");
	    driver.findElement(By.id("loginbutton")).click();
	}
	@Then("facebook page should be opened")
	public void facebook_page_should_be_opened() {
		System.out.println("Inside steps - user redirected to facebook page");
	   System.out.println(driver.getTitle());
	}
}
