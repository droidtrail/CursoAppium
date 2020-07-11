package br.ce.lnares.appium.test;

import org.junit.Test;

import br.ce.lnares.appium.core.BaseTest;
import br.ce.lnares.appium.page.MenuPage;
import br.ce.lnares.appium.page.SwipeListPage;
import junit.framework.Assert;

public class SwipeElementTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SwipeListPage page = new SwipeListPage();
	
	@Test
	public void deveResolverDesafio(){
		
		//Clicar SwipeList
		menu.acessarSwipeList();	
		
		//Opção 1 para direita
		page.swipeElementRight("Opção 1");
		
		//Clicar na opção + da Opção 1
		page.clicarBotaoMais();
		
		//Verificar que a opção Opção 1(+) está presente
		Assert.assertTrue(page.existeElementoPorTexto("Opção 1 (+)"));
		
		//Opção 4 para a direita
		page.swipeElementRight("Opção 4");
		
		//Clicar na opção - da Opção 4
		//page.clicarPorTexto("(-)");
		page.clicarBotaoMenos();
		
		//Verificar a Opção 4 (-) está presente
		Assert.assertTrue(page.existeElementoPorTexto("Opção 4 (-)"));
		
		//Opção 5 para esquerda
		page.swipeElementLeft("Opção 5 (-)");
		
		//Verificar a opção 5
		Assert.assertTrue(page.existeElementoPorTexto("Opção 5"));
		
		
		
	}
}
