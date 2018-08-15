package br.ce.wcaquino.appium.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.appium.core.BaseTest;
import br.ce.wcaquino.appium.page.DragDropPage;
import br.ce.wcaquino.appium.page.MenuPage;

public class DragNDropTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private DragDropPage page = new DragDropPage();
	
	private String[] estadoInicial = new String[] {"Esta", "� uma lista", "Drag em Drop!", "Fa�a um clique longo,", "e arraste para", "qualquer local desejado."};
	private String[] estadoIntermediario = new String[] {"� uma lista", "Drag em Drop!", "Fa�a um clique longo,", "e arraste para", "Esta", "qualquer local desejado."};
	private String[] estadoFinal = new String[] {"Fa�a um clique longo," ,"� uma lista", "Drag em Drop!", "e arraste para", "Esta", "qualquer local desejado."};
	
	@Test
	public void deveEfetuarDragNDrop() {
		
		//Acessar Menu
		menu.acessarDragNDrop();
		
		//Verificar estado inicial
		Assert.assertArrayEquals(estadoInicial, page.obterLista());
		
		//Arrastar "Esta" para "e arrastar para"
		page.arrastar("Esta", "e arraste para");
		
		//Verificar estado intermedi�rio
		Assert.assertArrayEquals(estadoIntermediario, page.obterLista());
		
		//Arrastar "Fa�a um clique longo" para "� uma lista"
		page.arrastar("Fa�a um clique longo,", "� uma lista");
		
		//Verificar estado final
		Assert.assertArrayEquals(estadoFinal, page.obterLista());
		
		
	}

}
