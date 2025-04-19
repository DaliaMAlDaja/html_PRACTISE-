package eng_lec16_4.eng_lec16_4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest extends test_Date_this_is_for_reading {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
public void MySetUp() {
		driver.manage().window().maximize();
	driver.get("http://127.0.0.1:5500/index.html#media");	
	
	}
	
//	@Test
//        public void ScrollTest() throws InterruptedException {
//		
//JavascriptExecutor js= (JavascriptExecutor) 	driver;
//js.executeScript("window.scrollTo(0,1800)"); // scroll down
//Thread.sleep(1000);
//js.executeScript("window.scrollTo(1800,0)");  // scroll up		
//	}
//
//	
//	
//	@Test
//	public void Filling_the_input_field() {
//		WebElement Test_input_field =driver.findElement(By.id("text"));
//		WebElement Email_input_field =driver.findElement(By.id("password"));
//		WebElement Password_input_field =driver.findElement(By.id("email"));
//		WebElement Number_input_field =driver.findElement(By.id("number"));
//		WebElement Date_input_field = driver.findElement(By.id("date"));
//		
//		
//		Test_input_field.sendKeys(Random_text_input);
//		Email_input_field.sendKeys(Random_Email);
//		Password_input_field.sendKeys(Random_Password);
//		Number_input_field.sendKeys(Random_Number);
//		Date_input_field.sendKeys(Random_Date);
//	}
//}
	
	@Test(enabled = false)
	public void ScrollTest() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,1800)");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(1800,0)");

	}
	
	
	@Test
	public void FillingtheInputFields() {
		
		// ----- WebElements 
		
		WebElement TextInputField = driver.findElement(By.id("text"));
		WebElement EmailInputField = driver.findElement(By.id("email"));
		WebElement DateInputField =driver.findElement(By.id("date")); 
		WebElement PassWordInputField = driver.findElement(By.id("password"));
		WebElement NumberInputField = driver.findElement(By.id("number"));
		WebElement FileUploadButton = driver.findElement(By.id("file"));

		
		
		// ---- actions 
		
		//WebElement GenderRadioButton = driver.findElement(By.xpath("//input[@value='"+RandomGender+"']"));
		List<WebElement> Genders = driver.findElements(By.name("gender"));
		List<WebElement> Hoppies = driver.findElements(By.name("hobby")); 
		TextInputField.sendKeys(RandomText);
		EmailInputField.sendKeys(RandomEmail);
		PassWordInputField.sendKeys(RandomPassword);
		NumberInputField.sendKeys(RandomNumber);
		DateInputField.sendKeys(RandomDate);
		//GenderRadioButton.click();
		Genders.get(RandomGender).click();

		// this is if you want to get only one value 
		//Hoppies.get(RandomHoppy).click();
		
		// if you want to get all values 
		
		for(int i = 0 ; i < Hoppies.size();i++) {
			Hoppies.get(i).click();
		}
		
		FileUploadButton.sendKeys(FilePath);
		

	}
	
}

	