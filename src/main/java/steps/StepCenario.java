package steps;

import page.PageCenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

public class StepCenario {
    PageCenario page;
    public StepCenario() {
        page = new PageCenario();
    }

    @Dado("que eu esteja na página inicial do site")
    public void Login() throws Throwable {
        page.setUp();
    }

    @E("clicar na opcao Special Offer")
    public void click_SpecialOffer() throws Throwable {
        page.clickSpecialOffer();
    }

    @E("cliquei no botao See Offer")
    public void click_SeeOffer1() throws Throwable {
        page.clickSeeOffer();
    }
    @E("alterar a cor do produto de acordo com a cor informada no banco de automação")
    public void click_Color() throws Throwable {
        page.verificarCorESelecionar();
    }

    @E("cliquei no botão Add to cart1")
    public void click_AddToCart1() throws Throwable {
        page.clickCart();
    }

    @E("clicar no carrinho de compras")
    public void clicarCarrinho() throws Throwable {
        page.clicarCarrinho();
    }
    @E("pesquisar o produto clicando no ícone de lupa seguir o nome do produto do banco de automação")
    public void pesquisarProduct() throws Throwable {
        page.pesquisarProduto();
    }
    @E("selecionar produto pesquisado")
    public void selecionarProduto() throws Throwable {
        page.selecionarProduct();
    }
    @E("alterar a cor do produto para uma diferente da existente no banco de automação")
    public void alterarCor() throws Throwable {
        page.alterarCorNot();
    }

    @E("alterar a quantidade de produtos que deseja comprar")
    public void alterarQntdProducts() throws Throwable {
        page.alterarQntd();
    }
    @E("validar que a soma dos preços corresponde ao total apresentado na página de checkout")
    public void conferirSoma() throws Throwable {
        page.conferirSoma();
    }

    @Quando("clicar no botao See Offer")
    public void click_SeeOffer2() throws Throwable {
        page.clickSeeOffer();
    }
    @Quando("clicar no botão Add to cart")
    public void click_AddToCart2() throws Throwable {
        page.clickCart();
    }
    @Quando("remover o produto do carrinho de compras")
    public void removerCompra() throws Throwable {
        page.removerCompra();
    }

    @Quando("acessar a página de checkout")
    public void acessarCheckout() throws Throwable {
        page.acessarCheckout();
    }

    @Entao("valido que o carrinho de compras está vazio")
    public void verificarCarrinhoVazio() throws Throwable {
        page.verificarCarrinhoVazio();
        page.fechar_browser();
    }
    @Entao("valido que as especificações do produto de acordo com as informações retornadas do banco de automação")
    public void verificarEspecificacoes() throws Throwable {
        page.verificarEspecificacoes();

        page.fechar_browser();
    }
    @Entao("validar que produto foi adicionado ao carrinho com a cor selecionada")
    public void verificarAdicaoEColor() throws Throwable {
        //System.out.println("CHEGUEI ONDE PAM PEDIU");
        page.verificarCarrinhoColor();

        page.fechar_browser();
    }

    @Entao("realizar um update no banco de automação alterar a cor existente no banco para a cor selecionada no teste")
    public void updateBancoColor() throws Throwable {
        //System.out.println("CHEGUEI ONDE PAM PEDIU");
        page.updateBancoColor();

        page.fechar_browser();
    }


}
