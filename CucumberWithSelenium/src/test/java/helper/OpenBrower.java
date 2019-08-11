package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginWebex;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenBrower {
 WebDriver driver;
 
 public void openBrowser(){
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Guru99\\src\\chromedriver.exe");					
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.MINUTES);
		driver.get("https://Barclays.webex.com/");
 }
 /*old  //StepDefinition;
 @Given("^User Opens Browser$")
	public void user_Opens_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		OpenBrower browser= new OpenBrower();
		browser.openBrowser();
		Thread.sleep(2000);
	    //throw new PendingException();
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    LoginWebex webex=new LoginWebex(driver);
	    webex.loginToWebex("G01238903", "Romulus@123");
		throw new PendingException();
	    
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("**");
		throw new PendingException();
	}

	@Then("^User schedules Meeting Successfully$")
	public void user_schedules_Meeting_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("**");
		driver.close();
		throw new PendingException();
	}*/
 
}
