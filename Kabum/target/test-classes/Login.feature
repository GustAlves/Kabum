#language :pt
Funcionalidade: Logar na Kabum
  
  - Com a linguagem de programação que preferir, crie um teste automatizado realizando login na https://kabum.com.br e validando o usuário logado. - Utilize Selenium. 
  - Escreva no formato Gherkin. 
  - Suba o código no github/bitbucket/gitlab(onde preferir) detalhando os recursos utilizados no teste e como rodar o mesmo, dentro do Readme.
  
  Como um usuário
  Eu quero logar no site da Kabum
  Para navegar pelo site e realizar minhas compras

  Cenario: Deve logar no site
    Dado acesse o site da kabum
    E acessar Tela de Login
    Quando informar o e-mail
    E informar a senha
    E clicar em "Entre"
    Então sistema loga com os dados do usuário
    Quando clicar sobre o nome do cliente
    Então exibe o nome do usuário "Teste Ambientes"
