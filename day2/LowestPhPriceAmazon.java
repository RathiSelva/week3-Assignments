package week3.day2;
import java.util.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LowestPhPriceAmazon {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone", Keys.ENTER);
		 List<WebElement> allMobPrice = driver.findElements(By.className("a-price-whole"));
		List<Integer> priceList = new ArrayList<Integer>();

		for (WebElement eachPrice : allMobPrice) {
			//System.out.println(eachPrice.getText());
		
		 String text = eachPrice.getText().replace(",", "").replace("₹", "");
		if (!eachPrice.getText().isEmpty()) {
			// System.out.println(text);
			   int price = Integer.parseInt(text);
				priceList.add(price);
		}
		}
			Collections.sort(priceList);
			System.out.println(priceList);
			
			System.out.println("Least Price " + priceList.get(0));}
}
	

