package newBegining;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThursDay {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MARSIO RENO\\eclipse-workspace-new\\newBegining\\src\\test\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");

		WebElement us = d.findElement(By.name("email"));
		WebElement ps = d.findElement(By.name("pass"));
		WebElement lg = d.findElement(By.name("login"));
		// us.sendKeys("marsio");

		JavascriptExecutor j = (JavascriptExecutor) d;
		j.executeScript("arguments[0].setAttribute('value','marsioreno')", us);
		j.executeScript("arguments[0].setAttribute('value','marsio')", ps);

		j.executeScript("arguments[0].setAttribute('Style','background:yellow;border:2px solid green')", us);
		j.executeScript("arguments[0].setAttribute('Style','border:2px solidgreen')", ps);
		
		// ScrollDown
		j.executeScript("window.scrollBy(0,200)");
		
		Thread.sleep(2000);

		// ScrollUp
		j.executeScript("window.scrollBy(0,-100)");
		
		
		TakesScreenshot t = (TakesScreenshot)d;
		File sr = t.getScreenshotAs(OutputType.FILE);
		File ds =new File("C:\\Users\\MARSIO RENO\\eclipse-workspace-new\\july\\ss.png");
		FileUtils.copyFile(sr, ds);
		
		
		
		

	}

}
