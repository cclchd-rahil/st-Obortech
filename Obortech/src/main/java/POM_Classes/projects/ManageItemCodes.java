package POM_Classes.projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageItemCodes {
	
	public WebDriver driver;
	
    public ManageItemCodes(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
    private WebElement ManualCode;
    
    public WebElement getmanualcode() {
    	return ManualCode;
    }
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[2]/i[1]")
    private WebElement CopyManualCode;
    
    public WebElement getcopymanualcode() {
    	return CopyManualCode;
    }
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/label[2]/i[1]")
    private WebElement CopyUniqueCode;
    
    public WebElement getcopyuniquecode() {
    	return CopyUniqueCode;
    }
    
    @FindBy(xpath = "//b[contains(text(),'Generate QR code')]")
    private WebElement GenerateQRCode;
    
    public WebElement getgenerateqrcode() {
    	return GenerateQRCode;
    }
    
    @FindBy(xpath = "//button[contains(text(),'Copy URL')]")
    private WebElement CopyURL;
    
    public WebElement getcopyurl() {
    	return CopyURL;
    }
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/button[3]")
    private WebElement CreateNFT;
    
    public WebElement getcreatenft() {
    	return CreateNFT;
    }
    
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    private WebElement CreateNFTok;
    
    public WebElement getcreatenftok() {
    	return CreateNFTok;
    }
    
    
    @FindBy(xpath = "//button[contains(text(),'JPG')]")
    private WebElement DownloadJPG;
    
    public WebElement getdownloadjpg() {
    	return DownloadJPG;
    }
    
    @FindBy(xpath = "//button[contains(text(),'SVG')]")
    private WebElement DownloadSVG;
    
    public WebElement getdownloadsvg() {
    	return DownloadSVG;
    }
    
    @FindBy(xpath = "//button[contains(text(),'DONE')]")
    private WebElement ManageItemDone;
    
    public WebElement getmanageitemdone() {
    	return ManageItemDone;
    }
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    private WebElement ManageItemClose;
    
    public WebElement getmanageitemClose() {
    	return ManageItemClose;
    }    
    
}
