package br.ce.lnares.appium.page;

import org.openqa.selenium.By;

import br.ce.lnares.appium.core.BasePage;
import br.ce.lnares.appium.core.DriverFactory;

public class CliquesPage extends BasePage {

	public void cliqueLongo(By by) {

		cliqueLongo(By.xpath("//*[@text='Clique Longo']"));

	}

	public String obterTextoCampo() {
		
		return DriverFactory.getDriver()
				.findElement(By.xpath("(//android.widget.TextView)[3]"))
				.getText();

	}

}
