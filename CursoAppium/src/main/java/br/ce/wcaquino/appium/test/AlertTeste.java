package br.ce.wcaquino.appium.test;

import org.junit.Before;
import org.junit.Test;

import br.ce.wcaquino.appium.core.BaseTest;
import br.ce.wcaquino.appium.page.AlertaPage;
import br.ce.wcaquino.appium.page.MenuPage;
import junit.framework.Assert;

public class AlertTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private AlertaPage page = new AlertaPage();

	@Before

	public void setup() {
		// Acessar menu alerta
		menu.acessarAlertas();
	}

	@Test
	public void deveConfirmarAlerta() {

		// Clicar em Alert Confirm
		page.clicarAlertaConfirmacao();

		// Verificar os textos
		Assert.assertEquals("Info", page.obterTituloAlerta());
		Assert.assertEquals("Confirma a operação?", page.obterTituloMensagem());

		// Confirmar alerta
		page.confirmarAlerta();

		// Verificar nova mensagem
		Assert.assertEquals("Info", page.obterTituloAlerta());
		Assert.assertEquals("Confirmado", page.obterTituloMensagem());

		// Sair
		page.clicarPorTexto("SAIR");
	}

	@Test
	public void deveClicarForaAlerta() {

		// Clicar Alerta Simples
		page.clicarAlertaSimples();

		// Clicar Fora da Caixa
		page.clicarForaCaixa();

		// Verificar que a Mensagem do Alerta não está presente
		Assert.assertFalse(page.existeElementoPorTexto("Pode clicar no OK ou fora da caixa para sair"));

	}

}
