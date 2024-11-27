package com.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_DWS_LOGIN_001 {
	@DataProvider
	public String[] passTestData() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(new File("./Resources/DataSheets.xlsx"));
		Workbook workbook=WorkbookFactory.create(fis);
		int rowCount=workbook.getSheet("Sheet1").getPhysicalNumberOfRows();
		String [] arr=new String[rowCount];
		for(int i=0;i<arr.length;i++) {
			arr[i]=workbook.getSheet("Sheet1").getRow(i).getCell(0).toString();
		}
		return arr;
		
	}
	@Test(dataProvider = "passTestData")
	public void testingUserNameTextField(String testData) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(testData);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}
