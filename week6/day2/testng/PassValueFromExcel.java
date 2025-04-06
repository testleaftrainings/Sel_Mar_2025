package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PassValueFromExcel {

	//step 4
	//static - its common references but you can change value
	public static String[][] readExcel(String fileName) throws IOException {

		XSSFWorkbook wb=new XSSFWorkbook("./Excel/"+fileName+".xlsx");
		XSSFSheet sheetAt = wb.getSheetAt(0);
		int rowValue = sheetAt.getLastRowNum();
		short cellValue = sheetAt.getRow(1).getLastCellNum();
		
		//step 1 -get row and cell count from excel
		String[][] data=new String[rowValue][cellValue];
		
		for (int i = 1; i <=rowValue; i++) {
			for (int j = 0; j <cellValue; j++) {
				String getAllValues = sheetAt.getRow(i).getCell(j).getStringCellValue();
				
				//step2
				//dp - index value start from  row and cell-'0'  => [0][0]
				//excel -index value start  row from -'1' , cell -'0' =>[1][0]
				data[i-1][j]=getAllValues;
				//data[1-1][0]=> data[0][0]
			}
		}
		//step3
		wb.close();
		return data;
	}

}
