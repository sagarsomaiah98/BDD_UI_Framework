package TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.RegisterPage;
import Pages.SearchPage;

public class TestBase {
	FileInputStream fis;
	public static Properties prop;
	public static  WebDriver driver;
	public static Logger log = Logger.getLogger(TestBase.class.getName());  
	

  
	
	public void intialize() throws IOException {

		
        fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
		
		 prop = new Properties();
		prop.load(fis);
		
	    String bname= prop.getProperty("Browser");
	    
	    
	    switch(bname) 
	    {
	    case "chrome":
	    	driver = new ChromeDriver();
	    	break;
	   
	    case "firefox":
	    	driver= new FirefoxDriver();
	    	break;
	    	
	    case "edge": 	
	    	driver= new EdgeDriver();
	    	break;
	    
	    	default:
	    		log.info("Invalid Browser");
	    		System.out.println("Invalid Browser");
	  
	    
	    
	    }
	
	    String url=prop.getProperty("url");
	    int timeout=Integer.parseInt(prop.getProperty("timeout"));
	    int pageloadTimeout=Integer.parseInt(prop.getProperty("pageloadtimeout"));
	    
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(timeout));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(pageloadTimeout));
	    driver.manage().window().maximize();
	    
	
	
	}

}
