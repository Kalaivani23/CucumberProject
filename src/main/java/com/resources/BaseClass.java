package com.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static public WebDriver driver;
	static public Select select;
	static public Actions action;
	static public Alert alert;

	public static void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hi\\eclipse-workspace\\Kalaivani\\CucumberProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static void type(WebElement e, String s) {
		e.sendKeys(s);
	}

	public static void click(WebElement e) {
		e.click();
	}

	public static void dropDownValue(WebElement e, String value) {
		select = new Select(e);
		select.selectByValue(value);
	}

	public static void dropDownText(WebElement e, String text) {
		select = new Select(e);
		select.selectByVisibleText(text);
	}

	public static void dropDownIndex(WebElement e, int index) {
		select = new Select(e);
		select.selectByIndex(index);
	}

	public static void actionMoveToElement(WebElement e) {
		action = new Actions(driver);
		action.moveToElement(e).perform();
	}

	public static void actionContextClick(WebElement e) {
		action = new Actions(driver);
		action.contextClick(e).perform();
	}

	public static void actionDoubleClick(WebElement e) {
		action = new Actions(driver);
		action.doubleClick(e).perform();
	}

	public static void actionDragAndDrop(WebElement src, WebElement des) {
		action = new Actions(driver);
		action.dragAndDrop(src, des).perform();
	}

	public static void actionKeyUpDown(WebElement e, String text) {
		action = new Actions(driver);
		action.keyDown(e, Keys.SHIFT).sendKeys(text).keyUp(e, Keys.SHIFT).perform();
	}

	public static void windowsHandling(WebDriver d) {
		String pWind = d.getWindowHandle();
		Set<String> allWind = d.getWindowHandles();
		for (String cWind : allWind) {
			if (!(cWind.equals(pWind))) {
				driver.switchTo().window(cWind);
			}
		}
	}

	public static void multipleWindowsHandling(WebDriver d, int window) {
		Set<String> allWind = d.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(allWind);
		driver.switchTo().window(list.get(window));
	}

	public static String getData(int r, int c) throws IOException {
		File loc = new File("C:\\Users\\hi\\eclipse-workspace\\Kalaivani\\MavenSample\\excel\\Datadriven.xlsx");
		FileInputStream f = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(f);
		Sheet s = w.getSheet("Datas");
		Row row = s.getRow(r);
		Cell cell = row.getCell(c);
		int type = cell.getCellType();
		String value = null;
		if (type == 1) {
			value = cell.getStringCellValue();
		} else if (type == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("mm/dd/yyyy");
				value = sim.format(date);
			} else {
				double num = cell.getNumericCellValue();
				long l = (long) num;
				value = String.valueOf(l);
			}
		}
		return value;
	}

	public static void alert(String alertType, String action) {
		alert = driver.switchTo().alert();
		if (alertType.equals("Simple")) {
			if (action.equals("accept")) {
				alert.accept();
			}
		} else if (alertType.equals("Confirm")) {
			if (action.equals("accept")) {
				alert.accept();
			} else if (action.equals("dismiss")) {
				alert.dismiss();
			} else if (alertType.equals("Prompt")) {
				if (action.equals("accept")) {
					alert.sendKeys("Yes");
					alert.accept();
				} else if (action.equals("dismiss")) {
					alert.sendKeys("No");
					alert.dismiss();
				}
			}
		}
	}

	public static void screenShot(String imgname) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dec = new File("G:\\Screenshot" + imgname);
		FileUtils.copyFile(src, dec);
	}
	public static String getURL() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
}