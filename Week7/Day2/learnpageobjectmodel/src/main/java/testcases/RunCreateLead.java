package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunCreateLead extends BaseClass{
	@Test
	public void runCreateLead() {
		
		LoginPage lp=new LoginPage(driver);
		lp.enterUname().enterPwd().clickLogin().clickCrmsfaLink().clickLeads().clickCreateLead().enterCname()
		.enterfName().enterlName().clickSubmit().verifyLeads();
		
	}

}
