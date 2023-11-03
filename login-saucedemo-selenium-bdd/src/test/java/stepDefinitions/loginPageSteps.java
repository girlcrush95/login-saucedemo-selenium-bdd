package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;

public class loginPageSteps {
	

	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driverapp\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(chromeOptions);      
		
		driver.get("https://www.saucedemo.com/");
        
	}

	@When("I open saucedemo homepage")
	public void i_open_saucedemo_homepage() {
		System.out.println("I open saucedemo homepage");
	}

	@Then("I verify the logo presence")
	public void i_verify_the_logo_presence() {
		System.out.println("I verify the logo presence");
	}

	@Then("I close the browser")
	public void i_close_the_browser() {
		System.out.println("I close the browser");
	
	}
}
