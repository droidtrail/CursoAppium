package br.ce.lnares.appium.test;

import org.junit.Test;

import br.ce.lnares.appium.core.BaseTest;
import br.ce.lnares.appium.page.AdicionarProdutosPage;

public class AdicionarProdutosTest extends BaseTest {

	private AdicionarProdutosPage add = new AdicionarProdutosPage();

	@Test
	public void adicionarElementosNaLista() throws InterruptedException {
		add.adicionarElemento();
		add.escreverNomeProdutoBreadRolls("Bread rolls");
		add.adicionarProdutoBreadRolls();
		add.escreverNomeProdutoCoffeeFilter("Coffee filter");
		add.adicionarProdutoCoffeeFilter();
		add.escreverNomeProdutoMilk("Soy Milk");
		add.adicionarProdutoMilk();
		add.escreverNomeProdutoMargarine("Margarine");
		add.adicionarProdutoMargarine();
		add.escreverNomeProdutoApples("Apples");
		add.adicionarProdutoApples();
		add.escreverNomeProdutoButterMilk("Butter Milk");
		add.adicionarProdutoButterMilk();
	}

}
