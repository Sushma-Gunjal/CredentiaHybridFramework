package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.WebdriverUtils;

public class RegistrationPage {

	public WebDriver driver=WebdriverUtils.driver;

	public By FirstName = By.id("mat-input-0");
	public By MiddleName = By.id("mat-input-1");
	public By LastName = By.id("mat-input-2");
	public By opencalender = By.xpath("//input[@id='mat-input-10']");
	public By selectdate = By.xpath("//button[@type='button'][2]/following::div[contains(text(),'15')]");
	public By genderdropdown = By.id("mat-select-value-3");
	public By genderSelect = By.xpath("//span[text()=' Female ']");
	public By Address = By.id("mat-input-3");
	public By city = By.id("mat-input-4");
	public By Zipcode = By.id("mat-input-5");
	public By state = By.id("mat-select-value-1");
	public By statelist = By.xpath("//div[@role='listbox']/mat-option/span");

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	public RegistrationPage enterFirstname(String fname) {
		driver.findElement(FirstName).sendKeys(fname);
		return this;
	}

	public void enterMiddlename(String mname) {
		driver.findElement(MiddleName).sendKeys(mname);
	}

	public void enterLastName(String lastname) {
		driver.findElement(LastName).sendKeys(lastname);
	}

	public void openandselectdate() {
		driver.findElement(opencalender).click();
		driver.findElement(selectdate).click();
	}

	public void selectGender() {
		driver.findElement(genderdropdown).click();
		driver.findElement(genderSelect).click();
	}

	public void enterAddress(String address) {
		driver.findElement(Address).sendKeys(address);
	}

	public void enterCity(String citi) {
		driver.findElement(city).sendKeys(citi);
	}

	public void enterZipcode(String zip) {
		driver.findElement(Zipcode).sendKeys(zip);

	}

	public RegistrationPage selectState(String statename) {
		driver.findElement(state).click();

		List<WebElement> list = driver.findElements(statelist);

		for (int i = 0; i < list.size(); i++) {
			String state = list.get(i).getText();
			if (state.equals(statename)) {
				list.get(i).click();
			}
		}
		return this;
	}
}
