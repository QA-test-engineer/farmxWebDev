package ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelData {

	public void readExcel(String filePath, String fileName, String sheetName) throws IOException 
	{

		File file = new File(filePath + "\\" + fileName);

		FileInputStream inputStream = new FileInputStream(file);

		Workbook myworkbook = null;

		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		if (fileExtensionName.equals(".xlsx")) {

			myworkbook = new XSSFWorkbook(inputStream);

		}

		else if(fileExtensionName.equals(".xls")) {

			myworkbook = new HSSFWorkbook(inputStream);

		}

		Sheet mysheet = myworkbook.getSheet(sheetName);

		int rowCount = mysheet.getLastRowNum() - mysheet.getFirstRowNum();

		for (int i = 0; i < rowCount + 1; i++) 
		{
			Row row = mysheet.getRow(i);

			for (int j = 0; j < row.getLastCellNum(); j++) 
			{

				if(row.getCell(j)!=null)
				{
					try {
						System.out.print(row.getCell(j).getStringCellValue() + "|| ");
					}
					catch(Exception e){
						try {
							System.out.print(row.getCell(j).getDateCellValue() + "|| ");
						}catch(Exception e2)
						{
							System.out.print(row.getCell(j).getNumericCellValue() + "|| ");
						}						
					}
				}		
			}
			System.out.println();
		}
	}

	public static void main(String... strings) throws IOException 
	{

		readExcelData objExcelFile = new readExcelData();

		// String filePath =System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";
		String filePath="C:\\Users\\User\\Documents";
		objExcelFile.readExcel(filePath, "Test Cases.xlsx", "Integration Test Cases");

	}
}
