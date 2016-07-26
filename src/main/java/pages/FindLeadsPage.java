package pages;

	import utils.Reporter;
	import wrappers.OpentapsWrappers;

	public class FindLeadsPage extends OpentapsWrappers{

		public FindLeadsPage() {
			if(!verifyTitle("Find Leads | opentaps CRM"))
				Reporter.reportStep("This is not Find Leads | opentaps CRM", "FAIL");
		}	

		public FindLeadsPage clickPhone() throws InterruptedException
		{
			clickByXpath(prop.getProperty("FindLead.Phone.xpath"));
			Thread.sleep(5000);
			return this;
		}

		public FindLeadsPage clickPhoneNumber() throws InterruptedException
		{
			clickByXpath(prop.getProperty("FindLead.PhoneNumber.xpath"));
			Thread.sleep(5000);
			return this;
		}

		public FindLeadsPage clickFindLead() throws InterruptedException
		{
			clickByXpath(prop.getProperty("FindLead.FindLeads.xpath"));
			Thread.sleep(5000);
			return this;
		}
		
		public FindLeadsPage EnterFirstName(String data){
			enterByName(prop.getProperty("FindLeadsPopup.Firstname.Name"), data);
			return this;
		
		}

		
		public ViewLeadPage clickDisplayedLeadId() throws InterruptedException
		{
			clickByXpath(prop.getProperty("FindLead.fNameandLname.xpath"));
			Thread.sleep(5000);
			return new ViewLeadPage();
		}
		
		public FindLeadsPage verifyText() throws InterruptedException
		{
			verifyText(prop.getProperty("FindLead.verifytext.xpath"));
			Thread.sleep(5000);
			return this;
		}

	}



