package br.ce.wcaquino.appium.page;

import static br.ce.wcaquino.appium.core.DriverFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;

import br.ce.wcaquino.appium.core.BasePage;
import br.ce.wcaquino.appium.core.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class DragDropPage extends BasePage {
	
	public void arrastar(String origem, String destino) {
		
		MobileElement inicio = getDriver().findElement(By.xpath("//*[@text='"+origem+"']"));
		MobileElement fim = getDriver().findElement(By.xpath("//*[@text='"+destino+"']"));
		
		new TouchAction(getDriver())
		.longPress(inicio)
		.moveTo(fim)
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
