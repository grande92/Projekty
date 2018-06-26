package testowy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class test {
	static WebDriver driver;
	static String browser;

	public static void main(String[] args) {	
		setBrowser();
		setBrowserConfig();
		runTest();
	}
	//setBrowser
	public static void setBrowser(){
		browser="Firefox";
	}
	//setBrowserConfig
	public static void setBrowserConfig(){
		if(browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	//runTest
	public static void runTest(){
		driver.get("https://www.wp.pl/");
		driver.quit();
	}
}