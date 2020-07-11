package br.ce.lnares.appium.test;

import org.junit.Test;

import br.ce.lnares.appium.core.BaseTest;
import br.ce.lnares.appium.page.AdicionarProdutosPage;

public class AdicionarProdutosTest extends BaseTest {
	
	private AdicionarProdutosPage add = new AdicionarProdutosPage();

	@Test
	public void devePreencherCampoTexto() {
		add.escreverNomeProduto("Breed");
	}
}
