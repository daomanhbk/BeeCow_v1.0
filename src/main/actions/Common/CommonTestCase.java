package Common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.google.gson.Gson;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import jSonClasses.jSonFather;

public class CommonTestCase {
	WebDriver driver;

//	public WebDriver openBowser(String browser, String version, String url) {
	public WebDriver openBowser(String browser, String version) {
		if (browser.equals("chrome")) {
			ChromeDriverManager.getInstance().version(version).setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			FirefoxDriverManager.getInstance().version(version).setup();
		}

//		driver.get(url);
		driver.manage().window().maximize();

		return driver;
	}

	public void assertEqualCommon(String actual, String expected) {
		Assert.assertEquals(actual, expected);
	}

	public static String readFile(String filename) {
		String result = "";
		try {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(filename));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				line = br.readLine();
			}
			result = sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

	public static jSonFather getDataJson(String JsonFile) {
		String json = readFile(JsonFile);
		return new Gson().fromJson(json, jSonFather.class);
	}

	public String randomProductName() {
		Random rand = new Random();
		int number = rand.nextInt(900000);
		String numberString = Integer.toString(number);
		return numberString;
	}

	public String randomCBX1() {
		Random rand = new Random();
		int number = rand.nextInt(10);
		String numberString = Integer.toString(number);
		return numberString;
	}

	public String randomCBX2() {
		Random rand = new Random();
		int number = rand.nextInt(5);
		String numberString = Integer.toString(number);
		return numberString;
	}

	public String randomCBX3() {
		Random rand = new Random();
		int number = rand.nextInt(3);
		String numberString = Integer.toString(number);
		return numberString;
	}

//	public String getTextDynamicElement(String locator, String dynamic) {
//		String dynamicLocator = String.format(locator, dynamic);
//		WebElement element = driver.findElement(By.xpath(dynamicLocator));
//		return element.getText();
//	}
	
	public void deleteProduct() {
		
	}
	
}
