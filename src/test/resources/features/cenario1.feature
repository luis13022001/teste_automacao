#language: pt
#enconding: utf-8


Funcionalidade: Remover produto do carrinho de compras

  @CT001_ValidacaoEspecificacoes @Geral
  Cenário: Validar que as especificações do produto de acordo com as informações retornadas do banco de automação
    Dado que eu esteja na página inicial do site
    E clicar na opcao Special Offer
    E clicar no botao See Offer
    E cliquei no botão Add to cart
    E clicar no carrinho de compras
    Quando remover o produto do carrinho de compras
    Entao valido que o carrinho de compras está vazio

  @CT002_ValidacaoEspecificacoes @Geral
  Cenário: Validar que as especificações do produto de acordo com as informações retornadas do banco de automação
    Dado que eu esteja na página inicial do site
    E clicar na opcao Special Offer
    Quando clicar no botao See Offer
    Entao valido que as especificações do produto de acordo com as informações retornadas do banco de automação


  @CT003_ValidacaoEspecificacoes @Geral
  Cenário: Validar que as especificações do produto de acordo com as informações retornadas do banco de automação
    Dado que eu esteja na página inicial do site
    E clicar na opcao Special Offer
    E clicar no botao See Offer
    E alterar a cor do produto de acordo com a cor informada no banco de automação
    Quando clicar no botão Add to cart
    Entao validar que produto foi adicionado ao carrinho com a cor selecionada

  @CT004_ValidacaoEspecificacoes @Geral
  Cenário: Validar que as especificações do produto de acordo com as informações retornadas do banco de automação
    Dado que eu esteja na página inicial do site
    E pesquisa o produto clicando no ícone de lupa (Seguir o nome do produto do banco de automação
    E selecionar produto pesquisado
    E alterar a cor do produto para uma diferente da existente no banco de automação
    E alterar a quantidade de produtos que deseja comprar
    E clicar no botão “Add to cart”
    Quando acessar a página de checkout
    E validar que a soma dos preços corresponde ao total apresentado na página de checkout
    Entao realizar um update no banco de automação alterar a cor existente no banco para a cor selecionada no teste.