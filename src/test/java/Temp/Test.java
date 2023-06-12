package Temp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("dsf@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("233");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String error=null;
		error=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		
		System.out.println("done");
		System.out.println(error);

	}

}
