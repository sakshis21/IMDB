import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestCases {

	//public static void main(String[] args) {
		
		//Chrome
		
		
		WebDriver driver=new ChromeDriver();
		Signup ObjSignup;
		Login ObjLogin;
		Movies ObjMovies;
		
		@BeforeTest
		public void setup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("use-fake-ui-for-media-stream");
		Map<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_setting_values.automatic_downloads", 1);
		options.setExperimentalOption("prefs", chromePrefs);

		//System.setProperty("webdriver.chrome.driver", driverPath);
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get(baseUrl);
		driver.get("https://www.imdb.com/");
		driver.manage().window().maximize();
		}
		
		@Test(priority = 3)
		public void navigate_to_signuppage() {
			ObjSignup = new Signup(driver);
			ObjSignup.clickOnSignup();
		}
		
		@Test(priority = 1)
		public void navigate_to_LoginPage() {
			ObjLogin = new Login(driver);
			ObjLogin.clickOnLogin();
		}
		
		@Test(priority = 2)
		public void navigate_to_Movies() {
			ObjMovies = new Movies(driver);
			ObjMovies.clickOnMovies();
		}
		
		
	
	}


