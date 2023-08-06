package newBegining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MARSIO RENO\\eclipse-workspace-new\\newBegining\\src\\test\\chromedriver.exe");
		WebDriver g = new ChromeDriver();
		g.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		g.manage().window().maximize();
		
		//g.findElement(By.xpath("//input[@type='text']")).sendKeys("SnowLady");
		
		g.switchTo().frame("frame1");
		g.switchTo().frame("frame3");
		
		g.findElement(By.xpath("//input[@id='a']")).click();
		
		g.switchTo().defaultContent();
		g.switchTo().frame("frame2");
		g.findElement(By.xpath("//select[@class='col-lg-3']")).click();
		g.findElement(By.xpath("//option[@value='big baby cat']")).click();
	}

}
