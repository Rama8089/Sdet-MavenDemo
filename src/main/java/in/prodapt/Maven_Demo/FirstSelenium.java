package in.prodapt.Maven_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximize window
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com");
		// print the title of webpage
		System.out.println(driver.getTitle());

		// print the current url of webpage
		System.out.println(driver.getCurrentUrl());

		// close the driver execution complete
		driver.close();

	}
}
