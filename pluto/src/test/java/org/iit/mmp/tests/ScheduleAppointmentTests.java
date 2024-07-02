package org.iit.mmp.tests;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javaclassexamples.DateExample;



public class ScheduleAppointmentTests {
	@Test
	public void validatebookAppointment()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		
		// 1)login
		driver.findElement(By.id("username")).sendKeys("ria1");
		driver.findElement(By.id("password:")).sendKeys("Ria12345");
		driver.findElement(By.name("submit")).click();
		
		//2)click on tab
		driver.findElement(By.xpath("//span[contains(text(),'Schedule Appointment')]")).click();
		driver.findElement(By.xpath("//input[@value='Create new appointment']")).click();
		
		driver.findElement(By.xpath("//h4[contains(text(),'Dr.Charlie')]/ancestor::ul/following-sibling::button")).click();
		
		driver.switchTo().frame("myframe");
		
		String dateArr[] = DateExample.generateFutureDate(65,"MMM/dd/YYYY").split("/");
		
	

	}
	
	
}
