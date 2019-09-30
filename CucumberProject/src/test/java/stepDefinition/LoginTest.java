package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver driver;
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
	   System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://www.newtours.demoaut.com/");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	    driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys("mercury");
	    driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("mercury");
	    driver.findElement(By.xpath("//input[contains(@name,'login')]")).click();
	}

	@Then("user logged in successful")
	public void user_logged_in_successful() {
	    System.out.println("user logged in successful");
	}

}
