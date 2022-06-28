package selenium;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.IOException;

public class ExcelReading {

    @Test
    public void excelReading() throws IOException {

        Workbook workbook = new XSSFWorkbook("C:\\Users\\Purushothama_Kurnool\\Desktop\\Book1.xlsx");
        /*Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(2);
        Cell cell = row.getCell(0);
        System.out.println(cell.getStringCellValue());*/

       // System.out.println(workbook.getSheetAt(0).getRow(0).getCell(0).getStringCellValue());

        Sheet sheet = workbook.getSheet("Sheet1");

        int rowsCount = sheet.getLastRowNum();

        for(int i=0;i<=rowsCount;i++)
        {
           int columnsCount = sheet.getRow(i).getLastCellNum();

           for(int j=0;j<columnsCount;j++)
           {
               System.out.println(readData(sheet.getRow(i).getCell(j)));
           }

        }
    }

    public static Object readData(Cell cell)
    {
        if(cell.getCellType() == CellType.STRING)
        {
            return cell.getStringCellValue();
        }else if(cell.getCellType() == CellType.NUMERIC)
        {
            return cell.getNumericCellValue();
        }
        return -1;
    }
}
