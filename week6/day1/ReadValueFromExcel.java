package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadValueFromExcel {

	public static void main(String[] args) throws IOException {

		//xssf- xml spread sheet format
		//step -1 set the path of  workbook
		XSSFWorkbook wb=new XSSFWorkbook("./Excel/CreateLead.xlsx");
		
		//step-2 -get into sheet
		XSSFSheet sheetAt = wb.getSheetAt(0);
		
		//step -3 get into row value
		int rowValue = sheetAt.getLastRowNum();
		System.out.println("Row count :"+rowValue);
		//ignore the header value
		
		
		int phy = sheetAt.getPhysicalNumberOfRows();
		System.out.println("Get header value count to be Added in row :"+phy);
		
		//step 4- get cell count
		short cellValue = sheetAt.getRow(1).getLastCellNum();
		System.out.println("Cell count :"+cellValue);
	
		//row value - start from index 1
		//cell value -start from index 0
		
		String value = sheetAt.getRow(2).getCell(2).getStringCellValue();
		System.out.println(value);
		
		//row -1
		for (int i = 1; i <=rowValue; i++) {
			//sheetAt.getRow(i).getCell(2).getStringCellValue();
			//cell -=
			for (int j = 0; j <cellValue; j++) {
				
				String getAllValues = sheetAt.getRow(i).getCell(j).getStringCellValue();
				System.out.println(getAllValues);
				
			}
		}
		
	}

}
