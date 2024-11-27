package ToReadFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleRowsandCells {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./Resources/DataSheets.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		int rowCount=workbook.getSheet("Sheet1").getPhysicalNumberOfRows();
		String[][] arr=new String[rowCount][];
		for(int i=0;i<rowCount;i++) {
			int cellCount=workbook.getSheet("Sheet1").getRow(i).getPhysicalNumberOfCells();
			arr[i]=new String[cellCount];
			for(int j=0;j<cellCount;j++) {
				arr[i][j]=workbook.getSheet("Sheet1").getRow(i).getCell(j).toString();
			}
		}
		System.out.println("[");
		for(int i=0;i<rowCount;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("]");
	}
}
