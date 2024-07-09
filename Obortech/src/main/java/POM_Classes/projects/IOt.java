package POM_Classes.projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IOt {
	
public WebDriver driver;
    
    public IOt(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
    private WebElement IOTDevices;
    
    public WebElement getiotdevices() {
    	return IotDevices;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
    private WebElement IotItems;
    
    public WebElement getiotitems() {
    	return IotItems;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
    private WebElement IotGroup1;
    
    public WebElement getiotgroup1() {
    	return IotGroup1;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
    private WebElement IotGroup2;
    
    public WebElement getiotgroup2() {
    	return IotGroup2;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
    private WebElement IotGroup3;
    
    public WebElement getiotgroup3() {
    	return IotGroup3;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[2]/div[1]/form[1]/div[6]/div[1]/span[1]/input[1]")
    private WebElement AlertSealing;
    
    public WebElement getalerstsealing() {
    	return AlertSealing;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[2]/div[1]/form[1]/div[6]/div[1]/span[2]/input[1]")
    private WebElement AlertTemp;
    
    public WebElement getalerttemp() {
    	return AlertTemp;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[2]/div[1]/form[1]/div[6]/div[1]/span[3]/input[1]")
    private WebElement AlertHumidity;
    
    public WebElement getalerthumidity() {
    	return AlertHumidity;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[2]/div[1]/form[1]/div[6]/div[1]/span[4]/input[1]")
    private WebElement AlertTamper;
    
    public WebElement getalerttamper() {
    	return AlertTamper;
    }
    


}
