package Scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class Candidatepage extends BaseClass {

	public Candidatepage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Recruitment']")
	WebElement RequrimentLinkElement;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement addCandidatebuttonElement;

	@Test(priority = 0)
	public void Candidatpage() {
		RequrimentLinkElement.click();
		String A = driver.getTitle();
		Assert.assertEquals(A, "OrangeHRM");
	}
	
	public void ADDCandidatpage() {
		addCandidatebuttonElement.click();
		driver.getTitle();
	}
	
	
	
}