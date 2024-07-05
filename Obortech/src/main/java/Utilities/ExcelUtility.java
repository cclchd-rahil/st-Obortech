package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;

public class ExcelUtility {
    public FileInputStream fis;
    public FileOutputStream fos;
    public Workbook workbook;
    public Sheet sheet;
    public Row row;
    public Cell cell;
    String path = null;

    public ExcelUtility(String path) {
        this.path = path;
    }

    public int getRowCount(String sheetName) throws Throwable {
        fis = new FileInputStream(path);
        workbook = WorkbookFactory.create(fis);
        sheet = workbook.getSheet(sheetName);
        int rowcount = sheet.getLastRowNum();
        workbook.close();
        fis.close();
        return rowcount;
    }

    public int getCellCount(String sheetName, int rownum) throws Throwable {
        fis = new FileInputStream(path);
        workbook = WorkbookFactory.create(fis);
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(rownum);
        int cellcount = (row == null) ? 0 : row.getLastCellNum();
        workbook.close();
        fis.close();
        return cellcount;
    }

    public String getCellData(String sheetName, int rownum, int colnum) throws Throwable {
        fis = new FileInputStream(path);
        workbook = WorkbookFactory.create(fis);
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(rownum);
        if (row == null) {
            workbook.close();
            fis.close();
            return "";
        }
        cell = row.getCell(colnum);
        DataFormatter formatter = new DataFormatter();
        String data = (cell == null) ? "" : formatter.formatCellValue(cell);
        workbook.close();
        fis.close();
        return data;
    }
}
