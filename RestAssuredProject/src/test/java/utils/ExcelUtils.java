package utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private XSSFWorkbook workbook;
	private XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

	public void getCellData(int rowNum, int colNum) {
		DataFormatter formatter = new DataFormatter(); // <--to format any type of data
		Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));

		System.out.println(value);
	}

	public void getRowCount() { // <--getting count of the rows
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows: " + rowCount);

	}
}
