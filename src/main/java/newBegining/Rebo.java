package newBegining;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Rebo {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MARSIO RENO\\eclipse-workspace-new\\newBegining\\src\\test\\chromedriver.exe"); 
		ChromeOptions co = new ChromeOptions();
		co.addArguments("window-size=700,650");
		WebDriver f = new ChromeDriver(co);
		
		f.navigate().to("https://www.facebook.com/");
		//String ss ="https://www.facebook.com/";
		String url = f.getCurrentUrl();
		System.out.println(url);
		
		File ff = new File("G:\\RENO\\Gokul\\Reno3.xlsx");
	    FileOutputStream f1 = new FileOutputStream(ff);
		Workbook f2 = new XSSFWorkbook();
		Sheet s = f2.createSheet("Sheet2"); 
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("https://www.facebook.com/");
		f2.write(f1);
		f1.close();
		
		File fl = new File("G:\\RENO\\Gokul\\Reno3.xlsx");
	    FileOutputStream f3 = new FileOutputStream(ff);
		Workbook f4 = new XSSFWorkbook();
		Sheet ss = f4.getSheet("Sheet2"); 
		Row rr = s.getRow(0);
		Cell cc = r.getCell(0);
		
		String sv = cc.getStringCellValue();
		
		if (url.equals(sv)) {
			System.out.println("Equal");
			
		}else {
			System.out.println("Not Equal");
		}
		
		
		
		
		//c.setCellValue("https://www.facebook.com/");
		//f2.write(f1);
		//f1.close();
		
		
		
		
		//System.out.println(ss==url);
	
		
		
		/*List<WebElement> price = d.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	       for (int j = i; j ==i; j++) {
			WebElement p = price.get(j);
			String mp = p.getText();
			Map<String,String> ma = new HashMap<>();
			ma.put(mn, mp);
			Set<Entry<String, String>> entrySet = ma.entrySet();
			for(Entry<String, String> entry : entrySet) {
			System.out.println(entry);
			}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*f.switchTo().newWindow(WindowType.TAB);
		f.close();
		Thread.sleep(3000);
		f.quit();

		
		
		/*f.get("https://www.facebook.com/");
		f.manage().window().maximize();
		Thread.sleep(3000); //interrupted exception
		String url = f.getCurrentUrl();
		System.out.println(url);
		String title = f.getTitle();
		System.out.println(title);
		f.navigate().back();
		Thread.sleep(3000);
		f.navigate().forward();
		Thread.sleep(3000);
		f.manage().window().minimize();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
