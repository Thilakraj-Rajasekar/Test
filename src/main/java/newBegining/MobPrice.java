package newBegining;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobPrice {

	public static void main(String[] args) throws InterruptedException, IOException {
		String mp = "";
		String prc = "";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MARSIO RENO\\eclipse-workspace-new\\newBegining\\src\\test\\chromedriver.exe");
		WebDriver g = new ChromeDriver();

		g.get("https://www.amazon.in/");
		Thread.sleep(2000);

		WebElement sr = g.findElement(By.xpath("//input[@type='text']"));
		sr.sendKeys("iphone");

		WebElement bt = g.findElement(By.xpath("//input[@type='submit']"));
		bt.click();

		List<WebElement> mob = g
				.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
		for (int i = 0; i < mob.size()-8; i++) {
			WebElement m = mob.get(i);
			mp = m.getText();
			List<WebElement> p = g.findElements(By.xpath("//span[@class='a-price-whole']"));
			for (int j = i; j == i; j++) {
				WebElement pr = p.get(j);
				prc = pr.getText();
				Map<String, String> map = new HashMap<>();
				map.put(mp, prc);
				Set<Entry<String, String>> es = map.entrySet();
				for (Entry<String, String> en : es) {
					System.out.println(en);
					
					String key = en.getKey();
					String value = en.getValue();
					
					
					File f = new File("G:\\RENO\\Gokul\\Reno3.xlsx");
				    FileOutputStream f1 = new FileOutputStream(f);
					Workbook f2 = new XSSFWorkbook();
					Sheet s = f2.createSheet("Sheet2"); 
					Row r = s.createRow(0);
					Cell c = r.createCell(0);
					Cell c1 = r.createCell(1);
					
					c.setCellValue("Mobile Name");
					c1.setCellValue("Mobile Price");
					
					Row cr = s.createRow(1);
					Cell cc = cr.createCell(0);
					cc.setCellValue(key);
					
					Cell cl = cr.createCell(1);
					cl.setCellValue(value);
					
					
					
					
					f2.write(f1);
					}
					
			}

		}
		
		
		
		/*File f = new File("G:\\RENO\\Gokul\\Reno3.xlsx");
	    FileOutputStream f1 = new FileOutputStream(f);
		Workbook f2 = new XSSFWorkbook();
		Sheet s = f2.createSheet("Sheet2"); 
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		Cell c1 = r.createCell(1);
		
		c.setCellValue("Mobile Name");
		c1.setCellValue("Mobile Price");
		
		
		
		f2.write(f1);*/
		
		/*File f = new File("G:\\RENO\\Gokul\\Reno3.xlsx");
	    FileOutputStream f1 = new FileOutputStream(f);
		Workbook f2 = new XSSFWorkbook();
		Sheet s = f2.createSheet("Sheet2"); 
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("reno");
		f2.write(f1);*/
	}
}
/*
 * List<WebElement> mob = g.findElements(By.
 * xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"
 * )); List<WebElement> pr =
 * g.findElements(By.xpath("//span[@class='a-price-whole']"));
 * 
 * 
 * for (int i = 0; i <mob.size()-6; i++) {
 * System.out.println(mob.get(i).getText()+"="+pr.get(i).getText());
 * 
 * }
 * 
 * 
 * /*Map<String , String> map = new HashMap<>(); map.put(s, s1);
 * Set<Entry<String, String>> es = map.entrySet(); for (Entry<String, String> en
 * : es) { System.out.println(en);
 * 
 * }
 */
