import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signup {


		
		WebDriver driver;
		By Signup=(By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[5]/a/div"));
		
		public Signup(WebDriver driver) {
			this.driver=driver;
			}

			public void clickOnSignup() {
			driver.findElement(Signup).click();
			
		
		WebElement NewUser = driver.findElement(By.xpath("//*[@id=\"signin-options\"]/div/div[2]/a"));
		NewUser.click();
		
		WebElement UserName = driver.findElement(By.id("ap_customer_name"));
		UserName.sendKeys("Sakshi");
		
		driver.findElement(By.id("ap_email")).sendKeys("Sakshi@gmail.com");
		
		driver.findElement(By.id("ap_password")).sendKeys("00000000");
		driver.findElement(By.id("ap_password_check")).sendKeys("00000000");
		driver.findElement(By.id("continue")).click();

	}

}

