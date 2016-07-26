package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadsPopup extends OpentapsWrappers{

	public FindLeadsPopup() {
		if(!verifyTitle("Find Leads"))
			Reporter.reportStep("This is not Find Leads Popup Page", "FAIL");
	}	


	public FindLeadsPopup EnterFirstName(String data){
		enterByName(prop.getProperty("FindLeadsPopup.Firstname.Name"), data);
		return this;
	
	}
	
	public FindLeadsPopup ClickFindLead(){
		clickByXpath(prop.getProperty("FindLeadsPopup.FirstLead.Xpath"));
		return this;
	}
	

	public MergeLeadPage clickSearchLead(String Parentwindow){
		clickByLink(prop.getProperty("FindLeadsPopup.ResultLead.Link"));
		switchToParentWindow(Parentwindow);
		return new MergeLeadPage();
		
		
	}
	








}
