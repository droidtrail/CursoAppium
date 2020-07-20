package br.ce.lnares.appium.page;

import org.openqa.selenium.By;

import br.ce.lnares.appium.core.BasePage;
import br.ce.lnares.appium.core.BaseTest;
import io.appium.java_client.MobileBy;

public class TasksPage extends BasePage {

	BaseTest base = new BaseTest();

	public void clicarNovaLista() {
		clicar(MobileBy.AccessibilityId("Open"));
		clicar(By.id("com.tasks.android:id/design_menu_item_text"));
	}

	public void inserirNomeNovaLista(String nomeNovaLista) {
		escrever(By.id("com.tasks.android:id/task_list_name"), nomeNovaLista);
	}

	public void clicarSave() {
		clicarPorTexto("SAVE");
	}

	public void adicinarListaDeTarefas() throws InterruptedException {

		// Stand-up meeting
		clicar(By.id("com.tasks.android:id/action_add_task"));
		escrever(By.id("com.tasks.android:id/task_title"), "Stand-up meeting");
		escrever(By.id("com.tasks.android:id/notes"), "9:00 às 9:15");
		clicar(By.id("com.tasks.android:id/fab"));
		base.esperar(3000);
		clicar(By.id("com.tasks.android:id/action_add_task"));
		// Executar CTs de 10 a 17
		escrever(By.id("com.tasks.android:id/task_title"), "Executar CTs de 10 a 17");
		escrever(By.id("com.tasks.android:id/notes"), "9:15 às 12:30");
		clicar(By.id("com.tasks.android:id/fab"));
		base.esperar(3000);
		clicar(By.id("com.tasks.android:id/action_add_task"));
		// Executar CTs de 18 a 28
		escrever(By.id("com.tasks.android:id/task_title"), "Executar CTs de 18 a 28");
		escrever(By.id("com.tasks.android:id/notes"), "13:30 às 17:30");
		clicar(By.id("com.tasks.android:id/fab"));
		base.esperar(3000);
		clicar(By.id("com.tasks.android:id/action_add_task"));
		// Status Report dos Testes
		escrever(By.id("com.tasks.android:id/task_title"), "Status Report dos Testes");
		escrever(By.id("com.tasks.android:id/notes"), "17:30 às 17:45");
		clicar(MobileBy.id("com.tasks.android:id/priority_icon"));
		clicar(MobileBy.id("android:id/text1"));
		clicar(MobileBy.id("com.tasks.android:id/highlight"));
		clicar(By.id("com.tasks.android:id/fab"));
		base.esperar(3000);
		clicar(By.id("com.tasks.android:id/action_add_task"));
		// Check point diário
		escrever(By.id("com.tasks.android:id/task_title"), "Check point diário");
		escrever(By.id("com.tasks.android:id/notes"), "17:45 às 18:00");
		clicar(By.id("com.tasks.android:id/fab"));
		base.esperar(3000);
		clicar(By.id("com.tasks.android:id/action_add_task"));
		// Reunião gerente de T.I
		escrever(By.id("com.tasks.android:id/task_title"), "Reunião Gerência de T.I");
		escrever(By.id("com.tasks.android:id/notes"), "18:00 às 18:30");
		clicar(By.id("com.tasks.android:id/fab"));
		base.esperar(3000);
		// Reunião gerente de T.I CANCELADA
		clicar(MobileBy.id("com.tasks.android:id/complete"));
		clicar(MobileBy.id("com.tasks.android:id/task_info"));
		escrever(By.id("com.tasks.android:id/task_title"), "Reunião CANCELADA");
		base.esperar(2000);
		clicar(MobileBy.id("com.tasks.android:id/action_delete_task"));

	}

}
