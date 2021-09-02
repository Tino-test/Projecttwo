package org.test7777;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sampletom {
	WebDriver driver;


@Test(enabled=false)
private void intelradio() {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Gdebug\\chromedriver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://www.leafground.com/pages/radio.html");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement unchecked = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[2]/input"));
boolean statusone = unchecked.isSelected();
System.out.println(statusone);
WebElement checked = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[3]/input"));
boolean statustwo = checked.isSelected();
System.out.println(statustwo);

}
@Test
private void checkboxes() {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Gdebug\\chromedriver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
WebElement java = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/input[1]"));
java.click();
WebElement selenium = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/input"));
boolean status = selenium.isSelected();
System.out.println(status);
WebElement deselected = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/input[2]"));//fullxpath
deselected.click();
WebElement option1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[1]"));
option1.click();
WebElement option2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[2]"));
option2.click();
WebElement option3 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[3]"));
option3.click();
WebElement option4 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[4]"));
option4.click();
WebElement option5 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[5]"));
option5.click();
WebElement option6 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[6]")); //xpath
option6.click();


}
}


