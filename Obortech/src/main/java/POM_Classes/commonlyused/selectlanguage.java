package POM_Classes.commonlyused;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectlanguage {
	
	public WebDriver driver;

	public selectlanguage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='rfs-btn']")
	private WebElement selectlang;

	public WebElement getselectlang() {
		return selectlang;
	}

}
