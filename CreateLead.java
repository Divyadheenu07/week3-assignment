package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("nissan");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("divya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("divya");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("abcd");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("8,00,000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("6");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("017");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("AKD");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("test engineer");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("fresher");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("735");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7358523279");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("00");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("dheenu");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("divyadheenu1627@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://divyadheenu.com/");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("divya");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("dheenu");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("9/105");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("periyar street");
		driver.findElement(By.name("generalCity")).sendKeys("singaperumalkovil");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("603204");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("6");
		//driver.findElement(By.className("smallSubmit")).click();
		
	}

}
