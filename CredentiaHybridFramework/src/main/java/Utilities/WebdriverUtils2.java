package Utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverUtils2 {

	
	
public static WebDriver driver;

public static void launchbrowser()
{
	driver= new ChromeDriver();
	driver.get("https://credentiauat.examroom.ai/login/register?RoleId=1&TenantCode=CD&StateCode=MS");
}


public void fluentWait(String WebElement) {
	Wait<WebDriver> fw1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
			.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
	fw1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(WebElement)));
}

public void fluentWaitAndClick(String WebElement) {
	Wait<WebDriver> fw1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
			.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
	fw1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(WebElement))).click();
}

public void fluentWaitAndClick1(String WebElement) {
	Wait<WebDriver> fw1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
			.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
	fw1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(WebElement))).click();
}

	
}
