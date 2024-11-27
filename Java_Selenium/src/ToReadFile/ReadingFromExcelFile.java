package ToReadFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFromExcelFile {
	public static void main(String[] args) throws IOException {
		File file=new File("./Resources/data.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Date date = workbook.getSheet("Sheet3").getRow(7).getCell(7).getDateCellValue();
		String name = workbook.getSheet("Sheet1").getRow(7).getCell(1).getStringCellValue();
		boolean status=workbook.getSheet("Sheet2").getRow(7).getCell(4).getBooleanCellValue();
		double value = workbook.getSheet("Sheet4").getRow(7).getCell(9).getNumericCellValue();
		System.out.println(name+"  -  "+date+"  -  "+status+"  -  "+value);
	}
}
