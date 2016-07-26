package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers{

	public CRMHomePage() {
		if(!verifyTitle("My Home | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}	


	public MyLeadsPage clickLead(){
		clickByLink(prop.getProperty("CRMHomePage.Leads.Link"));
		try {
			Thread.sleep(5000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new MyLeadsPage();
		
		
	}


}
