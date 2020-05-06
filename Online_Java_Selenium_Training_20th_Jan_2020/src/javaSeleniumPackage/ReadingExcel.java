package javaSeleniumPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		
		//Specify the location of file
		
		File src = new File ("E:\\Shammi_Selenium\\ExcelData\\Demo.xlsx");
		
		//LoadFile
		
		FileInputStream fis = new FileInputStream(src);
		
		//Loadworkbook
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//Load worksheet
		
		XSSFSheet sh = wb.getSheet("Demosheet");
		System.out.println(sh.getSheetName());
		
		//printusername from excel sheet
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		
		//printp2 from excel sheet
		System.out.println(sh.getRow(2).getCell(1).getStringCellValue());
		
		//print total number of rows - 1st way
		System.out.println(sh.getPhysicalNumberOfRows());
		
		//print total number of rows - 2nd  way
		System.out.println(sh.getLastRowNum()); 
		System.out.println(sh.getFirstRowNum());
		
		int rows = sh.getLastRowNum()-sh.getFirstRowNum();
		System.out.println("Total no of rows:" + (rows + 1));
		
		//print total number of rows - 3rd  way
		System.out.println(sh.getLastRowNum() + 1);
		
		//print total number of columns - 1st  way
		System.out.println(sh.getRow(0).getLastCellNum());
		

		//print total number of columns - 2nd  way
		int columns = sh.getRow(0).getLastCellNum();
		System.out.println("Total no of Column:" + columns);
		
		//print total number of columns - 3rd  way
		System.out.println(sh.getRow(0).getPhysicalNumberOfCells());
		
		//print all cells of excel file
		for (int i=0;i<rows+1; i++) {
			for (int j=0;j<columns; j++) {
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
		}
		
  
	}

}
