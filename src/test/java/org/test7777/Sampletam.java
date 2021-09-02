package org.test7777;

/*import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Sampletam {
public	WebDriver driver;
@Test
private void regdrop() throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Gdebug\\chrome92\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://en-gb.facebook.com/r.php");
    driver.manage().window().maximize();
    WebElement month = driver.findElement(By.id("month"));
    Select ob= new Select(month);
    ob.selectByValue("1");
    ob.selectByVisibleText("Feb");
    ob.selectByIndex(3);
    ob.selectByIndex(4);
    ob.selectByIndex(5);
    ob.selectByIndex(6);
    ob.selectByIndex(7);
    ob.selectByIndex(8);
    ob.selectByIndex(9);
    ob.selectByIndex(10);
    ob.selectByIndex(11);
    ob.selectByIndex(12);
    
}

}
