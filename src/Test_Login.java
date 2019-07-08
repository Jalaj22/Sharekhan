import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","E:\\JAR\\SeleniumJAR\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		WebElement element = driver.findElementByXPath("//*[@id=\"email\"]");
		Thread.sleep(3000);
		element.sendKeys("namrata");
	}

}
