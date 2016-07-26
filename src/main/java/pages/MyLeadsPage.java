package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers{

	public MyLeadsPage() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!verifyTitle("My Leads | opentaps CRM"))
			Reporter.reportStep("This is not My Leads Page", "FAIL");
	}	


	public CreateLeadPage clickCreateLead(){
		clickByLink(prop.getProperty("MyLeadsPage.CreateLeads.Link"));
		
		return new CreateLeadPage();
		
		
	}
	
	public MergeLeadPage clickMergeLead(){
		clickByLink(prop.getProperty("MyLeadsPage.MergeLeads.Link"));
		
		return new MergeLeadPage();
		
		
	}
	

	public FindLeadsPage clickFindLead(){
		clickByLink(prop.getProperty("MyLeadsPage.FindLeads.Link"));
		
		return new FindLeadsPage();
		
		
	}
	










}
