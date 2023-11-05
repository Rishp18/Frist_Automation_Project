package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Scripts.Glogin;
import Scripts.Vacancy_page;
import base.BaseClass;

public class testclass extends BaseClass {

	public testclass() {
		PageFactory.initElements(driver, this);
	}
	@Test(priority = 0)
	public void login() throws InterruptedException {
		Glogin gl=new Glogin();
		gl.SignIn();
	}

	@Test(priority = 1)
	public void Requrimentlink() throws InterruptedException {
		Vacancy_page vp=new Vacancy_page();
		vp.Vacnacypage();
	}
	@Test
	public void VerifyVacancyname() {
		Vacancy_page vp=new Vacancy_page();
		vp.VerifyVacancyname();
	}
	@Test(priority = 2)
	public void verifyDropDown() {
		Vacancy_page vp=new Vacancy_page();
		vp.verifyDropDown();
	}
	@Test(priority = 3)
	public void Description() {
		Vacancy_page vp=new Vacancy_page();
		vp.Description();
	}
	@Test(priority = 4)
	public void hiringmanger() {
		Vacancy_page vp=new Vacancy_page();
		vp.hiringmanger();
	}
	@Test(priority = 5)
	public void No_ofVacancy() {
		Vacancy_page vp=new Vacancy_page();
		vp.No_ofVacancy();
	}

	@Test(priority = 6)
	public void switchbuttons() throws InterruptedException {
		Vacancy_page vp=new Vacancy_page();
		vp.Switchbutton();

	}
}