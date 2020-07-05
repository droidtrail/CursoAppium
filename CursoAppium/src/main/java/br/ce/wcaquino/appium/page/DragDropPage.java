package br.ce.wcaquino.appium.page;

import static br.ce.wcaquino.appium.core.DriverFactory.getDriver;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import java.util.List;

import org.openqa.selenium.By;

import br.ce.wcaquino.appium.core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class DragDropPage extends BasePage {
	
	public void arrastar(String origem, String destino) {
		
		MobileElement inicio = getDriver().findElement(By.xpath("//*[@text='"+origem+"']"));
		MobileElement fim = getDriver().findElement(By.xpath("//*[@text='"+destino+"']"));
		
		new TouchAction<>(getDriver())
		.longPress(longPressOptions().withElement(ElementOption.element(inicio)))
		.moveTo(PointOption.point(fim.getCenter()))
		.release()
		.perform();	
	}
	
	public String [] obterLista() {
		List<MobileElement> element = getDriver().findElements(By.className("android.widget.TextView"));
		String[] retorno = new String[element.size()];
		
		for(int i = 0; i < element.size(); i++) {
			
			retorno[i] = element.get(i).getText();
			//System.out.print("\"" + retorno[i] + "\", ");
			
		}
		
		return retorno;
			
	}

}
