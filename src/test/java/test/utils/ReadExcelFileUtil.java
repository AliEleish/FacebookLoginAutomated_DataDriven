package test.utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ReadExcelFileUtil {

    XSSFWorkbook wb;
    XSSFSheet sheet;

    public ReadExcelFileUtil(String excelFilePath)
    {
        try {
            File file = new File(excelFilePath);
            FileInputStream fis = new FileInputStream(file);
            wb = new XSSFWorkbook(fis);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public String getData(int sheetnumber , int row , int column)
    {
        sheet = wb.getSheetAt(sheetnumber);
       String data=  sheet.getRow(row).getCell(column).getStringCellValue();
       return data;
    }

    public int getRowCount(int sheetIndex)
    {
       int rowCount = wb.getSheetAt(sheetIndex).getLastRowNum();
       rowCount = rowCount + 1;
       return rowCount;
    }
}
