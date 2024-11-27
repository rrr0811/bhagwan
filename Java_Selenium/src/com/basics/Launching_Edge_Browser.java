package com.basics;

import org.openqa.selenium.edge.EdgeDriver;

public class Launching_Edge_Browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
	}
}
