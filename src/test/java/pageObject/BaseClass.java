package pageObject;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class BaseClass {
		public WebDriver driver;
		public LoginPage lp;
		public CustomerPage cp;
		
		public static String randomestring() {
			String generatedString = RandomStringUtils.randomAlphabetic(10);
			return (generatedString);
		}
		
		

}
