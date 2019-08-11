package helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {

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
	
	
}
