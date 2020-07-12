package br.ce.lnares.appium.test;

import org.junit.Test;

import br.ce.lnares.appium.core.BaseTest;
import br.ce.lnares.appium.page.TasksPage;

public class TasksTeste extends BaseTest {
	
	TasksPage add = new TasksPage();
	
	@Test
	public void adicionarListaTarefas() {
		add.swipeEsquerdaParaDireita();
	}

}
