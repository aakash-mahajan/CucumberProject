package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleLoginTest {
	WebDriver driver;
	@Given("user is on demowebshop page")
	public void user_is_on_demowebshop_page() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
	    driver.findElement(By.linkText("SignIn")).click();
	    driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys(username);
	    driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys(password);
	    driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	}

	@Then("Display message logged in successfully")
	public void display_message_logged_in_successfully() {
		System.out.println("Logged in successfully");
		 
	}

}
