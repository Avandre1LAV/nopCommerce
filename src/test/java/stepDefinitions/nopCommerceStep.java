package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.BaseClass;
import pageObject.CustomerPage;
import pageObject.LoginPage;

public class nopCommerceStep extends BaseClass {
	public WebDriver driver;
	public LoginPage lp;
	public CustomerPage cp;

	@Given("User Launch Chrome Browser")
	public void user_Launch_Chrome_Browser() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		lp=new LoginPage(driver);
	  
	}

	@When("User open URL {string}")
	public void user_open_URL(String string) {
		driver.get(string);
		driver.manage().window().maximize();
	   
	}

	@And("User Enter Email as {string} and Password as {string}")
	public void user_Enter_Email_as_and_Password_as(String email, String password) {
	    lp.setUserName(email);
	    lp.setPassword(password);
	}

	@And("Click on Login")
	public void click_on_Login() {
		lp.clickLogin();
	    
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) {
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		}
		else {
		Assert.assertEquals(title, driver.getTitle());
		}
	    
	}

	@When("User click on Logout link")
	public void user_click_on_Logout_link() {
		lp.clickLogout();
	   
	}

	@And("Close Browser")
	public void close_Browser() {
		driver.quit();
	    
	}
	
	//Add Customer
	@When("User click on customers Menu")
	public void user_click_on_customers_Menu() {
		cp=new CustomerPage(driver);
		cp.clickOnCustomerMenu();
	    
	}

	@When("Click on Customer Menu Item")
	public void click_on_Customer_Menu_Item() {
		cp.clickOnCustomerMenuItem();
	    
	}

	@When("Click on Add New Button")
	public void click_on_Add_New_Button() throws InterruptedException {
		cp.clickOnAddNew();
		Thread.sleep(3000);
	   
	}

	@When("User enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
		String email = randomestring()+"@mailinator.com";
		cp.setEmail(email);
		cp.setPassword("admin123");
		cp.setFirstName("Azelena");
		cp.setLastName("Vandre");
		cp.setGender("Female");
		cp.setDateOfBirth("5/12/1978");
		cp.setCompanyName("No company");
		cp.setIsTaxExempt();
		cp.setCustomerRole("Guests");
		cp.setAdminComment("This is a Cucumber test");
		Thread.sleep(5000);
		
	}


	@When("Click Save button")
	public void click_Save_button() throws InterruptedException {
		cp.clickOnSave();
		Thread.sleep(5000);
		
	    
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String msg) throws InterruptedException {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains(msg));
	   Thread.sleep(5000); 
	}
}
