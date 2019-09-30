package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DatatableTest {
	WebDriver driver;
	@Given("user is on herokuapp page")
	public void user_is_on_herokuapp_page() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://the-internet.herokuapp.com/login");
	}

	@When("user enter username and password in herokuapp")
	public void user_enter_username_and_password_in_herokuapp(io.cucumber.datatable.DataTable userCredentials) {
	    List<String> data = userCredentials.asList();
	    driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys(data.get(0));
	    driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys(data.get(1));
	    driver.findElement(By.xpath("//i[contains(.,'Login')]")).click();
	}

	@Then("display message login successfully")
	public void display_message_login_successfully() {
	   System.out.println("user logged in successfully");
	}

}
