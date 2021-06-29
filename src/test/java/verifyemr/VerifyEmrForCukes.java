package verifyemr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class VerifyEmrForCukes {

	
WebDriver driver;
	
@Given("Open EMR website")
public void open_emr_website() {	
		driver=new FirefoxDriver();
		driver.get("https://demo.openemr.io/a/openemr");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);

	    
	}
	
	

@Given("update username as {string}")
public void update_username_as(String string) {
		driver.findElement(By.id("authUser")).sendKeys(string);
	}
	

@Given("update password as {string}")
public void update_password_as(String string) {
		driver.findElement(By.id("clearPass")).sendKeys(string);

	}

@Given("click on login")
public void click_on_login() {
		driver.findElement(By.xpath("/html/body/form/div[1]/div[1]/div[4]/button")).click();
	}
@Given("navigate on to patient\\/client")
public void navigate_on_to_patient_client() {	
	driver.findElement(By.xpath("/html/body/div/nav/div/div/div[5]/div/div")).click();

	   	}
	
	@When("click on New\\/Search")
	public void click_on_new_search() {
		driver.findElement(By.xpath("/html/body/div/nav/div/div/div[5]/div/ul/li[2]/div")).click();
	   	}
	
	@Given("add the first name")
	public void add_the_first_name() {
		driver.switchTo().frame(driver.findElement((By.name("pat"))));
		Select tname=new Select(driver.findElement(By.xpath("//*[@id=\"form_title\"]")));
		tname.selectByValue("Mrs.");
		driver.findElement((By.name("form_fname"))).sendKeys("Laks");
		
	   	}

@Given("add last name")
public void add_last_name() throws InterruptedException {
		Thread.sleep(200);
		driver.findElement(By.name("form_lname")).sendKeys("NR");
	}
	

@Given("Update DOB as todays date \\(According to IST)")
public void update_dob_as_todays_date_according_to_ist() {
		driver.findElement((By.name("form_DOB"))).sendKeys("2021-06-26");

	   	}
	

@Given("Update the Gender")
public void update_the_gender() {
		Select st=new Select(driver.findElement((By.id("form_sex"))));
		st.selectByValue("Female");

	   	}
	

@Given("click on the create new patient button")
public void click_on_the_create_new_patient_button() {
		driver.findElement(By.xpath("//*[@id=\"create\"]")).click();
		driver.switchTo().defaultContent();

	   	}
@Given("click on confirm create new patient button")
public void click_on_confirm_create_new_patient_button() throws InterruptedException {

		driver.switchTo().frame(driver.findElement(By.id("modalframe")));
		Thread.sleep(300);
		driver.findElement(By.xpath("/html/body/div[2]/center/input")).click();
		driver.switchTo().defaultContent();
	    
	}
	

@Given("validate the alert message")
public void validate_the_alert_message() throws InterruptedException {
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		alert.accept();

	    	}
	
	

@Given("Click on Billy Smith from Menu bar at the right corner for logout")
public void click_on_billy_smith_from_menu_bar_at_the_right_corner_for_logout() {

		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("/html/body/div/nav/span/div/div/span[1]"))).perform();

driver.findElement(By.xpath("/html/body/div/nav/span/div/div/ul/li[4]")).click();

	}
	
@Then("should display message as {string}")
public void should_display_message_as(String string) {
		//System.out.println("Test passed");

	    
	}



}
