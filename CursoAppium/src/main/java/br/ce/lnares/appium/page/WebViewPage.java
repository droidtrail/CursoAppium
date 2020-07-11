package br.ce.lnares.appium.page;

import static br.ce.lnares.appium.core.DriverFactory.getDriver;

import java.util.Set;

import org.junit.After;
import org.openqa.selenium.By;

import br.ce.lnares.appium.core.BasePage;
import br.ce.lnares.appium.core.DriverFactory;

public class WebViewPage extends BasePage {
	
	public void entrarContextoWeb() {
		
		Set<String> contextHandles = getDriver().getContextHandles();
		
		for(String valor:contextHandles) {
			
			System.out.println(valor);
			
		}
		
		getDriver().context((String) contextHandles.toArray()[1]);
	}

	public void setEmail(String email) {

		getDriver().findElement(By.id("email")).sendKeys(email);

	}
	
	public void setSenha(String senha) {
		
		getDriver().findElement(By.id("senha")).sendKeys(senha);
	}
	
	public void entrar() {
		
		clicar(By.xpath("//button[@type='submit']"));
		
	}

	public void sairContextoWeb() {

		getDriver().context((String)getDriver().getContextHandles().toArray()[0]);

	}
	
}
