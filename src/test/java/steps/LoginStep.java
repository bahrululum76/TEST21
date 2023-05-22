package steps;

import java.io.File;
import java.io.InputStream;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.WebElement;

//import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginStep {
	
	ChromeOptions opt=new ChromeOptions();

	WebDriver driver=null;
	

	
	@Given ("user navigates to login pageG")
	public void user_navigate_to_url_login ( ){
		// Membaca file WebDriver dari classpath
     
		@SuppressWarnings("unused")
		InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream("chromedriver.exe");

        // Mengkonversi InputStream ke File
        File driverFile = new File("src/test/resources/driver/chromedriver.exe");
		
	    opt.addArguments("--remote-allow-origins=*");
	    
	    System.setProperty("webdriver.chrome.driver", driverFile.getAbsolutePath());
//	    System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");
	    driver = new ChromeDriver(opt);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

		driver.navigate().to("http://google.com");	
		driver.findElement(By.name("q")).sendKeys("HJGHJHJJ");


	}
}
	