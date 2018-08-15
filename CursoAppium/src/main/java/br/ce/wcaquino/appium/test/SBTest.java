package br.ce.wcaquino.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ce.wcaquino.appium.core.BaseTest;
import br.ce.wcaquino.appium.page.MenuPage;
import br.ce.wcaquino.appium.page.seuBarriga.SBContasPage;
import br.ce.wcaquino.appium.page.seuBarriga.SBHomePage;
import br.ce.wcaquino.appium.page.seuBarriga.SBLoginPage;
import br.ce.wcaquino.appium.page.seuBarriga.SBMenuPage;
import br.ce.wcaquino.appium.page.seuBarriga.SBMovimentacaoPage;
import br.ce.wcaquino.appium.page.seuBarriga.SBResumoPage;

public class SBTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private SBLoginPage page = new SBLoginPage();
	private SBMenuPage menuSB = new SBMenuPage();
	private SBContasPage contas = new SBContasPage();
	private SBMovimentacaoPage mov = new SBMovimentacaoPage();
	private SBHomePage home = new SBHomePage();
	private SBResumoPage resumo = new SBResumoPage();

	@Before
	public void setup() {

		menu.acessarSBNativo();
		page.setEmail("xpro@gmail.com");
		page.setSenha("1");
		page.entrar();

	}

	@Test
	public void deveInserirContaComSucesso() {

		// Entrar em contas
		menuSB.acessarContas();

		// Digitar nome da conta
		contas.setConta("Conta de Teste");

		// Salvar
		contas.salvar();

		// Verificar Mensagem
		Assert.assertTrue(contas.existeElementoPorTexto("Conta adicionada com sucesso"));

	}

	@Test
	public void deveExcluirConta() {
		// Entrar em contas
		menuSB.acessarContas();

		// Clique Longo na Conta
		contas.selecionarConta("123");

		// Excluir
		contas.excluir();

		// Verificar Mensagem
		Assert.assertTrue(contas.existeElementoPorTexto("Conta exclu�da com sucesso"));

	}

	@Test
	public void deveValidarInclusaoMov() {

		menuSB.acessarMovimentacoes();

		// Validar Descri��o
		mov.salvar();
		Assert.assertTrue(mov.existeElementoPorTexto("Descri��o � um campo obrigat�rio"));

		// Validar Interessado
		mov.setDescricao("Desc");
		mov.salvar();
		Assert.assertTrue(mov.existeElementoPorTexto("Interessado � um campo obrigat�rio"));

		// Validar Valor
		mov.setInteressado("Interessado");
		mov.salvar();
		Assert.assertTrue(mov.existeElementoPorTexto("Valor � um campo obrigat�rio"));

		// Validar Conta
		mov.setValor("123");
		mov.salvar();
		Assert.assertTrue(mov.existeElementoPorTexto("Conta � um campo obrigat�rio"));

		// Inserir com sucesso
		mov.setConta("Conta para alterar");
		mov.salvar();
		Assert.assertTrue(mov.existeElementoPorTexto("Movimenta��o cadastrada com sucesso"));

	}

	@Test
	public void deveAtualizarSaldoAoExcluirMovimentacao() throws InterruptedException {

		// Verificar saldo "Conta para saldo" = 534.00
		Assert.assertEquals("534.00", home.obterSaldoConta("Conta para saldo"));

		// Ir para RESUMO
		menuSB.acessarResumo();

		// Excluir Movimenta��o 3
		resumo.excluirMovimentacao("Movimentacao 3, calculo saldo");

		// Validar Mensagem: "Movimenta��o removida com sucesso!"
		Assert.assertTrue(resumo.existeElementoPorTexto("Movimenta��o removida com sucesso!"));

		// Voltar para HOME
		menuSB.acessarHome();

		// Atualizar Saldos
		Thread.sleep(1000);
		home.scroll(0.2, 0.9);

		// Verificar saldo = -1000,00
		Assert.assertEquals("-1000.00", home.obterSaldoConta("Conta para saldo"));

	}

}
