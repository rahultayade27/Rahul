package Com.OrnageHrm;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static void main(String[] args) {
		Workbook wb;
		Sheet sheet;
		Row row;
		Cell cell;
	
		String filepath="C:\\selenium excel Hndling.TestData.xlsx";	
		
		
		try {
			
			FileInputStream input=new FileInputStream(filepath);
			
			String extension=filepath.substring(filepath.indexOf("."));
			
			System.out.println(extension);
			
			if(extension.equals(".xlsx"))
			{
				 wb=new XSSFWorkbook(input);
			}
			else
			{
				 wb=new HSSFWorkbook(input);
			}
			
			sheet=wb.getSheet("Sheet1");
			
			int totalrows=sheet.getPhysicalNumberOfRows();
			System.out.println("total rows :"+ totalrows);
			
			int totalColumn=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("total column:"+ totalColumn);
			
			for(int i=1;i<totalrows;i++)
			{
				row=sheet.getRow(i);
				//System.out.println(i);
				
				for(int j=0;j<totalColumn;j++)
				{
				  cell=row.getCell(j);
				  
				  System.out.print(cell.getStringCellValue());
				}
				
				System.out.println();
			}
	}
		 catch(Exception ae)
		 {
			 ae.printStackTrace();
		 }

	}

}
