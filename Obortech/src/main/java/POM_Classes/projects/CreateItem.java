package POM_Classes.projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateItem {
	
public WebDriver driver;
    
    public CreateItem(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//button[contains(text(),'CREATE Item')]")
    private WebElement selectgroupsok;
    
    public WebElement getselectgroupsok() {
    	return selectgroupsok;
    }
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]")
    private WebElement AddItemName;
    
    public WebElement getadditemname() {
    	return AddItemName;
    }
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/i[1]")
    private WebElement AddUniqueCode;
    
    public WebElement getadduniquecode() {
    	return AddUniqueCode;
    }
    
    @FindBy(xpath = "//button[contains(text(),'DONE')]")
    private WebElement UniqueCodeDone;
    
    public WebElement getuniquecodedone() {
    	return UniqueCodeDone;
    }
    
    @FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[2]/i[1]")
    private WebElement CopyUniqueCode;
    
    public WebElement getcopyuniquecode() {
    	return CopyUniqueCode;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/label[2]/input[1]")
    private WebElement ConnectIotYes;
    
    public WebElement getconnectiotyes() {
    	return ConnectIotYes;
    }   
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/label[3]/input[1]")
    private WebElement ConnectIotNo;
    
    public WebElement getconnectiotno() {
    	return ConnectIotNo;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]")
    private WebElement SelectDevice;
    
    public WebElement getselectdevice() {
    	return SelectDevice;
    } 

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[2]/input[1]")
    private WebElement AddTag;
    
    public WebElement getaddtag() {
    	return AddTag;
    }
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/button[1]/i[1]")
    private WebElement AddDevice;
    
    public WebElement getadddevice() {
    	return AddDevice;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[3]/span[1]/i[1]")
    private WebElement DeleteDevice;
    
    public WebElement getdeletedevice() {
    	return DeleteDevice;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")
    private WebElement SubmitItem;
    
    public WebElement getsubmititem() {
    	return SubmitItem;
    } 
    
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    private WebElement CreateQRok;
    
    public WebElement getcreateqrok() {
    	return CreateQRok;
    } 
}
