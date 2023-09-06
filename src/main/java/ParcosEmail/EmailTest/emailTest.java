package ParcosEmail.EmailTest;


import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.sql.DataSource;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class emailTest {
	
	
	@Test(priority=0)
	public void TestEmail() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uat.parcos.com/");
		driver.findElement(By.xpath("//header/div[1]/ul[2]/li[2]/a[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Mobile Number*')]")).click();
		driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("9960130048");
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='otp1']")).sendKeys("746587");
		driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[2]/div[2]/form[1]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//header/div[1]/ul[2]/li[1]/button[1]/i[1]")).click();
		Thread.sleep(10000);
		WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		Actions actionsearch=new Actions(driver);
	actionsearch.moveToElement(search);
	actionsearch.click(search).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Diego Dalla Palma Milano Mytoyboy Mascara Mascara Extra Volume");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Makeup')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Diego dalla Palma Milano Mytoyboy Mascara Mascara ')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@class='addToCart']")).click();
	    Thread.sleep(10000);
		WebElement carticon=driver.findElement(By.xpath("//header/div[1]/ul[2]/li[4]/a[1]/i[1]"));
		Actions actioncarticon=new Actions(driver);
		actioncarticon.moveToElement(carticon);
		actioncarticon.click(carticon).build().perform();
		Thread.sleep(15000);
		WebElement checkout=driver.findElement(By.xpath("//a[contains(text(),'Checkout')]"));
		Actions Actioncheckout1=new Actions(driver);
		Actioncheckout1.moveToElement(checkout);
		Actioncheckout1.click(checkout).build().perform();
		Thread.sleep(10000);
	    WebElement checkship=driver.findElement(By.xpath("//span[contains(text(),'Checkout')]"));
		Actions checkoutShipping=new Actions(driver);
		checkoutShipping.moveToElement(checkship);
		checkoutShipping.click(checkship).build().perform();
		Thread.sleep(10000);
		WebElement placeorder=driver.findElement(By.xpath("//span[contains(text(),'Place Order')]"));
		Actions actionplace=new Actions(driver);
		actionplace.moveToElement(placeorder);
		actionplace.click(placeorder).build().perform();
		Thread.sleep(5000);
	}
	    @Test(priority=1)
		public void EmailData() throws InterruptedException, IOException
		{
			System.setProperty("webdriver.chrome.driver","D:\\Automation_Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@aria-label='Gmail (opens a new tab)']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
			driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ajinkyam658@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	
			Thread.sleep(5000);
		    driver.findElement(By.xpath(".//input[@type='password']")).sendKeys("Ajinkya@123");

			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			Thread.sleep(7000);
			
			WebElement updates=driver.findElement(By.xpath("//div[@id=':1q']"));
			Actions actionupdate=new Actions(driver);
			actionupdate.moveToElement(updates);
			actionupdate.click(updates).build().perform();
			Thread.sleep(5000);
			WebElement clickemail=driver.findElement(By.xpath("//tr[@id=':41']"));
			Actions sale=new Actions(driver);
			sale.moveToElement(clickemail);
			sale.click(clickemail).build().perform();
			
			TakesScreenshot scrshot=((TakesScreenshot)driver);
			File scrfile=scrshot.getScreenshotAs(OutputType.FILE);
			File DestFile=new File("C:\\Users\\Ajinkya More\\eclipse-workspace\\EmailTest\\src\\test\\Screenshot\\Email.png");
			FileUtils.copyFile(scrfile, DestFile);
			
			
			
			
			
		}
	    
	   

	    }
		
		
		
	


