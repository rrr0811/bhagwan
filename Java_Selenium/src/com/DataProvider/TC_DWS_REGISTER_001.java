package com.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_DWS_REGISTER_001 {
	@DataProvider(name="registration details")
	public String[][] passTestData() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(new File("./Resources/DataSheets.xlsx"));
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet worksheet = workbook.getSheet("DWS register");
		int rowCount=worksheet.getPhysicalNumberOfRows()-1;
		String [][] arr=new String[rowCount][];
		for(int i=0;i<rowCount;i++) {
			int cellCount=worksheet.getRow(i+1).getPhysicalNumberOfCells();		
			arr[i]=new String[cellCount];
			for(int j=0;j<cellCount;j++) {
				arr[i][j]=worksheet.getRow(i+1).getCell(j).toString();
			}
		}
		return arr;
		
	}
	@Test(dataProvider = "registration details")
	public void testingUserNameTextField(String[] testData) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-"+testData[0].toLowerCase())).click();
		driver.findElement(By.id("FirstName")).sendKeys(testData[1]);
		driver.findElement(By.id("LastName")).sendKeys(testData[2]);
		driver.findElement(By.id("Email")).sendKeys(testData[3]);
		driver.findElement(By.id("Password")).sendKeys(testData[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(testData[5]);
		driver.findElement(By.id("register-button")).click();
		driver.quit();
	}
}
