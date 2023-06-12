package Util;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import TestBase.TestBase;

public class TestUtil extends TestBase{
	static Random random;
	static Actions act;
	
	
	public static String getScreenshot(String testName) {
		 File srcScreenshot=((TakesScreenshot)TestBase.driver).getScreenshotAs(OutputType.FILE); 
		   String destinationScreenshotPath=System.getProperty("user.dir")+"\\Screenshot\\"+testName+DateTime()+".jpeg";
		 
		   try {
			FileHandler.copy(srcScreenshot, new File(destinationScreenshotPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   return destinationScreenshotPath;
	}
	

	public static String DateTime() {
		LocalDateTime myDateObj = LocalDateTime.now();
		   
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	    
	    return formattedDate;
	    
	}
	
  public static  int randomValue() {
 int value= (int) (Math.random()*100000);
 System.out.println(value);
		
		return value;
		
	}
  
  public static String randomEmail() {
	  String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
      StringBuilder emailid = new StringBuilder();
      random = new Random();
      for (int i = 0; i < characters.length(); i++) {
    	  emailid.append(characters.charAt(random.nextInt(characters.length())));
      }
      return emailid.toString()+"@gmail.com";
    }
	  
	
  public static void MouseAction(WebElement ele) {
	  act= new Actions(driver);
	  act.moveToElement(ele).build().perform();
	  
	  
	  
  }
  public static String getReportConfigPath(){
		String reportConfigPath = TestBase.prop.getProperty(System.getProperty("user.dir")+"\\src\\main\\java\\Config\\extent-config.xml");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
  
  }
	


