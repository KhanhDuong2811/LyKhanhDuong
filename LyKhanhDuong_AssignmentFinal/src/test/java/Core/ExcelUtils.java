package Core;

import org.apache.poi.hpsf.Date;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ExcelUtils {
    private static XSSFSheet ExcelSheet;
    private static XSSFWorkbook xssfWorkbook;
    public static HSSFWorkbook workbook;
    public static HSSFSheet sheet;
    public static Map<String, Object[]> testResult;

    public static Object[][] getTableArray(String FilePath, String SheetName, int startCol, int totalCols) {
        String[][] tabArray = null;
        try {
            FileInputStream ExcelFile = new FileInputStream(FilePath);
            // Access the required test data sheet
            xssfWorkbook = new XSSFWorkbook(ExcelFile);
            ExcelSheet = xssfWorkbook.getSheet(SheetName);
            int startRow = 1;
            int ci, cj;
            int totalRows = ExcelSheet.getLastRowNum();
            tabArray = new String[totalRows][totalCols];
            ci = 0;
            for (int i = startRow; i <= totalRows; i++, ci++) {
                cj = 0;
                for (int j = startCol; j < totalCols + startCol; j++, cj++) {
                    tabArray[ci][cj] = getCellData(i, j);
                }
            }
        } catch (IOException e) {
            System.out.println("Could not read the Excel sheet");
            e.printStackTrace();
        }
        return (tabArray);
    }

    private static String getCellData(int rowIndex, int colIndex) {
        DataFormatter formatter = new DataFormatter();
        XSSFCell cell;
        try {
            cell = ExcelSheet.getRow(rowIndex).getCell(colIndex);
            if (cell == null) {
                return "";
            } else {
                return formatter.formatCellValue(cell);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
    public static void writeHeadingExcelFile(String sheetName){
        workbook = new HSSFWorkbook();
        sheet = workbook.createSheet(sheetName);
        testResult = new LinkedHashMap<String, Object[]>();
        testResult.put("1", new Object[]{"Testcase_No", "Testcase_Name", "Expected_Result", "Actual_Result"});
    }


    public static void writeDataToExcelFile(String path){
        Set<String> keyset = testResult.keySet();
        int rownum = 0;
        for (String key : keyset) {
            Row row = sheet.createRow(rownum++);
            Object[] objArr = testResult.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                if ((obj instanceof Date))
                    cell.setCellValue((RichTextString) obj);
                else if (obj instanceof Boolean)
                    cell.setCellValue((Boolean) obj);
                else if (obj instanceof String)
                    cell.setCellValue((String) obj);
                else if (obj instanceof Double)
                    cell.setCellValue((Double) obj);
            }
        }
        try {
            java.util.Date date = new java.util.Date();
            FileOutputStream out = new FileOutputStream(new File(path + date.getTime() + ".xls"));
            workbook.write(out);
            out.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeData(String row, String testNo, String testName, String expect, String actual){
        testResult.put(row, new Object[]{testNo, testName, expect, actual});

    }

}