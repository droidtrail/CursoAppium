package br.ce.wcaquino.appium.test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.ce.wcaquino.appium.core.BaseTest;
import br.ce.wcaquino.appium.page.CliquesPage;
import br.ce.wcaquino.appium.page.MenuPage;
import org.junit.Assert;

public class CliquesTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private CliquesPage page = new CliquesPage();

	@Before

	public void setup() {
		// Acessar Menu
		menu.acessarCliques();
	}

	@Test
	public void deveRealizarCliqueLongo() {

		// Clique Logo
		page.cliqueLongo(By.xpath("cliqueLongo"));

		// Verificar Texto
		Assert.assertEquals("Clique Longo", page.obterTextoCampo());

	}

	@Test
	public void deveRealizarCliqueDuplo() {	
		//Clique Duplo
		page.clicarPorTextoDuploClique("Clique duplo");
		
		//Verificar Texto
		Assert.assertEquals("Duplo Clique", page.obterTextoCampo());
		

	}

}
