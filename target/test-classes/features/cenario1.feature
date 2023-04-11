#language: pt
#enconding: utf-8


Funcionalidade: Remover produto do carrinho de compras

  @CT001_ValidacaoEspecificacoes @Geral
  Cenário: Validar que as especificações do produto de acordo com as informações retornadas do banco de automação
    Dado que eu esteja na página inicial do site
    E clicar na opcao Special Offer
    E clicar no botao See Offer
    E cliquei no botão Add to cart
    Quando clicar no carrinho de compras
    E remover o produto do carrinho de compras
    Entao valido que o carrinho de compras está vazio