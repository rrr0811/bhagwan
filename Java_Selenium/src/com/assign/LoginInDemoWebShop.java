package com.assign;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginInDemoWebShop {
	/***
	 * 
	 * @author : Harshavardhan G R
	 * 
	 */
public static void main(String[] args) throws EncryptedDocumentException, IOException  {
	File file=new File("./Resources/DWSTC.xlsx");
	FileInputStream fis=new FileInputStream(file);
	Workbook workbook=WorkbookFactory.create(fis);
	
	//Expected Results
	String welcomeText="Welcome, Please Sign In!";
	String homeText="Welcome to our store";
	
	//Test Data
	String URL=workbook.getSheet("Sheet1").getRow(1).getCell(6).toString();
	String email=workbook.getSheet("Sheet1").getRow(2).getCell(6).toString();
	String password=workbook.getSheet("Sheet1").getRow(3).getCell(6).toString();
	
	//Step 1:  Open browser and enter the URL
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(URL);
	if(driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']")).getText().equals(welcomeText))
		System.out.println("welcome page displayed");
	else
		System.out.println("welcome page not displayed");
	
	//Step 2.enter given email in ETF

	WebElement emailTextField = driver.findElement(By.id("Email"));
	emailTextField.clear();
	emailTextField.sendKeys(email);
	if(emailTextField.getAttribute("value").equals(email))
		System.out.println("ETF accepting proper data");
	else
		System.out.println("ETF not accepting proper data");
	
	//Step 3. enter given password in PTF

	
	WebElement passwordTextField = driver.findElement(By.id("Password"));
	passwordTextField.clear();
	passwordTextField.sendKeys(password);
	if(passwordTextField.getAttribute("value").equals(password))
		System.out.println("PTF accepting proper data");
	else
		System.out.println("PTF not accepting proper data");
	
	//Step 4. check on remember me check box

	WebElement checkBox = driver.findElement(By.id("RememberMe"));
	checkBox.click();
	if(checkBox.isSelected())
		System.out.println("remember me check box is selected");
	else
		System.out.println("remember me check box is not selected");
	
	//Step 5. click on Login button

	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	WebElement homePageText = driver.findElement(By.xpath("//h2[contains(.,'Welcome to our store')]"));
	if(homePageText.getText().contains(homeText)) {
		System.out.println("Login successfull, Home page displayed");
	}
	else
		System.out.println("Login unsuccessfull, Home page not displayed");
}
}
