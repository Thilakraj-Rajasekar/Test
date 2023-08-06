package newBegining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MARSIO RENO\\eclipse-workspace-new\\newBegining\\src\\test\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement dr = d.findElement(By.xpath("//a[contains(text(),' SALES ')]"));
		WebElement dp = d.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		WebElement dr1 = d.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
		WebElement dp1 = d.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		WebElement dr2 = d.findElement(By.xpath("//a[contains(text(),' 5000 ')]"));
		WebElement dp2 = d.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		WebElement dr3 = d.findElement(By.xpath("//a[contains(text(),' 5000')]"));
		WebElement dp3 = d.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		
		
		
		Actions a = new Actions(d);
		a.dragAndDrop(dr, dp).build().perform();
		a.dragAndDrop(dr1, dp1).build().perform();
		a.dragAndDrop(dr2, dp2).build().perform();
		a.dragAndDrop(dr3, dp3).build().perform();
		
		
		
		
		
		
	}

}
