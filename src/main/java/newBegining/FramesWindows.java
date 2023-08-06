package newBegining;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MARSIO RENO\\eclipse-workspace-new\\newBegining\\src\\test\\chromedriver.exe");
		WebDriver g = new ChromeDriver();
		
		g.get("https://demoqa.com/alerts");
		g.manage().window().maximize();
		
		//Simple Alert
		g.findElement(By.id("alertButton")).click();
		Alert a = g.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		
		
		g.findElement(By.id("timerAlertButton")).click();
		WebDriverWait wait = new WebDriverWait(g,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(a.getText());
		a.accept();
		
		
		//Confirm Alert
		g.findElement(By.id("confirmButton")).click();
		System.out.println(a.getText());
		a.dismiss();
		
		//Prompt Alert
		Thread.sleep(5000);
		g.findElement(By.id("promtButton")).click();
		
		
		
		
	}

}
