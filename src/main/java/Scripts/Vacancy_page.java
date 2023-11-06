package Scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BaseClass;

public class Vacancy_page extends BaseClass {
	public Vacancy_page() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//span[text()='Recruitment']")
	WebElement RequrimentLinkElement;

	@FindBy(xpath = "//a[text()='Vacancies']")
	WebElement Vacanciesbutton;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement addvacancybuttonElement;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement	vaccanametextbox;

	@FindBy(xpath = "//div[@class='oxd-select-text-input']")
	WebElement jobTitlElement;

	@FindBy(xpath = "//div[text()='Chief Executive Officer']")
	WebElement	ChiefExecutiveOfficer;


	@FindBy(xpath = "//textarea[@placeholder='Type description here']")
	WebElement	DescriptionBox;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement	HiringManager;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement	Numberofvacancy;


	@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])")
	WebElement fristSwitchElement;

	@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[2]")
	WebElement SecondSwitchElement;

	@FindBy(xpath = "(//button[@type='submit'])")
	WebElement	submitbuttonElement;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	WebElement deleteIconElement;

	@FindBy(xpath = "(//button[normalize-space()='Yes, Delete']")
	WebElement deleteIcononpopup;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	WebElement editIconElement;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	WebElement CanclebuttonElement;

	@FindBy(xpath = "//div[text()='Browse']")
	WebElement broswerbuttonElement;
	public void Vacnacypage() {

		RequrimentLinkElement.click();
		Vacanciesbutton.click();
		addvacancybuttonElement.click();
	}
	public void VerifyVacancyname() {
		vaccanametextbox.sendKeys("QA Engineer");
		vaccanametextbox.sendKeys("123ASv");
	}

	public void verifyDropDown() {

		jobTitlElement.click();
		ChiefExecutiveOfficer.click();

	}

	public void Description() {
		DescriptionBox.sendKeys("2-3 years of experience");

	}

	public void hiringmanger() {
		HiringManager.sendKeys("joyt");
	}

	public void No_ofVacancy() {
		Numberofvacancy.sendKeys("20");
	}

	public void Switchbutton() throws InterruptedException {
		fristSwitchElement.click();
		Thread.sleep(2000);
		SecondSwitchElement.click();
		submitbuttonElement.click();
		String A = driver.getTitle();
		Assert.assertEquals(A, true);
	}

	public void VerifyEdit () {
		editIconElement.click();
		vaccanametextbox.sendKeys("QA Engineer");
		jobTitlElement.click();
		ChiefExecutiveOfficer.click();
		DescriptionBox.sendKeys("4-5 years of experience");
		HiringManager.sendKeys("joyt");
		Numberofvacancy.sendKeys("10");
		submitbuttonElement.click();

	}
	public void VerifyEdit1() {
		editIconElement.click();
		vaccanametextbox.sendKeys("QA Engineer");
		jobTitlElement.click();
		ChiefExecutiveOfficer.click();
		DescriptionBox.sendKeys("4-5 years of experience");
		HiringManager.sendKeys("joyt");
		Numberofvacancy.sendKeys("10");
		CanclebuttonElement.click();

	}
	public void AddAcchement() {
		broswerbuttonElement.sendKeys("C:\\Users\\DELL\\OneDrive\\Documents\\videozen-automatedtests\\backgroundmusic\\music.jpg");
		submitbuttonElement.click();

	}

	public void verifyDelete() {
		deleteIconElement.click();
		deleteIcononpopup.click();
	}

}

