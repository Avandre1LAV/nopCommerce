package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerPage {
	public WebDriver ldriver;
	public CustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}

	By lnkCustomers_Menu=By.xpath("/html/body/div[3]/div[2]/div/ul/li[4]/a/span");
	By lnkCustomers_Menuitems=By.xpath("/html/body/div[3]/div[2]/div/ul/li[4]/ul/li[1]/a/span");
	By btnAddNew=By.xpath("/html/body/div[3]/div[3]/div/form[1]/div[1]/div/a");
	
	
	
	By txtEmail=By.name("Email");
	By txtPassword=By.name("Password");
	By txtFirst_Name=By.name("FirstName");
	By txtLastName=By.name("LastName");
	
	By rdMale_Gender=By.id("Gender_Male");
	By rdFemale_Gender=By.id("Gender_Female");
	
	By dtDate_Of_Birth=By.name("DateOfBirth");
	By txtCompany_Name=By.name("Company");
	By ckIs_Tax_Exempt=By.name("IsTaxExempt");
	By txtNewaletter=By.xpath("//*[@id=\"customer-info\"]/div[2]/div[1]/div[9]/div[2]/div/div[1]/div");
	
	By chooseCustomerRole=By.xpath("//div[10]//div[2]//div[1]//div[1]//div[1]");
	By lstitemAdministrator=By.xpath("//li[contains(text(),'Administrators')]");
	By lstitemRegistered=By.xpath("//li[contains(text(),'Registered')]");
	By lstitemGuests=By.xpath("//li[contains(text(),'Guests')]");
	By lstitemVendor=By.xpath("//li[contains(text(),'Vendors')]");
	By lstitemForumModerator=By.xpath("//li[contains(text(),'Forum Moderators')]");
	By lstiemPremiumMembership=By.xpath("//li[contains(text(),'With premium membership')]");
	
	
	By lstManager_Of_Vendor=By.name("VendorId");
	By ckActive=By.name("Active");
	By txtAdminComment=By.name("AdminComment");
	
	By btnSave=By.name("save");
	
	
	
	
	
	
	//Action Method
	
	public String getPageTitle() {
		return ldriver.getTitle();
	}
	
	
	public void clickOnCustomerMenu() {
		ldriver.findElement(lnkCustomers_Menu).click();
	}
	
	public void clickOnCustomerMenuItem() {
		ldriver.findElement(lnkCustomers_Menuitems).click();
	}
	
	public void clickOnAddNew() {
		ldriver.findElement(btnAddNew).click();
	}
	
	public void setEmail(String email) {
		ldriver.findElement(txtEmail).sendKeys(email);
	}
	
	public void setPassword(String password) {
		ldriver.findElement(txtPassword).sendKeys(password);
	}
	
	public void setFirstName(String firstname) {
		ldriver.findElement(txtFirst_Name).sendKeys(firstname);
	}
	
	public void setLastName(String lasttname) {
		ldriver.findElement(txtLastName).sendKeys(lasttname);
	}
	
	public void setGender(String gender) {
		if (gender.equals("Male")) {
			ldriver.findElement(rdMale_Gender).click();
		}
		else if (gender.equals("Female"))
		{
			ldriver.findElement(rdFemale_Gender).click();
		}
		else
		{
			ldriver.findElement(rdMale_Gender).click();  //default
		}
	}
	
	public void setDateOfBirth(String dob) {
		ldriver.findElement(dtDate_Of_Birth).sendKeys(dob);
	}
	
	public void setCompanyName(String cotname) {
		ldriver.findElement(txtCompany_Name).sendKeys(cotname);
	}
	
	public void setIsTaxExempt() {
		ldriver.findElement(ckIs_Tax_Exempt).click();
	}
	public void setNewsletter(String nl) {
		Select drpn=new Select(ldriver.findElement(txtNewaletter));
		drpn.selectByVisibleText(nl);
	}
	
	public void setCustomerRole(String role)throws InterruptedException {
		
		
		
		ldriver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li[1]/span[2]")).click();
		ldriver.findElement(chooseCustomerRole).click();
		
		WebElement listItem;
		Thread.sleep(3000);
		
		if (role.equals("Administrators")) {
			listItem=ldriver.findElement(lstitemAdministrator);
			
		}
		else if (role.equals("Guests")) {
			listItem=ldriver.findElement(lstitemGuests);
			
		}
		else if (role.equals("Registered")) {
			listItem=ldriver.findElement(lstitemRegistered);
			
		}
		else if (role.equals("Vendors")) {
			listItem=ldriver.findElement(lstitemVendor);
			
		}
		else if (role.equals("With premium membership")) {
			listItem=ldriver.findElement(lstiemPremiumMembership);
			
		}
		else {
			listItem=ldriver.findElement(lstitemForumModerator);
		}
		listItem.click();
//		JavascriptExecutor js = (JavascriptExecutor)ldriver;
//		js.executeScript("arguments[0].click();", listItem);
	}	

		
	public void setManagerOfVendor(String value) {
		Select drp=new Select(ldriver.findElement(lstManager_Of_Vendor));
		drp.selectByVisibleText(value);
	}
	
	public void setActive() {
		ldriver.findElement(ckActive).click();
	}
	
	public void setAdminComment(String comment) {
		ldriver.findElement(txtAdminComment).sendKeys(comment);
	}
	
	public void clickOnSave() {
		ldriver.findElement(btnSave).click();
	}
}


