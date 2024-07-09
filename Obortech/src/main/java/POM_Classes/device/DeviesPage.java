package POM_Classes.device;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeviesPage {
	
public WebDriver driver;
    
    public DeviesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(linkText = "All Devices")
    private WebElement AllDevices;
    
    public WebElement getAllDevices() {
        return AllDevices;
    } 
    
    @FindBy(linkText = "Device Contracts" )
    private WebElement DeviceContracts;
    
    public WebElement getDeviceContracts() {
        return DeviceContracts;
    } 

}
