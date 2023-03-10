package auto.property;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Propertyread{
	
	public static void snpahsot(WebDriver driver, String name) throws IOException {
		
	
	
    Calendar c = Calendar.getInstance();
    System.out.println(c.getTime());
	TakesScreenshot snap =  (TakesScreenshot) driver;
	File f = snap.getScreenshotAs(OutputType.FILE);
	File fd = new File ("./Screenshot/" + name +c.getTime().toString().replace(":", "").replace(" ", "")+ ".png");
	FileUtils.copyFile(f, fd);
	
	}  
	
	public static String property(String passkey) throws IOException{
		Properties pr = new Properties();
		File f = new File ("./Appproperty/App.properties");
		FileReader fr = new FileReader(f);
		
		pr.load(fr);
		return pr.get(passkey).toString();
	}

	
	
}



