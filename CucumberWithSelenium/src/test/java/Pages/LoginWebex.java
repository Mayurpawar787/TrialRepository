package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebex {
	WebDriver driver;
	@FindBy(id="wcc-lnk-loginLink")
	public WebElement LoginButton;
	@FindBy(id="mwx-ipt-username")
	public WebElement UserName;
	@FindBy(id="mwx-ipt-password")
	public WebElement Password;
	@FindBy(id="mwx-btn-logon")
	public WebElement Login;
	@FindBy(id="wcc-lnk-MW") WebElement MyWebex;
	@FindBy(id="wcc-lnk-hostaMeeting") WebElement HostMeet;
	public LoginWebex(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public  void loginToWebex(String Username , String password ){
		//driver.switchTo().defaultContent();
		driver.switchTo().frame((WebElement) By.xpath("//*[@id='header']/tbody/tr/td[3]"));
		//HostMeet.click();
		LoginButton.click();
		//MyWebex.click();
		UserName.sendKeys(Username);
		Password.sendKeys(password);
		Login.click();
	}  //*[@id="topframeset"]/frame[1]
}
