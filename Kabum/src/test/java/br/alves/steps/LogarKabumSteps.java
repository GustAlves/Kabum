package br.alves.steps;

import org.junit.Assert;

import br.alves.pages.LoginPage;
import br.alves.pages.MenuPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LogarKabumSteps {

	private static LoginPage page = new LoginPage();
	private static MenuPage menu = new MenuPage();

	@Dado("^acesse o site da kabum$")
	public void acesse_o_site_da_kabum() throws Throwable {
		page.acessarTelaInicial();
	}

	@Dado("^acessar Tela de Login$")
	public void acessar_Tela_de_Login() throws Throwable {
		menu.acessarTelaLogin();
	}

	@Quando("^informar o e-mail$")
	public void informar_o_e_mail() throws Throwable {
//		page.logar("teste", "teste");
		// Abordagem errada de definir um tempo de espera fixo, utilizando o método
		// abaixo mas foi o que funcionou no momento.
		Thread.sleep(1000);
		page.setEmail("EmailParaTestesDeAmbientes@gmail.com");
	}

	@Quando("^informar a senha$")
	public void informar_a_senha() throws Throwable {
		page.setSenha("33669933");
	}

	@Quando("^clicar em \"([^\"]*)\"$")
	public void clicar_em(String arg1) throws Throwable {
		page.clicarBotaoNome();
	}

	@Então("^sistema loga com os dados do usuário$")
	public void sistema_loga_com_os_dados_do_usuário() throws Throwable {
		System.out.println("Logou");
	}

	@Quando("^clicar sobre o nome do cliente$")
	public void clicar_sobre_o_nome_do_cliente() throws Throwable {
		Thread.sleep(2000);
		page.clicarNomeUsuarioLogado();
	}

	@Então("^exibe o nome do usuário \"([^\"]*)\"$")
	public void exibe_o_nome_do_usuário(String arg1) throws Throwable {
		Thread.sleep(2000);
		Assert.assertEquals("Teste Ambientes", page.validarUsuarioLogado());
	}
}
