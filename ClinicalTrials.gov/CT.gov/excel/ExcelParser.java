


package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelParser {
	
	public static void main(String[] args) {
		
		try {
			String st = "../Example-CT.gov-data-v3-v011.xlsx";
			File file = new File(st);
			Workbook wb = WorkbookFactory.create(file);
			Sheet sheet = wb.getSheetAt(0);
			
			
			int rows = sheet.getPhysicalNumberOfRows();
			int cols = sheet.getRow(0).getPhysicalNumberOfCells();
			
			for(Row row : sheet) {
				for(Cell cell : row) {
					System.out.println(cell);
				}
			}
		} catch (IOException | InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
