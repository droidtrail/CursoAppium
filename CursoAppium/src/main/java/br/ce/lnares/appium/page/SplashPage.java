package br.ce.lnares.appium.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.ce.lnares.appium.core.BasePage;
import br.ce.lnares.appium.core.DriverFactory;
import io.appium.java_client.functions.ExpectedCondition;

public class SplashPage extends BasePage {
	
	public boolean isTelaSplashVisivel() {
		return existeElementoPorTexto("Splash!");
	}
	public void aguardarSplashSumir() {
		
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Splash!']")));
		
	}

}
