package br.ce.lnares.appium.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {

	private static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> getDriver() {

		if (driver == null) {

			createDriver();
			//createTestObjectDriver();
		}
		return driver;
	}

	private static void createDriver() {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
//		desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\Leandro Pereira\\AutomacaoAndroid\\CursoAppium\\src\\main\\resources\\CTAppium-1-1.apk");
		desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\Leandro\\git\\CursoAppium\\CursoAppium\\src\\main\\resources\\CTAppium-1-1.apk");
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	private static void createTestObjectDriver() {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("testobject_api_key", "F84A210CCE1C4767B467E886CB18CC99");
		desiredCapabilities.setCapability("appiumVersion", "1.8.1");
		//desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		/*desiredCapabilities.setCapability(MobileCapabilityType.APP,
				"C:\\Users\\Leandro Pereira\\AutomacaoAndroid\\CursoAppium\\src\\main\\resources\\CTAppium-1-1.apk");*/

		try {
			driver = new AndroidDriver<MobileElement>(new URL("https://us1.appium.testobject.com/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void KillDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
