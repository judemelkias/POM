package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers{

	public CreateLeadPage() {
		if(!verifyTitle("Create Lead | opentaps CRM"))
			Reporter.reportStep("This is not Create Lead Page", "FAIL");
	}	


	
	public CreateLeadPage enterCompanyName(String data) {
		enterById(prop.getProperty("CreateLeadPage.CompanyName.Id"), data);
		return this;
	}

	public CreateLeadPage enterFirstName(String data) {
		enterById(prop.getProperty("CreateLeadPage.FirstName.Id"), data);
		return this;
	}
	
	
	public CreateLeadPage enterLastName(String data) {
		enterById(prop.getProperty("CreateLeadPage.LastName.Id"), data);
		return this;
	}
	
	public CreateLeadPage enterEmailId(String data) {
		enterById(prop.getProperty("CreateLeadPage.EmailId.Id"), data);
		return this;
	}

	public CreateLeadPage enterPhoneNumber(String data) {
		enterById(prop.getProperty("CreateLeadPage.PhoneNumber.Id"), data);
		return this;
	}
	
	public CreateLeadPage selectBySource(String data) {
		selectById(prop.getProperty("CreateLeadPage.PhoneNumber.Id"), data);
		return this;
	}
	
	public CreateLeadPage selectByCampaign(String data) {
		selectById(prop.getProperty("CreateLeadPage.PhoneNumber.Id"), data);
		return this;
	}
	
	public ViewLeadPage clickButtonCreateLead(){
		clickByName(prop.getProperty("CreateLeadPage.CreateLead.Name"));
		return new ViewLeadPage();
		
		
	}
	












}
