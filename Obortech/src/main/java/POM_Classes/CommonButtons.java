package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonButtons {

	public WebDriver driver;

	public CommonButtons(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(text(),'YES')]")
	private WebElement DeleteYes;

	public WebElement getdeletees() {
		return DeleteYes;
	}

	@FindBy(xpath = "//button[contains(text(),'NO')]")
	private WebElement DeleteNo;

	public WebElement getdeleteno() {
		return DeleteNo;
	}

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	private WebElement ok;

	public WebElement getok() {
		return ok;
	}

}
