package week3.day2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioMenBagNames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		// Launch Firefox / Chrome
		ChromeDriver driver = new ChromeDriver(option);
		// Loads a new web page in the current browser window

		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		Thread.sleep(2000);
		// To the left of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		// Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		// Print the count of the items Found.
		String totalNoOfItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + totalNoOfItems);
		// Get the list of brand of the products displayed in the page and print the
		// list.
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" List of Brands");
		System.out.println(" Size :" + bagBrandList.size());
		
		for (WebElement brandele : bagBrandList) {
			String brand = brandele.getText();
			System.out.println(brand);
		}
		// Get the list of names of the bags and print it
		List<WebElement> bagNameList = driver.findElements(By.className("name"));
		for (WebElement element : bagNameList) {
			String text = element.getText();
			System.out.println(text);
			System.out.println(" Size :" + bagNameList.size());
			System.out.println(" Names of the Bags");
		}

	}

}
