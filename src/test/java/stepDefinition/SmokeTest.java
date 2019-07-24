package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SmokeTest {
	
	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\eclipse-workspace\\CucumberBDD\\Jars\\chromedriver.exe");
	}

	@Given("^Open a browser$")
	public void Open_a_browser() throws Throwable {
		driver=new ChromeDriver();
	  
	}
	
	@And("^Go To Google$")
	public void Go_To_Google() throws Throwable {
		driver.get("http://google.com");
	  
	}

	@When("^write \"([^\"]*)\"$")
	public void write_Anything(String args) throws Throwable {
		driver.findElement(By.id("lst-ib")).sendKeys(args);
	  
	}
	
	@Then("^Validate Title$")
	public void Validate_Title() throws Throwable {
		Assert.assertEquals("Google", driver.getTitle());
	  
	}
	
	@And("^close Browser$")
	public void close_Browser() throws Throwable {
		driver.close();
	  
	}
	
	

	


}
