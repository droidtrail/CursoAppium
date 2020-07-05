package br.ce.wcaquino.appium.page;

import org.openqa.selenium.By;

import br.ce.wcaquino.appium.core.BasePage;
import br.ce.wcaquino.appium.core.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class SwipeListPage extends BasePage {

	public void swipeElementLeft(String opcao) {
		swipeElementos(DriverFactory.getDriver().findElement(By.xpath("//*[@text = '" + opcao + "']/..")), 0.1, 0.9);
	}

	public void swipeElementRight(String opcao) {
		swipeElementos(DriverFactory.getDriver().findElement(By.xpath("//*[@text = '" + opcao + "']/..")), 0.9, 0.1);
	}

	public void clicarBotaoMais() {

		MobileElement botao = DriverFactory.getDriver().findElement(By.xpath("//*[@text = '(+)']/.."));
		new TouchAction<>(DriverFactory.getDriver())
			.tap(TapOptions.tapOptions().withElement(ElementOption.element(botao, -50, 0)))
			.perform();

	}

	public void clicarBotaoMenos() {

		MobileElement botao = DriverFactory.getDriver().findElement(By.xpath("//*[@text = '(-)']/.."));
		new TouchAction(DriverFactory.getDriver())
			.tap(TapOptions.tapOptions().withElement(ElementOption.element(botao, -50, 0)))
			.perform();

	}

}
