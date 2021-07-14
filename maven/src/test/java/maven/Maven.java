package maven;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Maven {
	@Test

		public void jenkins() {
		
		System.setProperty("webdriver.chrome.driver","E:\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("HI, This is jenkins demo test case");
		
		driver.navigate().to("https://www.facebook.com/");
		  driver.findElement(By.name("email")).sendKeys("rahulyerme67@gmail.com");
		  
		  driver.findElement(By.name("pass")).sendKeys("Rahul@2897");
		  driver.findElement(By.name("login")).click();
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  driver.navigate().back();
		  driver.close();

}
}