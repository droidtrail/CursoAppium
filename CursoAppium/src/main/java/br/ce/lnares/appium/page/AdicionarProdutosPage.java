package br.ce.lnares.appium.page;

import org.openqa.selenium.By;

import br.ce.lnares.appium.core.BasePage;

public class AdicionarProdutosPage extends BasePage {
	
	public void escreverNomeProduto(String nomeProduto) {
		escrever(By.id("searchIpt"), nomeProduto);
	}

}
