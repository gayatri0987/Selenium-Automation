package selenium.project;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class commercial
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.nobroker.in/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	//div[@class="nb__17yFj"]
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[3]/div[3]")).click();
	driver.findElement(By.xpath("//div[@id='searchCity']")).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    driver.findElement(By.xpath("//div[@class=\"css-1hwfws3 nb-select__value-container nb-select__value-container--has-value\"]")).click();
    
    Actions city=new Actions(driver);
    for(int i=0;i<3;i++)
    {
    	city.sendKeys(Keys.DOWN).perform();
    }
    city.sendKeys(Keys.ENTER).perform();
    
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

    
	
		driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).click();
		driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).sendKeys("Hinjewadi");
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;

		//*[@id="app"]/div/div/div[1]/div[4]/div[2]/div
		
	driver.findElement(By.xpath("//div[@class='autocomplete-dropdown-container']")).click();
	
	
	Actions loc=new Actions(driver);
	for(int i=0;i<3;i++)
	{
		loc.sendKeys(Keys.DOWN).perform();
	}
	driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS) ;
	WebElement location=driver.findElement(By.xpath("//div[@class=\"css-1hwfws3 nb-select__value-container nb-select__value-container--is-multi\"]"));
	location.click();
	//loc.sendKeys(Keys.ENTER).perform();
	
	
	driver.findElement(By.xpath("//button[@class=\"prop-search-button btn btn-primary btn-lg\"]")).click();
	//*[@id="ff8081816ce8c090016cedc334e84af5"]/section[1]/div[1]/a/h2/span
	
	driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS) ;
	
	driver.findElement(By.xpath("//*[@id=\"ff8081816ce8c090016cedc334e84af5\"]/section[1]/div[1]/a/h2/span")).click();
	ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles()); 
	driver.switchTo().window(tabs.get(1));
	WebElement name=driver.findElement(By.xpath("//*[@id=\"propertyDetails\"]/div[1]/div/div[1]/div[2]/div[1]/h1"));
	String n1=name.getText();
	System.out.println(n1);
	
	WebElement cost=driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[1]/div/section[1]/div[2]/div[1]/div/div[1]/div[3]/div[3]/div/div[1]/span"));
	String c1=cost.getText();
	System.out.println(c1);

	//html/body/div[3]/div/div/div/div/div[1]/div/section[1]/div[2]/div[1]/div/div[1]/div[3]/div[3]/div/div[1]/span
	//Thread.sleep(5000);
	//span[@id="propertyCount"]
	//driver.findElement(By.xpath("//span[@id=\"propertyCount\"]")).click();
	
	}

}
