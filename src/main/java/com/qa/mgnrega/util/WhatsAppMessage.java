package com.qa.mgnrega.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class WhatsAppMessage {
	
	
			
	public static void main(String[] args) {
		
				try {
			String csvFile = "names.csv";
			BufferedReader br = null;
			String line = "";
			WebDriverManager.chromedriver().version("2.40").setup();
			WebDriver driver = new ChromeDriver();
			String baseUrl = "https://web.whatsapp.com/";
			driver.get(baseUrl);
			Thread.sleep(15000);
			
			br = new BufferedReader(new FileReader(csvFile));

				while ((line = br.readLine()) != null) {

					driver.findElement(By.xpath("//label[@class='_2MSJr']")).click();
					WebElement ser = driver.findElement(By.xpath("//*[@id=\"side\"]/div[1]/div/label/div/div[2]"));
					ser.sendKeys(line + "\n");
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div[2]/div/div[2]")).click();
					/*WebElement e = driver.findElement(By.className("_1Plpp"));
					e.sendKeys("Issue in MIS Portal  \n");
					*/
					driver.findElement(By.xpath("//div[@title='Attach']")).click();
					WebElement uploadElement = driver.findElement(By.xpath("//li[1]//button[1]//input[1]"));
					uploadElement.sendKeys("F:\\WorkSpace\\TESTProject\\MISReportJarCreation\\Screenshot\\MISReportPage.png");
					Thread.sleep(2000);

					
					WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/span/div/span/div/div/div[2]/div[1]/span/div/div[2]/div/div[3]/div[1]/div[2]"));
					
					ele1.click();
					
					ele1.sendKeys("Issue in MIS Portal \n");
					Thread.sleep(2000);

				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			// close bro
			// driver.close();

		}

	}


