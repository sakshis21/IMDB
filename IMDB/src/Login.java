import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	//Click on SignIN
	By Login=(By.xpath("By.xpath(\"//*[@id=\\\"imdbHeader\\\"]/div[2]/div[5]/a/div"));
	
	public Login(WebDriver driver) {
		this.driver=driver;
		}


		public void clickOnLogin() {
		driver.findElement(Login).click();
		//SignIN with IMDB
		driver.findElement(By.xpath("//*[@id=\\\"signin-options\\\"]/div/div[1]/a[1]/span[2]")).click();
		//Enter Email
		driver.findElement(By.name("email")).sendKeys("sakshisinghal.214@gmail.com");
		//Enter Password
		driver.findElement(By.name("password")).sendKeys("00000000");
		//Click on Submit
		driver.findElement(By.id("signInSubmit")).click();

	}


		

}
