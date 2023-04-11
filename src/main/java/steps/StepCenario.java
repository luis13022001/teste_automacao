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

    @E("clicar no botao See Offer")
    public void click_SeeOffer() throws Throwable {
        page.clickSeeOffer();
    }

    @E("cliquei no botão Add to cart")
    public void click_AddToCart() throws Throwable {
        page.clickCart();
    }

    @E("clicar no carrinho de compras")
    public void clicarCarrinho() throws Throwable {
        page.clicarCarrinho();
    }

    @Quando("remover o produto do carrinho de compras")
    public void removerCompra() throws Throwable {
        page.removerCompra();
    }

    @Entao("valido que o carrinho de compras está vazio")
    public void verificarCarrinhoVazio() throws Throwable {
        page.verificarCarrinhoVazio();
        page.fechar_browser();
    }


}
