package br.alves.core;

import static br.alves.core.DriverFactory.getDriver;


import org.openqa.selenium.By;

public class BasePage {
	
	public void escrever(By by, String texto) {
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}

	public void escrever(String id_campo, String texto) {
		escrever(By.id(id_campo), texto);
	}

	public void clicarLink(String link) {
		getDriver().findElement(By.linkText(link)).click();
	}

	public void clicarBotaoNome() {
		getDriver().findElement(By.xpath("//input[@name = 'login'][@type = 'image']")).click();
	}

	public void clicarNomeUsuarioLogado() {
		getDriver().findElement(By.xpath("//*[@id='li-login-usuario']/a")).click();
	}

	public String validarUsuarioLogado() {
		return getDriver().findElement(By.xpath("//div[@class = 'profile-box__name']")).getText();
	}

	public void clicarBotaoPorTexto(String texto) {
		getDriver().findElement(By.xpath("//input[.='" + texto + "']"));
	}
}
