package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC002_EditLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser,String FirstName, String NewDataSource, String NewMarketingCampaign) throws InterruptedException {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFA()
		.clickLead()		
		.clickFindLead()
		.EnterFirstName(FirstName)
		.clickFindLead()
		.clickDisplayedLeadId()
		.clickEdit()
		.ClickNewDatasourceDropdown(NewDataSource)
		.clickAddbutton1()
		.NewMarketingCampaignDropDown(NewMarketingCampaign)
		.clickAddbutton2()
		.Clickupdatebutton();
		
		
		
		
		
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="fetchData";
		browserName="chrome";
		testCaseName="EditLead";
		testDescription="Login and Edit the created Lead";
	}

	
	
	
	
	
	
}
