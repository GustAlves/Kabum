package br.alves.pages;

import static br.alves.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.alves.core.BasePage;

public class LoginPage extends BasePage {

	public void acessarTelaInicial() {
		getDriver().get("https://kabum.com.br/");
	}

	public void setEmail(String email) {
		escrever("textfield12", email);
	}

	public void setSenha(String senha) {
		escrever("textfield15", senha);
	}

	public void entrar() {
		clicarBotaoPorTexto("ENTRE");
	}

	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		entrar();
	}

	public void clicarBotao(By by) {
		getDriver().findElement(by).click();
	}

	public void clicarBotaoPorTexto(String texto) {
		clicarBotao(By.xpath("//input[.='" + texto + "']"));
	}
}
