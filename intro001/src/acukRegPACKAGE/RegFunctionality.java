package acukRegPACKAGE;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegFunctionality {

	@Test
	public void allFields() {

		// Validate Account Registration by filling out ALL Fields
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://qa.advancecareersuk.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();

		// Variable declarations / Test data
		String Firstname = "Samuel";
		String Lastname = "Peters";
		String Email = "bayonled.de@gmail.com";
		String confirmEmail = "bayonled.de@gmail.com";
		String Password = "Password@123";
		String confirmPassword = "Password@123";
		String phoneNumber = "7812345678";
		String currentJob = "IT Administrator";

		driver.findElement(By.cssSelector(".nav-link.btn.btn-acuk-red.font-weight-bold.px-3.rounded-0")).click();
		driver.findElement(By.partialLinkText("Sign")).click();
		driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys(Firstname); // enter firstname
		driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys(Lastname); // enter lastname
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys(Email); // enter email
		driver.findElement(By.cssSelector("input[id='comfirmemail']")).sendKeys(confirmEmail); // enter confirmEmail
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password); // enter password
		driver.findElement(By.cssSelector("input[id='password_confirmation']")).sendKeys(confirmPassword); // enter confirmPassword
		driver.findElement(By.cssSelector("button[id='nextBtn']")).click(); // clk next button

		WebElement courseSelection = driver.findElement(By.cssSelector("select[id='course']"));
		Select course = new Select(courseSelection);
		course.selectByIndex(5); // select Manual testing

		WebElement date = driver.findElement(By.cssSelector("select[id='all_start_data']"));
		date.click();
		/*
		 * Select startDate = new Select(date);
		 * 
		 * startDate.selectByIndex(1); //select date
		 */
		driver.findElement(By.cssSelector("div[class='iti__selected-dial-code']")).click(); // click country code
		driver.findElement(By.xpath("//*[@id=\"iti-0__item-gb\"]/span[1]")).click(); // select UK
		driver.findElement(By.cssSelector("#phone")).sendKeys(phoneNumber); // enter phoneNumber

		WebElement countryDropdown = driver.findElement(By.cssSelector("#country"));
		Select country = new Select(countryDropdown);
		country.selectByValue("United Kingdom"); // click country field

		WebElement stateDropdown = driver.findElement(By.cssSelector("#location"));
		Select state = new Select(stateDropdown);
		state.selectByValue("Hounslow"); // select Hounslow

		driver.findElement(By.cssSelector("input[id='current_job']")).sendKeys(currentJob); // enter currentJob title

		WebElement incomeDropdown = driver.findElement(By.cssSelector("select[id='target_income']"));
		Select income = new Select(incomeDropdown);
		income.selectByIndex(4); // click target income

		driver.findElement(By.cssSelector("input[id='privacy']")).click(); // tick privacy box
		driver.findElement(By.cssSelector("button[type='submit']")).click(); // click submit button
		driver.quit();
	}

}
