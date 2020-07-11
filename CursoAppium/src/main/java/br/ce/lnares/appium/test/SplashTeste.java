package br.ce.lnares.appium.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.lnares.appium.core.BaseTest;
import br.ce.lnares.appium.page.MenuPage;
import br.ce.lnares.appium.page.SplashPage;

public class SplashTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private SplashPage page = new SplashPage(); 

	@Test
	public void deveAguardarSplashSumir() {

		// Acessar menu Splash
		menu.acessarSplash();
		// Verificar se o Splash está sendo exibido
		page.isTelaSplashVisivel();
		//Aguardar saída do splash
		page.aguardarSplashSumir();
		//Verificar se o formulário voltou a aparecer
		Assert.assertTrue(page.existeElementoPorTexto("Formulário"));
	}

}
