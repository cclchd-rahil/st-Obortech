package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormBuilder {
	
public WebDriver driver;
    
    public FormBuilder(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")  
    private WebElement SelectForm;
    
    public WebElement getSelectForm() {
        return SelectForm;
    }
      
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
    private WebElement New;
    
    public WebElement getNew() {
        return New;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]")
    private WebElement Preview;
    
    public WebElement getPreview() {
        return Preview;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[2]/button[3]")
    private WebElement Save;
    
    public WebElement getSave() {
        return Save;
    }
    
    @FindBy(xpath = "//input[@id='name']")
    private WebElement FormName;
    
    public WebElement getFormName() {
        return FormName;
    }
    
    @FindBy(xpath = "//button[contains(text(),'SUBMIT')]")
    private WebElement SubmitForm;
    
    public WebElement getSubmitForm() {
        return SubmitForm;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[2]/button[4]")
    private WebElement FormDelete;
    
    public WebElement getFormDelete() {
        return FormDelete;
    }
    
    @FindBy(xpath = "//button[contains(text(),'DELETE')]")
    private WebElement ConfirmFormDelete;
    
    public WebElement getConfirmFormDelete() {
        return ConfirmFormDelete;
    }
   
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    private WebElement CloseFormDelete;
    
    public WebElement getCloseFormDelete() {
        return CloseFormDelete;
    }
      
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]")
    private WebElement Header;
    
    public WebElement getHeader() {
        return Header;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement Footer;
    
    public WebElement getFooter() {
        return Footer;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement ParagrapghText;
    
    public WebElement getParagrapghText() {
        return ParagrapghText;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement TextInput;
    
    public WebElement getTextInput() {
        return TextInput;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement NumberInput;
    
    public WebElement getNumberInput() {
        return NumberInput;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement MultilineInput;
    
    public WebElement getMultilineInput() {
        return MultilineInput;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement MultipleChoice;
    
    public WebElement getMultipleChoice() {
        return MultipleChoice;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement Checkboxes;
    
    public WebElement getCheckboxes() {
        return Checkboxes;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement Image;
    
    public WebElement getImage() {
        return Image;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement Range;
    
    public WebElement getRange() {
        return Range;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement Iotdataon;
    
    public WebElement getIotdataon() {
        return Iotdataon;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement Iotdataoff;
    
    public WebElement getIotdataoff() {
        return Iotdataoff;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement IotReport;
    
    public WebElement getIotReport() {
        return IotReport;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement LineBreak;
    
    public WebElement getLineBreak() {
        return LineBreak;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement Tags;
    
    public WebElement getTags() {
        return Tags;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement Dropdown;
    
    public WebElement getDropdown() {
        return Dropdown;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement DynamicFormField;
    
    public WebElement getDynamicFormField() {
        return DynamicFormField;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement TwoColumnRow;
    
    public WebElement getTwoColumnRow() {
        return TwoColumnRow;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement ThreeColumnRow;
    
    public WebElement getThreeColumnRow() {
        return ThreeColumnRow;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement FourColumnRow;
    
    public WebElement getFourColumnRow() {
        return FourColumnRow;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement FileUpload;
    
    public WebElement getFileUpload() {
        return FileUpload;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement Signature;
    
    public WebElement getSignature() {
        return Signature;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement Transferasset;
    
    public WebElement getTransferasset() {
        return Transferasset;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement Createasset;
    
    public WebElement getCreateasset() {
        return Createasset;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement Removeasset;
    
    public WebElement getRemoveasset() {
        return Removeasset;
    }
    
    @FindBy(id = "projectCategory")
    private WebElement AddButton;
    
    public WebElement getAddButton() {
        return AddButton;
    }

}
