package intro001;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test01 {

	/*@Test
	public void AllFields() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://qa.advancecareersuk.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Validate Account Registration by filling out ALL Fields
				//Test data
				driver.findElement(By.cssSelector("a[class='nav-link btn btn-acuk-red font-weight-bold px-3 rounded-0']")).click();
				driver.findElement(By.partialLinkText("Sign")).click();
				var Firstname= "Dele";
				var Lastname= "Seun";
				var Email= "bayonle.dauda05@gmail.com";
				var confirmEmail= "bayonle.dauda05@gmail.com";
				var Password= "Password@123";
				var confirmPassword= "Password@123";
				var phoneNumber= "7811123456";
				var currentJob= "IT Administrator";
				
				
				driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys(Firstname); //enter firstname
				driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys(Lastname);  //enter lastname
				driver.findElement(By.cssSelector("input[id='email']")).sendKeys(Email);  //enter email
				driver.findElement(By.cssSelector("input[id='comfirmemail']")).sendKeys(confirmEmail);  //enter confirmEmail
				driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password);  //enter password
				driver.findElement(By.cssSelector("input[id='password_confirmation']")).sendKeys(confirmPassword);  //enter confirmPassword
				driver.findElement(By.cssSelector("button[id='nextBtn']")).click();  //clk next button
				driver.findElement(By.cssSelector("select[id='course']")).click();  //clicl coursefield
				driver.findElement(By.cssSelector("option[value='7']")).click(); //select Manual testing
				driver.findElement(By.cssSelector("select[id='all_start_data']")).click();  //click on date field
				driver.findElement(By.xpath("//option[contains(text(),'2023-05-23 Manual Testing')]")).click();
				driver.findElement(By.cssSelector("div[class='iti__selected-dial-code']")).click();  //click country code
				driver.findElement(By.xpath("//*[@id=\"iti-0__item-gb\"]/span[1]")).click();  //select UK
				driver.findElement(By.cssSelector("input[id='phone']")).sendKeys(phoneNumber);  //enter phoneNumber
				driver.findElement(By.cssSelector("select[id='country']")).click();  //click country field
				driver.findElement(By.cssSelector("option[value='United Kingdom']")).click();  //select UK
				driver.findElement(By.cssSelector("select[id='location']")).click();  //click county field
				driver.findElement(By.cssSelector("option[value='Hounslow']")).click();  //select Hounslow
				driver.findElement(By.cssSelector("input[id='current_job']")).sendKeys(currentJob);  //enter currentJob title
				driver.findElement(By.cssSelector("select[id='target_income']")).click(); //click target income
				driver.findElement(By.xpath("//*[@id=\"target_income\"]/option[5]")).click();  //select option 4
				driver.findElement(By.cssSelector("input[id='privacy']")).click();  // tick privacy box
				driver.findElement(By.cssSelector("button[type='submit']")).click();  //click submit button
				Thread.sleep(2000);
				driver.quit();
	}*/
	
	@Test
	public void AccelerateInternship() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver  = new FirefoxDriver();
		driver.get("https://qa.advancecareersuk.com/payment-page#");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.findElement(By.cssSelector("button[class='payment-method oneOffbtn payment-method-active']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/a")).click();
		
		var eMail = "bayonle.dauda05@gmail.com";
		var passWord = "password123";
				
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(eMail);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passWord);
		driver.findElement(By.tagName("button")).click();
		
		
		var cardName = "dele seun";
		var cardNumber = "4242424242424242";
		var cardCVC = "123";
		var expMonth = "12";
		var expYear = "2024";
		
		driver.findElement(By.cssSelector("input[id='card-name']")).sendKeys(cardName);
		driver.findElement(By.cssSelector("input[id='card-number']")).sendKeys(cardNumber);
		driver.findElement(By.cssSelector("input[id='card-cvc']")).sendKeys(cardCVC);
		driver.findElement(By.cssSelector("input[id='card-expiry-month']")).sendKeys(expMonth);
		driver.findElement(By.cssSelector("input[id='card-expiry-year']")).sendKeys(expYear);
		driver.findElement(By.cssSelector("button[style='width:100%;']")).click();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.close();
		
	}
}
