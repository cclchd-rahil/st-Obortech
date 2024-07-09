package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.DataProvider;

public class DataUtility {
    public String dataFromPropertiesFile(String key) throws Throwable {
        File file = new File("./src/main/resources/Credentials.properties");
        FileInputStream fis = new FileInputStream(file);
        Properties pr = new Properties();
        pr.load(fis);
        return pr.getProperty(key);
    }

    @DataProvider(name = "Obortechexcelcred")
    public Object[][] getData() throws Throwable {
        String path = "C:\\Users\\MD Rahil\\OneDrive - chaincode consulting llp\\Desktop\\Obortechexcelcred.xlsx";
        ExcelUtility excel = new ExcelUtility(path);
        int totalRows = excel.getRowCount("Sheet1");
        int totalCols = excel.getCellCount("Sheet1", 0);

        String[][] loginData = new String[totalRows][totalCols];
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                loginData[i - 1][j] = excel.getCellData("Sheet1", i, j);
            }
        }
        return loginData;
    }
}