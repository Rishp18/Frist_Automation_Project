package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Scripts.Candidatepage;
import Scripts.Glogin;
import base.BaseClass;

public class TestCaseForCandidate extends BaseClass{

	public TestCaseForCandidate() {
		PageFactory.initElements(driver, this);
	}

	@Test(priority = 0)
	public void login() throws InterruptedException {
		Glogin gl=new Glogin();
		gl.SignIn();
	}
	@Test(priority = 1)
	public void  Candidatepage1() {
		Candidatepage cd=new  Candidatepage();	
		cd.Candidatpage();
	}
	@Test(priority = 2)
	public void AddCandidatepage() {
		Candidatepage cd=new  Candidatepage();	
		cd.ADDCandidatpage();
	}
}
