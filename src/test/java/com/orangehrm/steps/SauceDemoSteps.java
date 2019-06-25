package com.orangehrm.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.orangehrm.utils.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SauceDemoSteps extends BaseClass {
	WebDriver driver;

	@Given("I navigate to the Sauce Demo Page")
	public void i_navigate_to_the_Sauce_Demo_Page() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	} 
	@When("I type username")
	public void i_type_username() {
		driver.findElement(By.cssSelector("input[id*=\"user-name\"]")).sendKeys("standard_user");	
	}
	@When("I type password")
	public void i_type_password() {
		driver.findElement(By.cssSelector("input[id*=\"password\"]")).sendKeys("secret_sauce");
	}
	@When("I click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.cssSelector("input[value*=\"LOGIN\"]")).click();
	}
	@Then("I see homepage of is displayed")
	public void i_see_homepage_of_is_displayed() {
		String actualTitle="Swag Labs";
		String expectedTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Succesfully Login");
		}else {
			System.out.println("Login failed");
		}
		driver.close();
	}

}
