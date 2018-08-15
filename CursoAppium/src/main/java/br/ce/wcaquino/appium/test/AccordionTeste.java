package br.ce.wcaquino.appium.test;

import org.junit.Test;

import br.ce.wcaquino.appium.core.BaseTest;
import br.ce.wcaquino.appium.page.AccordionPage;
import br.ce.wcaquino.appium.page.MenuPage;
import junit.framework.Assert;

public class AccordionTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AccordionPage page = new AccordionPage();
	
	@Test
	public void deveInteragirComAccordion() {
		
		//Acessar o Menu
		menu.acessarAccordion();
		
		//Clicar Op��o 1
		page.selecionarOp1();
		
		//Verificar Texto Op��o 1
		Assert.assertEquals("Esta � a descri��o da op��o 1", page.obterValorOp1());
		
	}

}
