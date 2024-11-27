package ScreenshotMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UsingGetScreenshotAs {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.yamaha-motor-india.com/");
		File source=driver.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File("./ErrorShots/YamahaMotors.jpeg"));
		File logo=driver.findElement(By.xpath("//img[@alt='Yamaha Logo']")).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(logo, new File("./ErrorShots/YamahaLogo.png"));
	}
}
