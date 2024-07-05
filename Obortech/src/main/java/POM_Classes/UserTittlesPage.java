package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserTittlesPage {
	
public WebDriver driver;
    
    public UserTittlesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id = "userTitles")
    private WebElement userTitles;
    
    public WebElement getuserTitles() {
        return userTitles;
    } 

}
