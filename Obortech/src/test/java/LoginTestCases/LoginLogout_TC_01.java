package LoginTestCases;

import Utilities.BaseClass;
import Utilities.DataUtility;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POM_Classes.commonlyused.UserDropdown;
import POM_Classes.loginlogout.LoginLogoutPage;

public class LoginLogout_TC_01 extends BaseClass {
    private LoginLogoutPage loginLogoutPage;
    private UserDropdown userDropdown;
    private DataUtility du;

    @BeforeClass
    public void setUp() throws Throwable {
   
        loginLogoutPage = new LoginLogoutPage(driver);
        userDropdown = new UserDropdown(driver);
        du = new DataUtility();
    }

    @Test(dataProvider = "Obortechexcelcred", dataProviderClass = DataUtility.class)
    public void testLoginAndLogout(String username, String password, String blockchain_password) throws Throwable {
        
    	
    	 Thread.sleep(1000);  
        loginLogoutPage.getUsernameTextfield().sendKeys(username);
       
        Thread.sleep(1000);   
        loginLogoutPage.getProfilePasswordTextfield().sendKeys(password);
       
        loginLogoutPage.getContinueButton().click();
        
        loginLogoutPage.getBlockchainPassword().sendKeys(blockchain_password);
        loginLogoutPage.getContinueofBlockchain().click();

       
        Thread.sleep(5000); 
        userDropdown.getuserdropdown().click();
        
        Thread.sleep(2000); 
        userDropdown.getlogout().click();
        
        loginLogoutPage.getSubmitLogout().click();
    }
}
