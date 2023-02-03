package basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToLaunchEmptyBrowser_Test{
    @Test
	public void tolaunch(){
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.swiggy.com/");
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.selenium.dev/");
		driver.switchTo().window(parentWindow);
		driver.manage().window().minimize();
		
	}

}
