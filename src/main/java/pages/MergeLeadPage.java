package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MergeLeadPage extends OpentapsWrappers {
	
	public MergeLeadPage() {
		if(!verifyTitle("Merge Leads | opentaps CRM"))
			Reporter.reportStep("This is not Merge Lead Page", "FAIL");
	}	
	
	public ViewLeadPage MergeLead(){
		clickByLink(prop.getProperty("MergeLeadPage.Merge.Link"));
		switchAlertAccept();
		try {
			Thread.sleep(5000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new ViewLeadPage();
		
	}
	
	public FindLeadsPopup ClickImg1(){
		String Parentwindow = getparentwindow();
		clickByXpath(prop.getProperty("MergeLeadPage.Img1.Xpath"));
		switchToNewWindow();
		return new FindLeadsPopup();
	}
	
	public FindLeadsPopup ClickImg2(){
		clickByXpath(prop.getProperty("MergeLeadPage.Img2.Xpath"));
		switchToNewWindow();
		return new FindLeadsPopup();
	}

}
