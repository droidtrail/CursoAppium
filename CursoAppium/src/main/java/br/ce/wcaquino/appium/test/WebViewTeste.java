package br.ce.wcaquino.appium.test;

import org.junit.After;
import org.junit.Test;

import br.ce.wcaquino.appium.core.BaseTest;
import br.ce.wcaquino.appium.page.MenuPage;
import br.ce.wcaquino.appium.page.WebViewPage;

public class WebViewTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private WebViewPage page = new WebViewPage();
	
	@Test
	public void deveFazerLogin() throws InterruptedException {
		
		//Acessar o menu
		menu.acessarSBHibrido();
		
		Thread.sleep(3000);
		
		page.entrarContextoWeb();
		
		//Preencher E-mail
		page.setEmail("xpro@gmail.com");
		
		//Senha
		page.setSenha("1");
		
		//Entrar
		page.entrar();
		
		//Verificar Mensagem de Sucesso
		
	}
	
	@After
	public void tearDown() {
		
		page.sairContextoWeb();
		
	}

}
