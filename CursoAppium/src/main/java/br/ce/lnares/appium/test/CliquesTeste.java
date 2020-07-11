package br.ce.lnares.appium.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import br.ce.lnares.appium.core.BaseTest;
import br.ce.lnares.appium.page.CliquesPage;
import br.ce.lnares.appium.page.MenuPage;

public class CliquesTeste extends BaseTest {

	private static MenuPage menu = new MenuPage();
	private CliquesPage page = new CliquesPage();
	@BeforeClass

	public static void setup() {
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
