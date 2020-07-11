package br.ce.wcaquino.appium.test;

import org.junit.Test;

import br.ce.wcaquino.appium.core.BaseTest;
import br.ce.wcaquino.appium.page.AbasPage;
import br.ce.wcaquino.appium.page.MenuPage;
import junit.framework.Assert;

public class AbasTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private AbasPage page = new AbasPage();

	@SuppressWarnings("deprecation")
	@Test
	public void deveInteragirComAbas() {

		// Acessar menu abas
		menu.acessarAbas();
		// verificar que está na aba 1
		Assert.assertTrue(page.isAba1());

		// Clicar na aba 2
		page.selecionarAba2();
		// verificar que está na aba2
		Assert.assertTrue(page.isAba2());

	}

}
