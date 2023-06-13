package intro001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACUKREG {

	@Test
	public void RequiredFields() {
		// TODO Auto-generated method stub
		//System.out.println("Here's a program");
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://qa.advancecareersuk.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		//Validate Account Registration by filling out only the Required Fields
		//Test data
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-acuk-red font-weight-bold px-3 rounded-0']")).click();
		driver.findElement(By.partialLinkText("Sign")).click();
		String Firstname= "Samuel";
		String Lastname= "Peters";
		String Email= "bayonled.de@gmail.com";
		String confirmEmail= "bayonled.de@gmail.com";
		String Password= "Password@123";
		String confirmPassword= "Password@123";
		String phoneNumber= "7812345679";
		String currentJob= "IT Administrator";
		
		
		driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys(Firstname); //enter firstname
		driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys(Lastname);  //enter lastname
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys(Email);  //enter email
		driver.findElement(By.cssSelector("input[id='comfirmemail']")).sendKeys(confirmEmail);  //enter confirmEmail
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password);  //enter password
		driver.findElement(By.cssSelector("input[id='password_confirmation']")).sendKeys(confirmPassword);  //enter confirmPassword
		driver.findElement(By.cssSelector("button[id='nextBtn']")).click();  //clk next button
		WebElement courseSelection = driver.findElement(By.cssSelector("select[id='course']"));
		Select course = new Select(courseSelection);
		course.selectByIndex(5); // select Manual testing
		driver.findElement(By.cssSelector("select[id='all_start_data']")).click();  //click on date field
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
		System.out.println(driver.findElement(By.xpath("//li[contains(text(),'The telephone has already been taken.')]")).getText());
		System.out.println(driver.findElement(By.xpath("//li[contains(text(),'The target income must be an integer.')]")).getText());
		driver.quit();

	}
	
	@Test
	public void ALLFields() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://qa.advancecareersuk.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		//Validate Account Registration by filling out ALL Fields
		//Test data
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-acuk-red font-weight-bold px-3 rounded-0']")).click();
		driver.findElement(By.partialLinkText("Sign")).click();
		String Firstname= "Samuel";
		String Lastname= "Peters";
		String Email= "bayonled.de@gmail.com";
		String confirmEmail= "bayonled.de@gmail.com";
		String Password= "Password@123";
		String confirmPassword= "Password@123";
		String phoneNumber= "7812345678";
		String currentJob= "IT Administrator";
		
		
		driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys(Firstname); //enter firstname
		driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys(Lastname);  //enter lastname
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys(Email);  //enter email
		driver.findElement(By.cssSelector("input[id='comfirmemail']")).sendKeys(confirmEmail);  //enter confirmEmail
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password);  //enter password
		driver.findElement(By.cssSelector("input[id='password_confirmation']")).sendKeys(confirmPassword);  //enter confirmPassword
		driver.findElement(By.cssSelector("button[id='nextBtn']")).click();  //clk next button
		WebElement courseSelection = driver.findElement(By.cssSelector("select[id='course']"));
		Select course = new Select(courseSelection);
		course.selectByIndex(5); // select Manual testing
		driver.findElement(By.cssSelector("select[id='all_start_data']")).click();  //click on date field
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
		driver.quit();
	}
	
	@Test
	public void AccountRegistrationWithoutFillingTheFirstName() {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://qa.advancecareersuk.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		//Validate Account Registration without filling the First Name
		//Test data
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-acuk-red font-weight-bold px-3 rounded-0']")).click();
		driver.findElement(By.partialLinkText("Sign")).click();
		
		String Lastname= "Peters";
		String Email= "bayonled.de@gmail.com";
		String confirmEmail= "bayonled.de@gmail.com";
		String Password= "Password@123";
		String confirmPassword= "Password@123";
		String phoneNumber= "7812345678";
		String currentJob= "IT Administrator";
		
		driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys(Lastname);  //enter lastname
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys(Email);  //enter email
		driver.findElement(By.cssSelector("input[id='comfirmemail']")).sendKeys(confirmEmail);  //enter confirmEmail
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password);  //enter password
		driver.findElement(By.cssSelector("input[id='password_confirmation']")).sendKeys(confirmPassword);  //enter confirmPassword
		driver.findElement(By.cssSelector("button[id='nextBtn']")).click();  //clk next button
		WebElement courseSelection = driver.findElement(By.cssSelector("select[id='course']"));
		Select course = new Select(courseSelection);
		course.selectByIndex(5); // select Manual testing
		driver.findElement(By.cssSelector("select[id='all_start_data']")).click();  //click on date field
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
		driver.quit();		
	}
	
	@Test
	public void ValidateAccountRegistrationWithoutFillingTheLastName() {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://qa.advancecareersuk.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		//Validate Account Registration without filling the Last Name
		//Test data
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-acuk-red font-weight-bold px-3 rounded-0']")).click();
		driver.findElement(By.partialLinkText("Sign")).click();
		String Firstname= "Samuel";
		
		String Email= "bayonled.de@gmail.com";
		String confirmEmail= "bayonled.de@gmail.com";
		String Password= "Password@123";
		String confirmPassword= "Password@123";
		String phoneNumber= "7812345678";
		String currentJob= "IT Administrator";
		
		
		
		driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys(Firstname); //enter firstname
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys(Email);  //enter email
		driver.findElement(By.cssSelector("input[id='comfirmemail']")).sendKeys(confirmEmail);  //enter confirmEmail
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password);  //enter password
		driver.findElement(By.cssSelector("input[id='password_confirmation']")).sendKeys(confirmPassword);  //enter confirmPassword
		driver.findElement(By.cssSelector("button[id='nextBtn']")).click();  //clk next button
		WebElement courseSelection = driver.findElement(By.cssSelector("select[id='course']"));
		Select course = new Select(courseSelection);
		course.selectByIndex(5); // select Manual testing
		driver.findElement(By.cssSelector("select[id='all_start_data']")).click();  //click on date field
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
		driver.quit();
		
	}
	
	@Test
	public void ValidateAccountRegistrationWithoutFillingTheEmailAddress() {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://qa.advancecareersuk.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		//Validate Account Registration without filling the E-mail Address
				//Test data
				driver.findElement(By.cssSelector("a[class='nav-link btn btn-acuk-red font-weight-bold px-3 rounded-0']")).click();
				driver.findElement(By.partialLinkText("Sign")).click();
				String Firstname= "Samuel";
				String Lastname= "Peters";
				
				String confirmEmail= "bayonled.de@gmail.com";
				String Password= "Password@123";
				String confirmPassword= "Password@123";
				String phoneNumber= "7812345678";
				String currentJob= "IT Administrator";
				
				
				
				driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys(Firstname); //enter firstname
				driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys(Lastname);  //enter lastname
				
				driver.findElement(By.cssSelector("input[id='comfirmemail']")).sendKeys(confirmEmail);  //enter confirmEmail
				driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password);  //enter password
				driver.findElement(By.cssSelector("input[id='password_confirmation']")).sendKeys(confirmPassword);  //enter confirmPassword
				driver.findElement(By.cssSelector("button[id='nextBtn']")).click();  //clk next button
				WebElement courseSelection = driver.findElement(By.cssSelector("select[id='course']"));
				Select course = new Select(courseSelection);
				course.selectByIndex(5); // select Manual testing
				driver.findElement(By.cssSelector("select[id='all_start_data']")).click();  //click on date field
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
				driver.quit();
		
	}

	
	@Test
	public void ValidateAccountRegistrationWithoutFillingTheConfirmEmailAddress() {
		
				WebDriverManager.firefoxdriver().setup();
				FirefoxDriver driver = new FirefoxDriver();
				driver.get("https://qa.advancecareersuk.com");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.manage().window().fullscreen();
				driver.manage().deleteAllCookies();
		
				//Validate Account Registration without filling the Confirm E-mail Address
				//Test data
				driver.findElement(By.cssSelector("a[class='nav-link btn btn-acuk-red font-weight-bold px-3 rounded-0']")).click();
				driver.findElement(By.partialLinkText("Sign")).click();
				String Firstname= "Samuel";
				String Lastname= "Peters";
				String Email= "bayonled.de@gmail.com";
				
				String Password= "Password@123";
				String confirmPassword= "Password@123";
				String phoneNumber= "7812345678";
				String currentJob= "IT Administrator";
				
				
				
				driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys(Firstname); //enter firstname
				driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys(Lastname);  //enter lastname
				driver.findElement(By.cssSelector("input[id='email']")).sendKeys(Email);  //enter email
				
				driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password);  //enter password
				driver.findElement(By.cssSelector("input[id='password_confirmation']")).sendKeys(confirmPassword);  //enter confirmPassword
				driver.findElement(By.cssSelector("button[id='nextBtn']")).click();  //clk next button
				WebElement courseSelection = driver.findElement(By.cssSelector("select[id='course']"));
				Select course = new Select(courseSelection);
				course.selectByIndex(5); // select Manual testing
				driver.findElement(By.cssSelector("select[id='all_start_data']")).click();  //click on date field
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
				driver.quit();
	}
	
	@Test
	public void ValidateAccountRegistrationWithoutFillingThePassword() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://qa.advancecareersuk.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		//Validate Account Registration without filling the Password
				//Test data
				driver.findElement(By.cssSelector("a[class='nav-link btn btn-acuk-red font-weight-bold px-3 rounded-0']")).click();
				driver.findElement(By.partialLinkText("Sign")).click();
				String Firstname= "Samuel";
				String Lastname= "Peters";
				String Email= "bayonled.de@gmail.com";
				String confirmEmail= "bayonled.de@gmail.com";
				
				String confirmPassword= "Password@123";
				String phoneNumber= "7812345678";
				String currentJob= "IT Administrator";
				
				
				
				driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys(Firstname); //enter firstname
				driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys(Lastname);  //enter lastname
				driver.findElement(By.cssSelector("input[id='email']")).sendKeys(Email);  //enter email
				driver.findElement(By.cssSelector("input[id='comfirmemail']")).sendKeys(confirmEmail);  //enter confirmEmail
				
				driver.findElement(By.cssSelector("input[id='password_confirmation']")).sendKeys(confirmPassword);  //enter confirmPassword
				driver.findElement(By.cssSelector("button[id='nextBtn']")).click();  //clk next button
				WebElement courseSelection = driver.findElement(By.cssSelector("select[id='course']"));
				Select course = new Select(courseSelection);
				course.selectByIndex(5); // select Manual testing
				driver.findElement(By.cssSelector("select[id='all_start_data']")).click();  //click on date field
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
				driver.quit();
		
	}
	
	@Test
	public void ValidateAccountRegistrationWithoutFillingTheConfirmPassword() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://qa.advancecareersuk.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		//Validate Account Registration without filling the Confirm Password
				//Test data
				driver.findElement(By.cssSelector("a[class='nav-link btn btn-acuk-red font-weight-bold px-3 rounded-0']")).click();
				driver.findElement(By.partialLinkText("Sign")).click();
				String Firstname= "Samuel";
				String Lastname= "Peters";
				String Email= "bayonled.de@gmail.com";
				String confirmEmail= "bayonled.de@gmail.com";
				String Password= "Password@123";
				
				String phoneNumber= "7812345678";
				String currentJob= "IT Administrator";
				
				
				
				driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys(Firstname); //enter firstname
				driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys(Lastname);  //enter lastname
				driver.findElement(By.cssSelector("input[id='email']")).sendKeys(Email);  //enter email
				driver.findElement(By.cssSelector("input[id='comfirmemail']")).sendKeys(confirmEmail);  //enter confirmEmail
				driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password);  //enter password
				
				driver.findElement(By.cssSelector("button[id='nextBtn']")).click();  //clk next button
				WebElement courseSelection = driver.findElement(By.cssSelector("select[id='course']"));
				Select course = new Select(courseSelection);
				course.selectByIndex(5); // select Manual testing
				driver.findElement(By.cssSelector("select[id='all_start_data']")).click();  //click on date field
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
				driver.close();
		
		
	}
	
	@Test
	public void ValidateAccountRegistrationWithoutCourse() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://qa.advancecareersuk.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
	
		//Validate Account Registration without filling the Course 
				//Test data
				driver.findElement(By.cssSelector("a[class='nav-link btn btn-acuk-red font-weight-bold px-3 rounded-0']")).click();
				driver.findElement(By.partialLinkText("Sign")).click();
				String Firstname= "Samuel";
				String Lastname= "Peters";
				String Email= "bayonled.de@gmail.com";
				String confirmEmail= "bayonled.de@gmail.com";
				String Password= "Password@123";
				String confirmPassword= "Password@123";
				String phoneNumber= "7812345678";
				String currentJob= "IT Administrator";
				
				
				
				driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys(Firstname); //enter firstname
				driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys(Lastname);  //enter lastname
				driver.findElement(By.cssSelector("input[id='email']")).sendKeys(Email);  //enter email
				driver.findElement(By.cssSelector("input[id='comfirmemail']")).sendKeys(confirmEmail);  //enter confirmEmail
				driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password);  //enter password
				driver.findElement(By.cssSelector("input[id='password_confirmation']")).sendKeys(confirmPassword);  //enter confirmPassword
				driver.findElement(By.cssSelector("button[id='nextBtn']")).click();  //clk next button
				
				driver.findElement(By.cssSelector("select[id='all_start_data']")).click();  //click on date field
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
				driver.close();
		
		
	}
	
	@Test
	public void ValidateAccountRegistrationWithoutDate() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://qa.advancecareersuk.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
	
		//Validate Account Registration without date
				//Test data
				driver.findElement(By.cssSelector("a[class='nav-link btn btn-acuk-red font-weight-bold px-3 rounded-0']")).click();
				driver.findElement(By.partialLinkText("Sign")).click();
				String Firstname= "Samuel";
				String Lastname= "Peters";
				String Email= "bayonled.de@gmail.com";
				String confirmEmail= "bayonled.de@gmail.com";
				String Password= "Password@123";
				String confirmPassword= "Password@123";
				String phoneNumber= "7812345678";
				String currentJob= "IT Administrator";
				
				
				
				driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys(Firstname); //enter firstname
				driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys(Lastname);  //enter lastname
				driver.findElement(By.cssSelector("input[id='email']")).sendKeys(Email);  //enter email
				driver.findElement(By.cssSelector("input[id='comfirmemail']")).sendKeys(confirmEmail);  //enter confirmEmail
				driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password);  //enter password
				driver.findElement(By.cssSelector("input[id='password_confirmation']")).sendKeys(confirmPassword);  //enter confirmPassword
				driver.findElement(By.cssSelector("button[id='nextBtn']")).click();  //clk next button
				WebElement courseSelection = driver.findElement(By.cssSelector("select[id='course']"));
				Select course = new Select(courseSelection);
				course.selectByIndex(5); // select Manual testing
				
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
				driver.close();
		
		
	}
	
	@Test
	public void ValidateAccountRegistrationWithoutPhone() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://qa.advancecareersuk.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		//Validate Account Registration without filling the Phone no 
				//Test data
				driver.findElement(By.cssSelector("a[class='nav-link btn btn-acuk-red font-weight-bold px-3 rounded-0']")).click();
				driver.findElement(By.partialLinkText("Sign")).click();
				String Firstname= "Samuel";
				String Lastname= "Peters";
				String Email= "bayonled.de@gmail.com";
				String confirmEmail= "bayonled.de@gmail.com";
				String Password= "Password@123";
				String confirmPassword= "Password@123";
				
				String currentJob= "IT Administrator";
				
				
				
				driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys(Firstname); //enter firstname
				driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys(Lastname);  //enter lastname
				driver.findElement(By.cssSelector("input[id='email']")).sendKeys(Email);  //enter email
				driver.findElement(By.cssSelector("input[id='comfirmemail']")).sendKeys(confirmEmail);  //enter confirmEmail
				driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password);  //enter password
				driver.findElement(By.cssSelector("input[id='password_confirmation']")).sendKeys(confirmPassword);  //enter confirmPassword
				driver.findElement(By.cssSelector("button[id='nextBtn']")).click();  //clk next button
				WebElement courseSelection = driver.findElement(By.cssSelector("select[id='course']"));
				Select course = new Select(courseSelection);
				course.selectByIndex(5); // select Manual testing
				driver.findElement(By.cssSelector("select[id='all_start_data']")).click();  //click on date field
				
				driver.findElement(By.cssSelector("select[id='country']")).click();  //click country field
				driver.findElement(By.cssSelector("option[value='United Kingdom']")).click();  //select UK
				driver.findElement(By.cssSelector("select[id='location']")).click();  //click county field
				driver.findElement(By.cssSelector("option[value='Hounslow']")).click();  //select Hounslow
				driver.findElement(By.cssSelector("input[id='current_job']")).sendKeys(currentJob);  //enter currentJob title
				driver.findElement(By.cssSelector("select[id='target_income']")).click(); //click target income
				driver.findElement(By.xpath("//*[@id=\"target_income\"]/option[5]")).click();  //select option 4
				driver.findElement(By.cssSelector("input[id='privacy']")).click();  // tick privacy box
				driver.findElement(By.cssSelector("button[type='submit']")).click();  //click submit button
				driver.close();
		
	}
	
	@Test
	public void ValidateAccountRegistrationWithoutCountry() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://qa.advancecareersuk.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		//Validate Account Registration without filling the Country of Residence
				//Test data
				driver.findElement(By.cssSelector("a[class='nav-link btn btn-acuk-red font-weight-bold px-3 rounded-0']")).click();
				driver.findElement(By.partialLinkText("Sign")).click();
				String Firstname= "Samuel";
				String Lastname= "Peters";
				String Email= "bayonled.de@gmail.com";
				String confirmEmail= "bayonled.de@gmail.com";
				String Password= "Password@123";
				String confirmPassword= "Password@123";
				String phoneNumber= "7812345678";
				String currentJob= "IT Administrator";
				
				
				
				driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys(Firstname); //enter firstname
				driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys(Lastname);  //enter lastname
				driver.findElement(By.cssSelector("input[id='email']")).sendKeys(Email);  //enter email
				driver.findElement(By.cssSelector("input[id='comfirmemail']")).sendKeys(confirmEmail);  //enter confirmEmail
				driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password);  //enter password
				driver.findElement(By.cssSelector("input[id='password_confirmation']")).sendKeys(confirmPassword);  //enter confirmPassword
				driver.findElement(By.cssSelector("button[id='nextBtn']")).click();  //clk next button
				WebElement courseSelection = driver.findElement(By.cssSelector("select[id='course']"));
				Select course = new Select(courseSelection);
				course.selectByIndex(5); // select Manual testing
				driver.findElement(By.cssSelector("select[id='all_start_data']")).click();  //click on date field
				driver.findElement(By.cssSelector("div[class='iti__selected-dial-code']")).click();  //click country code
				driver.findElement(By.xpath("//*[@id=\"iti-0__item-gb\"]/span[1]")).click();  //select UK
				driver.findElement(By.cssSelector("input[id='phone']")).sendKeys(phoneNumber);  //enter phoneNumber
				
				driver.findElement(By.cssSelector("select[id='location']")).click();  //click county field
				driver.findElement(By.cssSelector("option[value='Hounslow']")).click();  //select Hounslow
				driver.findElement(By.cssSelector("input[id='current_job']")).sendKeys(currentJob);  //enter currentJob title
				driver.findElement(By.cssSelector("select[id='target_income']")).click(); //click target income
				driver.findElement(By.xpath("//*[@id=\"target_income\"]/option[5]")).click();  //select option 4
				driver.findElement(By.cssSelector("input[id='privacy']")).click();  // tick privacy box
				driver.findElement(By.cssSelector("button[type='submit']")).click();  //click submit button
				driver.close();
		
	}
	
	@Test
	public void ValidateAccountRegistrationWithoutState() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://qa.advancecareersuk.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		//Validate Account Registration without filling the State
				//Test data
				driver.findElement(By.cssSelector("a[class='nav-link btn btn-acuk-red font-weight-bold px-3 rounded-0']")).click();
				driver.findElement(By.partialLinkText("Sign")).click();
				String Firstname= "Samuel";
				String Lastname= "Peters";
				String Email= "bayonled.de@gmail.com";
				String confirmEmail= "bayonled.de@gmail.com";
				String Password= "Password@123";
				String confirmPassword= "Password@123";
				String phoneNumber= "7812345678";
				String currentJob= "IT Administrator";
				
				
				
				driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys(Firstname); //enter firstname
				driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys(Lastname);  //enter lastname
				driver.findElement(By.cssSelector("input[id='email']")).sendKeys(Email);  //enter email
				driver.findElement(By.cssSelector("input[id='comfirmemail']")).sendKeys(confirmEmail);  //enter confirmEmail
				driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password);  //enter password
				driver.findElement(By.cssSelector("input[id='password_confirmation']")).sendKeys(confirmPassword);  //enter confirmPassword
				driver.findElement(By.cssSelector("button[id='nextBtn']")).click();  //clk next button
				WebElement courseSelection = driver.findElement(By.cssSelector("select[id='course']"));
				Select course = new Select(courseSelection);
				course.selectByIndex(5); // select Manual testing
				driver.findElement(By.cssSelector("select[id='all_start_data']")).click();  //click on date field
				driver.findElement(By.cssSelector("div[class='iti__selected-dial-code']")).click();  //click country code
				driver.findElement(By.xpath("//*[@id=\"iti-0__item-gb\"]/span[1]")).click();  //select UK
				driver.findElement(By.cssSelector("input[id='phone']")).sendKeys(phoneNumber);  //enter phoneNumber
				driver.findElement(By.cssSelector("select[id='country']")).click();  //click country field
				driver.findElement(By.cssSelector("option[value='United Kingdom']")).click();  //select UK
				
				driver.findElement(By.cssSelector("input[id='current_job']")).sendKeys(currentJob);  //enter currentJob title
				driver.findElement(By.cssSelector("select[id='target_income']")).click(); //click target income
				driver.findElement(By.xpath("//*[@id=\"target_income\"]/option[5]")).click();  //select option 4
				driver.findElement(By.cssSelector("input[id='privacy']")).click();  // tick privacy box
				driver.findElement(By.cssSelector("button[type='submit']")).click();  //click submit button
				driver.close();
		
	}
	
}
