package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a") WebElement Register;
	@FindBy(name="firstName") WebElement firstName;
	@FindBy(name="lastName") WebElement LastName;
	@FindBy(name="phone") WebElement Phone;
	@FindBy(id="userName") WebElement username;
	@FindBy(name="address1") WebElement Address;
	@FindBy(name="city") WebElement City;
	@FindBy(name="state") WebElement state;
	@FindBy(name="postalCode") WebElement pincode;
	@FindBy(name="country") WebElement country;
	@FindBy(id="email") WebElement Email;
	@FindBy(name="password") WebElement PassWord;
	@FindBy(name="confirmPassword") WebElement cnfrmpwd;
	@FindBy(name="register") WebElement Submit;
	
	@Given("^User Opens Browser and enter url \"(.*?)\"$")
	public void user_Opens_Browser_and_enter_url(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Guru99\\src\\chromedriver.exe");					
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get(arg1);
		Thread.sleep(2000);
		//Register.click();
		
	    
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("**");
	    
	}
	
	@When("^User Navigate to Registration Page$")
	public void user_Navigate_to_Registration_Page(DataTable TestData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[10]/td/table/tbody/tr/td[2]/font/a")).click();
		System.out.println("Registration Strat**");
	    List<List<String>> data = TestData.raw();
	    //RegistrationPage page= new RegistrationPage();
	    firstName.sendKeys(data.get(0).get(1));
	    LastName.sendKeys(data.get(2).get(0));
	    Phone.sendKeys(data.get(3).get(0));
	    username.sendKeys(data.get(4).get(0));
	    Address.sendKeys(data.get(5).get(0));
	    City.sendKeys(data.get(6).get(0));
	    state.sendKeys(data.get(7).get(0));
	    pincode.sendKeys(data.get(8).get(0));
	    country.sendKeys(data.get(9).get(0));
	    Email.sendKeys(data.get(10).get(0));
	    PassWord.sendKeys(data.get(11).get(0));
	    cnfrmpwd.sendKeys(data.get(12).get(0));
	    Submit.click();
	}

	
	/*@When("^User enters login credentials$")
	public void user_enters_login_credentials(DataTable testData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> data = testData.raw();
		driver.findElement(By.name("userName")).sendKeys(data.get(1).get(0));
		
		System.out.println("***");
	    
	}*/

	@Then("^User books flight Successfully$")
	public void user_books_flight_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("**Registration Successful**");
	    
	}


}