package br.ce.wcaquino.appium.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.ce.wcaquino.appium.core.BaseTest;
import br.ce.wcaquino.appium.core.DriverFactory;
import br.ce.wcaquino.appium.page.MenuPage;
import junit.framework.Assert;

public class OpcaoEscondidaTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	
	@Test
	public void deveEncontrarOpcaoEscondida() {
		
		//Scroll Down
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(),10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
		System.out.println("Começando");
		menu.scrollDown();
		
		//Clicar Menu
		menu.clicarPorTexto("Opção bem escondida");
		
		//Verificar Mensagem
		Assert.assertEquals("Você achou essa opção", menu.obterTituloMensagem());
		
		//Sair
		menu.clicarPorTexto("OK");
		
	}

}
