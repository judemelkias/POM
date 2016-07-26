package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers{

	public ViewLeadPage() {
		if(!verifyTitle("View Lead | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}	


	public FindLeadsPage clickFindLeads() throws InterruptedException
	{
		clickByLink(prop.getProperty("ViewLead.FindLeads.Link"));
		Thread.sleep(5000);
		return new FindLeadsPage();
	}


	public MyLeadsPage clickDelete() throws InterruptedException
	{
		clickByLink(prop.getProperty("ViewLead.DeleteLead.Link"));
		Thread.sleep(5000);
		return new MyLeadsPage();
	}
	
	public EditLeadPage clickEdit() throws InterruptedException
	{
		clickByLink(prop.getProperty("ViewLead.EditLead.Link"));
		Thread.sleep(5000);
		return new EditLeadPage();
	}


	public ViewLeadPage Verifytext1(String data) {
		enterById(prop.getProperty("ViewLead.dropdowntext1.verifytext"), data);
		return this;
	}
	
	public ViewLeadPage Verifytext2(String data) {
		enterById(prop.getProperty("ViewLead.dropdowntext2.verifytext"), data);
		return this;
	}
	











}
