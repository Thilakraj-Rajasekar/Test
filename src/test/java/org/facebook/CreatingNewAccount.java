package org.facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingNewAccount {

	public static WebDriver driver;
	
	@Given("user launches the browser {string}")
	public void user_launches_the_browser(String url) {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get(url);
	   driver.manage().window().maximize();
	}

	@When("user clicks on create new account")
	public void user_clicks_on_create_new_account() {
	   WebElement create = driver.findElement(By.xpath("//a[text()='Create new account']"));
	   create.click();
	}
	
	@When("user enters firstname {string}")
	public void user_enters_firstname(String firstname) throws InterruptedException {
		Thread.sleep(3000);
	    driver.findElement(By.name("firstname")).sendKeys(firstname);
	}

	@When("user enters lastname {string}")
	public void user_enters_lastname(String lastname) throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.name("lastname")).sendKeys(lastname);
	}

	@When("user enters email {string}")
	public void user_enters_email(String email) throws InterruptedException {
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys(email);
	}

	@When("user re-enters email {string}")
	public void user_re_enters_email(String reenter) throws InterruptedException {
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys(reenter);
	}
	
	@When("user enters password {string}")
	public void user_enters_password(String password) throws InterruptedException {
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys(password);
	}

	@When("user selects dob")
	public void user_selects_dob() {
	    WebElement day = driver.findElement(By.id("day"));
	    Select s = new Select(day);
	    s.selectByValue("7");
	    
	    WebElement month = driver.findElement(By.id("month"));
	    Select s1 = new Select(month);
	    s1.selectByVisibleText("Dec");
	    
	    WebElement year = driver.findElement(By.id("year"));
	    Select s2 = new Select(year);
	    s2.selectByValue("2021");
	}

	@When("user selects gender")
	public void user_selects_gender() {
	    driver.findElement(By.xpath("//input[@value='2']")).click();
	}

	@When("user clicks sign up")
	public void user_clicks_sign_up() throws InterruptedException {
	    driver.findElement(By.name("websubmit")).click();
	}

	@Then("quit")
	public void quit() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
