package auto_tc;

import org.testng.annotations.Test;

import auto.pagecrm.Crmpage;
import auto_basecode.Basecode;
import auto_datadriven.Datareader;

public class Tc1 extends Basecode{
	
	
	@Test(dataProvider="excel", dataProviderClass=Datareader.class)
	public void tc1(String usr, String pass, String Phone, String Company, String lastname, String emailid) throws InterruptedException {
		Crmpage crm = new Crmpage(driver);
		crm.signin();
		crm.email(usr);
		Thread.sleep(2000);
		crm.pwd(pass);
		crm.Lead();
		Thread.sleep(5000);
		crm.createlead();
		//crm.phnfd(Phone);
		crm.comfd(Company);
		crm.lastnmfd(lastname);
		crm.emailfd(lastname);
		crm.leadsts();
	}

}
