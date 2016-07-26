package pages;

import utils.Reporter;
import wrappers.GenericWrappers;
import wrappers.OpentapsWrappers;

public class EditLeadJudeprepared extends OpentapsWrappers{
	public EditLeadJudeprepared(){
		if(!verifyTitle("Opentaps Open Source ERP + CRM"))
			Reporter.reportStep("This is not Login Page", "FAIL");
	}
	
	public EditLeadPage SelectNewDataSource(String data) {
		enterById(prop.getProperty("EditLead.NewDataSource.selectvisibletextid"), data);
		return this;
	}
	public EditLeadPage ClickAddSources() {
		clickByXpath(prop.getProperty("EditLead.Addsourcebutton.Xpath"));
		return this;
	}
		public EditLeadPage SelectNewMarketingCampaign(String data) {
			enterById(prop.getProperty("EditLead.NewMarketingCampaign.selectvisibletextid"), data);
			return this;	
}
		public EditLeadPage ClickNewMarketingCampaign() {
			clickByXpath(prop.getProperty("EditLead.AddNewMarketingCampaignbutton.Xpath"));
			return this;		
}
		public EditLeadPage ClickUpdatebutton() {
			clickByXpath(prop.getProperty("EditLead.Updatebutton.Xpath"));
			return new ViewLeadPage;
			
		}
		public LoginPage verifySource(String data) {
			verifyTextContainsByXpath(prop.getProperty("ViewLead.verifysource.xpath"), data);
			return this;
		}
		public LoginPage verifyMarketingCampaigns(String data) {
			verifyTextContainsByXpath(prop.getProperty("ViewLead.verifyMarketingCampaign.xpath"), data);
			return this;
		}
}