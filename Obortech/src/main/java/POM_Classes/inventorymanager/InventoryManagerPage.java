package POM_Classes.inventorymanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryManagerPage {
	
public WebDriver driver;
    
    public InventoryManagerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id = "myAssetsClasses")
    private WebElement myassets;
    
    public WebElement getmyassets() {
        return myassets;
    }
    
    @FindBy(linkText  = "Asset group")
    private WebElement Assetgroup;
    
    public WebElement getAssetgroup() {
        return Assetgroup;
    }
    
    @FindBy(id = "uncategorizedAsssetClasses")
    private WebElement Uncategorizedasssets;
    
    public WebElement getUncategorizedasssets() {
        return Uncategorizedasssets;
    }
    

}
