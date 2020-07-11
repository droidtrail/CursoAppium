package br.ce.lnares.appium.page.seuBarriga;

import static br.ce.lnares.appium.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.ce.lnares.appium.core.BasePage;
import io.appium.java_client.MobileElement;

public class SBResumoPage extends BasePage {
	
	public void excluirMovimentacao(String desc) {
		
		MobileElement el = getDriver().findElement(By.xpath("//*[@text = '"+desc+"']/.."));
		swipeElementos(el, 0.9, 0.1);
		clicarPorTexto("Del");
		
	}

}
