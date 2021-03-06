package br.ce.wcaquino.appium.core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {
	
	@Rule
	public TestName testName = new TestName();
/*
	@AfterClass
	public static void finalizarClasse() {
		DriverFactory.KillDriver();
	}
	*/
/*
	@After
	public void tearDown() {
		gerarScreenShot();
		DriverFactory.getDriver().resetApp();
	}
*/
	public void gerarScreenShot() {

		try {
			File image = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(image, new File("target/screenshots/"+testName.getMethodName()+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
