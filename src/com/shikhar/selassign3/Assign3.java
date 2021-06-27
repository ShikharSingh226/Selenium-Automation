package com.shikhar.selassign3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assign3 {
public static void main (String [] args) throws IOException{
	//Apache Poi Reading Data
	/*
	 * FileInputStream fs = new FileInputStream("E:\\Book1.xlsx"); XSSFWorkbook
	 * workbook = new XSSFWorkbook(fs); XSSFSheet sheet =
	 * workbook.getSheet("Sheet1"); Row row = sheet.getRow(0); Cell cell =
	 * row.getCell(0); System.out.println(sheet.getRow(0).getCell(0)); Row row1 =
	 * sheet.getRow(1); Cell cell1 = row1.getCell(1);
	 * System.out.println(sheet.getRow(0).getCell(1)); Row row2 = sheet.getRow(1);
	 * Cell cell2 = row2.getCell(1); System.out.println(sheet.getRow(1).getCell(0));
	 * Row row3 = sheet.getRow(1); Cell cell3 = row3.getCell(1);
	 * System.out.println(sheet.getRow(1).getCell(1));
	 */

}
}
	//Apache Poi write Data
	/*String path = "E://Book1.xlsx";
	FileInputStream fs = new FileInputStream(path);
	Workbook wb = new XSSFWorkbook(fs);
	Sheet sheet1 = wb.getSheetAt(0);
	int lastRow = sheet1.getLastRowNum();
	for(int i=0; i<=lastRow; i++){
	Row row = sheet1.getRow(i);
	Cell cell = row.createCell(2);
	cell.setCellValue("Write into Excel");
	}
	FileOutputStream fos = new FileOutputStream(path);
	wb.write(fos);
	fos.close();
	}

	}
*/

