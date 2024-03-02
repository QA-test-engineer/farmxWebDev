package ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelFile2 {

	public void readingExcelFile() throws IOException {
		String filepath="C:\\Users\\User\\Documents\\Test Cases.xlsx";
		String fileName="Test Cases.xlsx";
		String sheetName="Integration Test Cases";
		
		File file=new File(filepath);
		FileInputStream inputStream=new FileInputStream(file);
		Workbook myworkbook=new XSSFWorkbook(inputStream);// because excel file type is .xlsx
		
		Sheet firstsheet=myworkbook.getSheet(sheetName);
		
		int rowCount=firstsheet.getLastRowNum()-firstsheet.getFirstRowNum();
		
		for(int i=0;i<rowCount+1;i++)
		{
			Row row=firstsheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				if(row.getCell(j)!=null)
				{
					try {
						System.out.print(row.getCell(j).getStringCellValue()+" || ");
					}
					catch(Exception e)
					{
						try
						{
							System.out.print(row.getCell(j).getDateCellValue()+" || ");
						}
						catch(Exception e2)
						{
							System.out.print(row.getCell(j).getNumericCellValue()+" || ");
						}						
					}
				}
				
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		readExcelFile2 obj=new readExcelFile2();
		obj.readingExcelFile();
		
	}

}
