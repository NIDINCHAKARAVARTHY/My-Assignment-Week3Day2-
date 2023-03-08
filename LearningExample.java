package week3day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningExample {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones",Keys.ENTER);
        List<WebElement> allprice = driver.findElements(By.className("a-price-whole"));
		
		List<Integer>phones=new ArrayList<Integer>();
		for (int i = 0; i <allprice.size(); i++) {
			String text = allprice.get(i).getText();
			String obj = text.replaceAll(",", "");
			System.out.println(obj);
			if(!obj.trim().equals("")) {
				int finalprice = Integer.parseInt(obj);
				if(finalprice>0) {
					phones.add(finalprice);
				}
			}
		}
		Collections.sort(phones);
		System.out.println("lowest price: "+ phones.get(0));
			
	}

}
