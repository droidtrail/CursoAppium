package br.ce.lnares.appium.test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ce.lnares.appium.core.BaseTest;
import br.ce.lnares.appium.page.FormularioPage;
import br.ce.lnares.appium.page.MenuPage;
import io.appium.java_client.MobileBy;

public class FormularioTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private FormularioPage page = new FormularioPage();

	@Before
	public void inicializarAppium() {

		menu.acessarFormulario();

	}

	@Test
	public void devePreencherCampoTexto() throws MalformedURLException, InterruptedException {

		page.escreverNome("Leandro Santos Nares");
		assertEquals("Leandro Santos Nares", page.obterNome());

	}

	@Test
	public void deveInteragirCombo() throws MalformedURLException, InterruptedException {

		page.selecionarCombo("Nintendo Switch");
		Assert.assertEquals("Nintendo Switch", page.obterValorCombo());
	}

	@Test
	public void deveInteragirSwitchCheckBox() throws MalformedURLException, InterruptedException {

		Assert.assertFalse(page.isCheckMarcado());
		Assert.assertTrue(page.isSwitchMarcado());

		page.clicarCheck();
		page.clicarSwitch();

		Assert.assertTrue(page.isCheckMarcado());
		Assert.assertFalse(page.isSwitchMarcado());

	}
	
	@Test
	public void deveAlterarData() {
		page.clicarPorTexto("01/01/2000");
		page.clicarPorTexto("20");
		page.clicarPorTexto("OK");
		Assert.assertTrue(page.existeElementoPorTexto("20/2/2000"));
	}

	@Test
	public void deveAlterarHora() {
		
		page.clicarPorTexto("06:00");
		page.clicar(MobileBy.AccessibilityId("4"));
		page.clicar(MobileBy.AccessibilityId("50"));
		page.clicarPorTexto("OK");
		Assert.assertTrue(page.existeElementoPorTexto("4:50"));

	}

	@Test
	public void deveRealizarCadastro() throws MalformedURLException, InterruptedException {

		page.escreverNome("Leandro Santos");
		page.clicarCheck();
		page.clicarSwitch();
		page.selecionarCombo("XBox One");

		page.salvar();

		Assert.assertEquals("Nome: Leandro Santos", page.obterNomeCadastrado());
		Assert.assertEquals("Console: xone", page.obterConsoleCadastrado());
		Assert.assertTrue(page.obterCheckCadastrado().endsWith("Off"));
		Assert.assertTrue(page.obterSwitchCadastrado().endsWith("Marcado"));

	}
	
	@Test
	public void deveInteragirComSeekbar() {
		//Clicar no seek
		page.clicarSeekBar(0.67);
		
		//Salvar
		page.salvar();
		
		//Obter o Valor
		
		
		
	}
	
}
