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
		
		//Op��o 1 para direita
		page.swipeElementRight("Op��o 1");
		
		//Clicar na op��o + da Op��o 1
		page.clicarBotaoMais();
		
		//Verificar que a op��o Op��o 1(+) est� presente
		Assert.assertTrue(page.existeElementoPorTexto("Op��o 1 (+)"));
		
		//Op��o 4 para a direita
		page.swipeElementRight("Op��o 4");
		
		//Clicar na op��o - da Op��o 4
		//page.clicarPorTexto("(-)");
		page.clicarBotaoMenos();
		
		//Verificar a Op��o 4 (-) est� presente
		Assert.assertTrue(page.existeElementoPorTexto("Op��o 4 (-)"));
		
		//Op��o 5 para esquerda
		page.swipeElementLeft("Op��o 5 (-)");
		
		//Verificar a op��o 5
		Assert.assertTrue(page.existeElementoPorTexto("Op��o 5"));
		
		
		
	}
}
