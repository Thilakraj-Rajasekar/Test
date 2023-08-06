package newBegining;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tues {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MARSIO RENO\\eclipse-workspace-new\\newBegining\\src\\test\\chromedriver.exe");
		WebDriver g = new ChromeDriver();
		
		g.get("https://www.facebook.com/");
		
		WebElement in = g.findElement(By.id("email"));
		in.sendKeys("Marsio");
		
		WebElement ps = g.findElement(By.id("pass"));
		ps.sendKeys("Tharcius");
		
		//WebElement lg = g.findElement(By.name("login"));
		//lg.click();
		
		
		WebElement pl = g.findElement(By.partialLinkText("log"));
		String txt = pl.getText();
		System.out.println(txt);
		
		List<WebElement> tg = g.findElements(By.tagName("a"));
		for (int i = 0; i <tg.size(); i++) {
			WebElement tx = tg.get(i);
			String tt = tx.getText();
			System.out.println(tt);
		}
		
		
	}

}
