package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoTagsTest {
	
	@Given("Test one Background")
	public void test_one_Background() {
	    System.out.println("Test one Background");
	}

	@When("Test two background")
	public void test_two_background() {
		System.out.println("Test two background");
	}

	@Then("Test three background")
	public void test_three_background() {
		System.out.println("Test three background");
	}

	@Given("Its a smoke first test")
	public void its_a_smoke_first_test() {
		System.out.println("Its a smoke first test");
	}

	@When("Its a smoke second test")
	public void its_a_smoke_second_test() {
		System.out.println("Its a smoke second test");
	}

	@Then("Its a smoke third test")
	public void its_a_smoke_third_test() {
		System.out.println("Its a smoke third test");
	}

	@Given("Its a regression first step")
	public void its_a_regression_first_step() {
		System.out.println("Its a regression first step");
	}

	@When("Its a regression second step")
	public void its_a_regression_second_step() {
		System.out.println("Its a regression second step");
	}

	@Then("Its a regression third step")
	public void its_a_regression_third_step() {
		System.out.println("Its a regression third step");
	}

	@Given("Its a integration first step")
	public void its_a_integration_first_step() {
		System.out.println("Its a integration first step");
	}

	@When("Its a integration second step")
	public void its_a_integration_second_step() {
		System.out.println("Its a integration second step");
	}

	@Then("Its a integration third step")
	public void its_a_integration_third_step() {
		System.out.println("Its a integration third step");
	}

}
