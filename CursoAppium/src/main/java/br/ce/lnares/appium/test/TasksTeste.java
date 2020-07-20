package br.ce.lnares.appium.test;

import org.junit.Test;

import br.ce.lnares.appium.core.BaseTest;
import br.ce.lnares.appium.page.TasksPage;

public class TasksTeste extends BaseTest {
	
	TasksPage add = new TasksPage();
	
	@Test
	public void adicionarListaTarefas() throws InterruptedException {
		add.clicarNovaLista();
		add.inserirNomeNovaLista("Tarefas dia 20/07/2020");
		add.clicarSave();
		add.adicinarListaDeTarefas();
	}

}
