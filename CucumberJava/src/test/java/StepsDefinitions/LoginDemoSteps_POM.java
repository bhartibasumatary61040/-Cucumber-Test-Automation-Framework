//package StepsDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//import junit.framework.Assert;
//import pages.LoginPage;
//
//public class LoginDemoSteps_POM {
//	WebDriver driver = null;
//	LoginPage login;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("==== I am inside LoginDemoSteps_POM===");
//		
//	     System.out.println("Inside Step-browser is open");
//	     
//	     String projectPath =  System.getProperty("user.dir");
//	     
//	     System.out.println("Project path is :"+projectPath);
//	     
//	     System.setProperty("WebDriver.chrome.driver","projectPath+/src/test/resources/drivers/chromedriver.exe");
//	   
//	  
//	     
//	     driver= new ChromeDriver();
//	     
//     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	     driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//     
//	     driver.manage().window().maximize();
//		
//	    
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		
//		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
//	   
//	}
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException  {
//		
//		login = new LoginPage(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		
////	   
////		driver.findElement(By.id("username")).sendKeys(username);
////		driver.findElement(By.id("password")).sendKeys(password);
//		
//		Thread.sleep(2000);
//		
//}
//	@And("user is on login")
//	public void user_is_on_login() {
//		
//		login.clickLogin();
//		//driver.findElement(By.id("submit")).click();
//		
//	    
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws InterruptedException {
//		
//		login.checkLogOutsIsDisplayed();
//		
//		//driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed();
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//		
//	}
//	
//	
//		
//		
//	    
//	}
//
//
//
