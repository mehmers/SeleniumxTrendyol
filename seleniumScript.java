package codefighter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
//import java.util.NoSuchElementException;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class seleniumScript {
	
	public static int errorCount = 0;
	
	public static void main(String[] args) throws InterruptedException {
		chrome();
		firefox();
		System.out.printf("Program terminated with %d managaeable errors.", errorCount);
		System.exit(0);
	}
	
	public static void chrome() throws InterruptedException {
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://www.trendyol.com");
		while (1<2) {
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));
			String title = driver.getTitle();
			String check = "En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da";
			if(check.equals(title)){break;}
			driver.navigate().refresh();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		}
		//new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.alertIsPresent());
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		//driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]")).click();
		//Thread.sleep(100);
		driver.findElement(By.xpath("//span[@class='homepage-popup-gender']")).click();
		new WebDriverWait(driver, Duration.ofMillis(3000)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='link account-user']")));
		WebElement hoverable = driver.findElement(By.xpath("//div[@class='link account-user']"));
        new Actions(driver).moveToElement(hoverable).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
		click(driver, "//div[@class='login-button']", 3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
		click(driver, "//input[@id='login-email']", 3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
		driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("reallatestsamurai@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
		click(driver, "//input[@id='login-password-input']", 100);
		driver.findElement(By.xpath("//input[@id='login-password-input']")).sendKeys("sifremibilmiyorum1001+");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
		click(driver, "//button[@type='submit']//span[contains(text(),'Giriş Yap')]", 200);
		new WebDriverWait(driver, Duration.ofMillis(3000)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Hesabım')]")));
		new WebDriverWait(driver, Duration.ofMillis(3000)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Aradığınız ürün, kategori veya markayı yazınız']")));
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Aradığınız ürün, kategori veya markayı yazınız']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		sendKeys(driver, element, 4000, "RTX 3080");
		click(driver, "//i[@class='ft51BU2r']", 4000);
		//driver.findElement(By.xpath("//i[@class='ft51BU2r']")).click(); //same as above line
		new WebDriverWait(driver, Duration.ofMillis(4000)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='fltr-item-text'][contains(text(),'Ekran Kartı')]")));
		WebElement graphicsCardFilter = driver.findElement(By.xpath("//div[@class='fltr-item-text'][contains(text(),'Ekran Kartı')]"));
		graphicsCardFilter.click();
		new WebDriverWait(driver, Duration.ofMillis(4000)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()='20000 TL - 25000 TL']")));
		WebElement priceFilter = driver.findElement(By.xpath("//div[normalize-space()='20000 TL - 25000 TL']"));
		priceFilter.click();
		new WebDriverWait(driver, Duration.ofMillis(4000)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/span[2]/i[1]")));
		String xpathArray[] = {"/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/div[1]",
				"/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]",
				"/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[3]/div[1]/div[2]/button[1]/div[1]",
				"/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[4]/div[1]/div[2]/button[1]",
				"/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[5]/div[1]/div[2]/button[1]/div[1]",
				"/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[6]/div[1]/div[2]/button[1]/div[1]",
				"/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[7]/div[1]/div[2]/button[1]/div[1]"};
		addToChartAdvanced(driver, xpathArray, 1000);
		
		addToChartUltraAdvanced(driver, "i3 10100f", "İşlemci", 1000, 2500, 3000);
		addToChartUltraAdvanced(driver, "500 gb ssd", "SSD (Solid State Drive)", 300, 1200, 3000);
		click(driver, "//p[normalize-space()='Sepetim']", 3000);
		click(driver, "//span[@class='add-coupon-toggle-title']", 3000);
		click(driver, "//input[@placeholder='Kodunuzu Giriniz']", 3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		WebElement discount = driver.findElement(By.xpath("//input[@placeholder='Kodunuzu Giriniz']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		discount.sendKeys("DENEME");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		click(driver, "//div[@class='add-coupon-button']", 3000);
		click(driver, "//button[@class='coupon-error-button']", 3000);
		click(driver, "//aside[@class='sticky']//div[4]//a[1]//span[1]", 3000);
		driver.quit();
	}
	public static void firefox() throws InterruptedException {
	    FirefoxOptions options = new FirefoxOptions()
	    .addPreference("dom.webnotifications.enabled", false);
	    WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://www.trendyol.com");
		while (1<2) {
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));
			String title = driver.getTitle();
			String check = "En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da";
			if(check.equals(title)){break;}
			driver.navigate().refresh();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		}
		//new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.alertIsPresent());
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		//driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]")).click();
		//Thread.sleep(100);
		driver.findElement(By.xpath("//span[@class='homepage-popup-gender']")).click();
		new WebDriverWait(driver, Duration.ofMillis(3000)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='link account-user']")));
		WebElement hoverable = driver.findElement(By.xpath("//div[@class='link account-user']"));
        new Actions(driver).moveToElement(hoverable).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
		click(driver, "//div[@class='login-button']", 3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
		click(driver, "//input[@id='login-email']", 3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
		driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("reallatestsamurai@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
		click(driver, "//input[@id='login-password-input']", 100);
		driver.findElement(By.xpath("//input[@id='login-password-input']")).sendKeys("sifremibilmiyorum1001+");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
		click(driver, "//button[@type='submit']//span[contains(text(),'Giriş Yap')]", 200);
		new WebDriverWait(driver, Duration.ofMillis(3000)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Hesabım')]")));
		new WebDriverWait(driver, Duration.ofMillis(3000)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Aradığınız ürün, kategori veya markayı yazınız']")));
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Aradığınız ürün, kategori veya markayı yazınız']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		sendKeys(driver, element, 4000, "RTX 3080");
		click(driver, "//i[@class='ft51BU2r']", 4000);
		//driver.findElement(By.xpath("//i[@class='ft51BU2r']")).click(); //same as above line
		new WebDriverWait(driver, Duration.ofMillis(4000)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='fltr-item-text'][contains(text(),'Ekran Kartı')]")));
		WebElement graphicsCardFilter = driver.findElement(By.xpath("//div[@class='fltr-item-text'][contains(text(),'Ekran Kartı')]"));
		graphicsCardFilter.click();
		new WebDriverWait(driver, Duration.ofMillis(4000)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()='20000 TL - 25000 TL']")));
		WebElement priceFilter = driver.findElement(By.xpath("//div[normalize-space()='20000 TL - 25000 TL']"));
		priceFilter.click();
		new WebDriverWait(driver, Duration.ofMillis(4000)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/span[2]/i[1]")));
		String xpathArray[] = {"/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/div[1]",
				"/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]",
				"/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[3]/div[1]/div[2]/button[1]/div[1]",
				"/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[4]/div[1]/div[2]/button[1]",
				"/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[5]/div[1]/div[2]/button[1]/div[1]",
				"/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[6]/div[1]/div[2]/button[1]/div[1]",
				"/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[7]/div[1]/div[2]/button[1]/div[1]"};
		addToChartAdvanced(driver, xpathArray, 1000);
		
		addToChartUltraAdvanced(driver, "i3 10100f", "İşlemci", 1000, 2500, 3000);
		addToChartUltraAdvanced(driver, "500 gb ssd", "SSD (Solid State Drive)", 300, 1200, 3000);
		click(driver, "//p[normalize-space()='Sepetim']", 3000);
		click(driver, "//span[@class='add-coupon-toggle-title']", 3000);
		click(driver, "//input[@placeholder='Kodunuzu Giriniz']", 3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement discount = driver.findElement(By.xpath("//input[@placeholder='Kodunuzu Giriniz']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		discount.sendKeys("DENEME");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		click(driver, "//div[@class='add-coupon-button']", 3000);
		click(driver, "//button[@class='coupon-error-button']", 3000);
		click(driver, "//aside[@class='sticky']//div[4]//a[1]//span[1]", 3000);
		driver.quit();
	}	
	public static void sendKeys(WebDriver driver1, WebElement element, int timeout, String value) throws InterruptedException {
		new WebDriverWait(driver1, Duration.ofMillis(timeout)).until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(value);
	}
	public static void click(WebDriver driver1, String xpath, int timeout) {
		try {
		new WebDriverWait(driver1, Duration.ofMillis(timeout)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		WebElement element = driver1.findElement(By.xpath(xpath));
		new WebDriverWait(driver1, Duration.ofMillis(timeout)).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		element.click();}
		catch(Exception e) {
			errorCount++;
			System.out.println("Error occurred while clicking to item.Trying again.");
			click(driver1, xpath, timeout);
		}
	}
	public static void addToChartAdvanced(WebDriver driver1, String[] xpathArray, int timeout) {
		int i = 1;
		for (String xpath : xpathArray) {
			if(i%4 == 0) {
				JavascriptExecutor js = (JavascriptExecutor) driver1;
				js.executeScript("window.scrollBy(0,250)", "");
			}
			new WebDriverWait(driver1, Duration.ofMillis(timeout)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			boolean check = driver1.findElements(By.xpath(xpath)).isEmpty();
			if(check == true) {continue;}
			WebElement element = driver1.findElement(By.xpath(xpath));
			element.click();
			if(check == false) {break;}
			i++;
		}
	}
	public static void addToChartUltraAdvanced(WebDriver driver1, String itemname, String category, int minPrice, int maxPrice, int timeout) throws InterruptedException {
		
		WebElement element = driver1.findElement(By.xpath("//input[@placeholder='Aradığınız ürün, kategori veya markayı yazınız']"));
		new WebDriverWait(driver1, Duration.ofMillis(timeout)).until(ExpectedConditions.visibilityOf(element));
		element.clear();
		sendKeys(driver1, element, timeout, itemname);
		click(driver1, "//i[@class='ft51BU2r']", timeout);
		String xpath = "//div[@class='fltr-item-text'][contains(text(),'";
		xpath = xpath.concat(category);
		xpath = xpath.concat("')]");
		new WebDriverWait(driver1, Duration.ofMillis(timeout)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		WebElement filter = driver1.findElement(By.xpath(xpath));
		filter.click();
		driver1.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));
		boolean check = driver1.findElements(By.xpath("//input[@placeholder='En Az']")).isEmpty();
		if(check == true) {click(driver1, "//body/div[@id='container']/div[@data-fragment-name='MarketingSearch']/div[@data-partial-fragment-name='MarketingSearch']/div/div[@data-fragment-name='Search']/div[@id='search-app']/div[@class='search-app-container']/div[@class='srch-rslt-cntnt']/div[@class='srch-aggrgtn-cntnr']/div[@id='sticky']/div[@class='aggrgtn-cntnr-wrppr']/div[3]/div[1]", 2000);}
		click(driver1, "//input[@placeholder='En Az']", timeout);
		driver1.findElement(By.xpath("//input[@placeholder='En Az']")).sendKeys(""+minPrice);
		click(driver1, "//input[@placeholder='En Az']", timeout);
		driver1.findElement(By.xpath("//input[@placeholder='En Çok']")).sendKeys(""+maxPrice);
		click(driver1, "//button[@class='fltr-srch-prc-rng-srch']", timeout);
		click(driver1, "//div[contains(text(),'Sepete Ekle')]", timeout);
	}
}
