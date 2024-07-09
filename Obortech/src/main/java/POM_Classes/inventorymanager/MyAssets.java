package POM_Classes.inventorymanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAssets {
	
public WebDriver driver;
    
    public MyAssets(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//button[contains(text(),'CREATE ASSET')]")
    private WebElement CreateAsset;
    
    public WebElement getcreateasset() {
        return CreateAsset;
    }

    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    private WebElement AssetName;
    
    public WebElement getassetname() {
        return AssetName;
    }
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
    private WebElement AssetGroup;
    
    public WebElement getassetgroup() {
        return AssetGroup;
    }
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
    private WebElement Unit;
    
    public WebElement getunit() {
        return Unit;
    }
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
    private WebElement assetinfo;
    
    public WebElement getassetinfo() {
        return assetinfo;
    }
    
    @FindBy(xpath = "//button[contains(text(),'SAVE')]")
    private WebElement SaveAsset;
    
    public WebElement getsaveasset() {
        return SaveAsset;
    }
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/span[1]/div[1]/div[1]/label[1]/i[1]")
    private WebElement CopyAssetcode;
    
    public WebElement getcopyassetcode() {
        return CopyAssetcode;
    }  
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]/div[1]/label[1]/i[1]")
    private WebElement CopyAssetCC;
    
    public WebElement getcopyassetcc() {
        return CopyAssetCC;
    }   
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/span[1]/div[2]/div[1]/i[1]")
    private WebElement NewAssetCC;
    
    public WebElement getnewassetcc() {
        return NewAssetCC;
    }    
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/span[1]/div[2]/div[1]/i[1]")
    private WebElement NewAssetcode;
    
    public WebElement getnewassetcode() {
        return NewAssetcode;
    }    
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/span[2]/div[1]/div[1]/label[1]/i[1]")
    private WebElement CopyassetUC;
    
    public WebElement getcopyassetuc() {
        return CopyassetUC;
    }    
    
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    private WebElement Assetok;
    
    public WebElement getassetok() {
        return Assetok;
    }    
      
    
}
