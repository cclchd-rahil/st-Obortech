package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class projectCategories {


    public WebDriver driver;
    
    public projectCategories(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    
        
        }
    
    @FindBy(xpath="//input[@id='login-username']")
    private WebElement username;
    
    public WebElement getUsernameTextfield() {
        return username;
    
    }
    

}




