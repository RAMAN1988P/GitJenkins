package sample2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	@Test
	public void validateGoogle() throws IOException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		WebElement element= wd.findElement(By.name("q"));
		element.sendKeys("chennai");
		element.submit();
	
	File src=	((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("D:\\VcentaryGit\\bing.png"));	
	
	//not given continuesly run genkins
	wd.quit();
	}
	


}
