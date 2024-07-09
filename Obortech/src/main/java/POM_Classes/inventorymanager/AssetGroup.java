package POM_Classes.inventorymanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssetGroup {
	
public WebDriver driver;
    
    public AssetGroup(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//button[contains(text(),'CREATE ASSET GROUP')]")
    private WebElement CreateAssetGroup;
    
    public WebElement getcreateassetgroup() {
        return CreateAssetGroup;
    }
    
    @FindBy(xpath = "//input[@id='assetNameEng']")
    private WebElement AssetGroupName;
    
    public WebElement getassetgroupname() {
        return AssetGroupName;
    }
    
    @FindBy(xpath = "//input[@id='asset_group_code']")
    private WebElement AssetGroupCode;
    
    public WebElement getassetgroupcode() {
        return AssetGroupCode;
    }
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/label[1]/i[1]")
    private WebElement CopyAGC;
    
    public WebElement getcopyagc() {
        return CopyAGC;
    }
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
    private WebElement AssetClasses;
    
    public WebElement getassetclasses() {
        return AssetClasses;
    }
    
    @FindBy(xpath = "//button[contains(text(),'SAVE')]")
    private WebElement SaveAGC;
    
    public WebElement getsaveagc() {
        return SaveAGC;
    }
    
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    private WebElement Assetgroupok;
    
    public WebElement getassetgroupok() {
        return Assetgroupok;
    }
    
    //we can add ok buttons in another pom classes so we can use them frequently
    
    
  
    
    

}
