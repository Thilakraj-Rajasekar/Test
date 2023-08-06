package newBegining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Reuse {
	
	static WebDriver d;
	public static void browserLaunch(String url) {
		WebDriver d =new ChromeDriver();
		ChromeOptions opt = new ChromeOptions();
		d.get(url);
	}
	public static void maximized() {
		d.manage().window().maximize();
    }
	public static void sendkey(WebElement e, String s) {
		e.sendKeys(s);
	}
	public static void click(WebElement e) {
		e.click();
	}
	public static void quit() {
		d.quit();
	}

	
}
