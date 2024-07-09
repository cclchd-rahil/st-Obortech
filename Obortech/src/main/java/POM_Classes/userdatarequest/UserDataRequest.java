package POM_Classes.userdatarequest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UserDataRequest {
	
public WebDriver driver;
    
    public UserDataRequest(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
