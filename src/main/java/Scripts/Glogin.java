package Scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class Glogin extends BaseClass {
	public Glogin() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name ="username" )
	WebElement Usernametextbox;

	@FindBy(name = "password")
	WebElement passwordtextbox;

	@FindBy(xpath ="//button[@type='submit']"   )
	WebElement LoginButton;
	
	public void SignIn() throws InterruptedException {
		Usernametextbox.sendKeys("Admin");
		passwordtextbox.sendKeys("admin123");
		LoginButton.click();
		Thread.sleep(3000);
	}
}

