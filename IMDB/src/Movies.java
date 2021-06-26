import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Movies {
	
	WebDriver driver;
	//Click on Movies Menu
	By Movies=(By.xpath("//*[@id=\"imdbHeader-navDrawerOpen--desktop\"]/div"));
	
	public Movies(WebDriver driver) {
		this.driver=driver;
		}


		public void clickOnMovies() {
		driver.findElement(Movies).click();
		//Click on Top Rated Movies
		driver.findElement(By.xpath("//*[@id=\"imdbHeader\"]/div[2]/aside/div/div[2]/div/div[1]/span/div/div/ul/a[3]")).click();
		
		//Sort Movie
		Select sortMovie = new Select (driver.findElement(By.name("sort")));
		sortMovie.selectByValue("us:descending");
		//Click on last movie
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/span/div/div/div[3]/table/tbody/tr[250]/td[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[1]/div[1]/div[2]/ul/li[1]/a")).click();
		
		
		
		
		WebElement mytable = driver.findElement(By.xpath("//*[@id=\"releaseinfo_content\"]/table[1]/tbody"));
    	//To locate rows of table. 
    	List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
    	//To calculate no of rows In table.
    	int rows_count = rows_table.size();
    	//Loop will execute till the last row of table.
    	for (int row = 0; row < rows_count; row++) {
    	    //To locate columns(cells) of that specific row.
    	    List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
    	    //To calculate no of columns (cells). In that specific row.
    	    int columns_count = Columns_row.size();
    	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
    	    //Loop will execute till the last cell of that specific row.
    	    for (int column = 0; column < columns_count; column++) {
    	        // To retrieve text from that specific cell.
    	        String celtext = Columns_row.get(column).getText();
    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
    	    }
    	    System.out.println("-------------------------------------------------- ");
		
		}

		}}
