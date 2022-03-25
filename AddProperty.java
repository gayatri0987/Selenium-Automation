package selenium.project;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AddProperty {
public static void main(String[] args) throws InterruptedException



{
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.nobroker.in/");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
//*[@id="navheaderContainer"]/div[1]/div/div[1]/div/div/div[2]
//*[@id="navHeader"]/div[1]/div
//WebElement login1=driver.findElement(By.id("navHeader"));
//login1.click();
//*[@id="navHeader"]/div[5]/div[2]/div[2]/div
WebElement login=driver.findElement(By.xpath("//*[@id=\"navHeader\"]/div[5]/div[2]/div[2]/div"));
login.click();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//WebElement code=driver.findElement(By.xpath("//*[@id=\"login-signup-form\"]/div[2]/div[1]/div/div/div/div/div[2]"));
//code.click();
//*[@id="signUp-phoneNumber"]
//ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
//driver.switchTo().window(tabs.get(1));
WebElement no=driver.findElement(By.xpath("//input[@type=\"tel\"]"));
no.sendKeys("7559379296",Keys.ENTER);
//*[@id="login-signup-form"]/div[4]/label[2]
//label[@for="login-signup-form-login-radio-password"]
WebElement radio=driver.findElement(By.xpath("//label[@for=\"login-signup-form-login-radio-password\"]"));
radio.click();
//input[@type="password"]
WebElement pass=driver.findElement(By.xpath("//input[@type=\"password\"]"));
pass.sendKeys("gaya6413",Keys.ENTER);
//driver.findElement(By.) }}
//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//String parent=driver.getWindowHandle();



Thread.sleep(1000);



WebElement adPro=driver.findElement(By.xpath("//span[@class=\"tooltip-trigger-text\"]"));
adPro.click();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tabs.get(1));
String Winhandle=driver.getWindowHandle();
System.out.println(Winhandle);
Thread.sleep(5000);



WebElement selcity=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div/div/div"));
selcity.click();






}
}