package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert1 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.leafground.com/alert.xhtml");
	//For simple Dialog
	//Click simple alert
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
	//switch the control to alert
	Alert alert = driver.switchTo().alert();
	//print the information of the alert box in console
	String text = alert.getText();
	System.out.println(text);
	Thread.sleep(3000);
	//click ok
	alert.accept();
	
	//For confirm Dialog
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
	//Switch the control to alert
	Alert alert2 = driver.switchTo().alert();
	//print the information of the alert box in console
	String text2 = alert2.getText();
	System.out.println(text2);
	Thread.sleep(3000);
	//click cancel
	alert2.dismiss();
	
	//For Sweet alert(simple Dialog)
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
    
    //Sweet alert (Model Dialog)
    driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[2]")).click();
	
    //prompt alert
	//click prompt alert
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
	//switch the control to prompt alert
	Alert alert6 = driver.switchTo().alert();
	alert6.sendKeys("Testleaf chennai");
	//print the information from the alert box
	String text6 = alert6.getText();
	System.out.println(text6);
	Thread.sleep(3000);
	//Click ok
	alert6.accept();
	
	//sweet alert confirmation
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='No']")).click();
	
	//MAximize and minimize alert
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[8]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-maximize ui-corner-all']")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[3]")).click();
}
}
