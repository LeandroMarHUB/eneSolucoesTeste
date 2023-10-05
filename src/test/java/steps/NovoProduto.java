package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;

public class NovoProduto extends RunCucumberTest{

    HomePage homePage = new HomePage(driver);
    @Dado("^que eu esteja no site da Amazon")
    public void acessar_o_site(){
        homePage.acessarSite();


    }

    @Quando("^na barra de pesquisa digito um novo produto$")
    public void na_barra_de_pesquisa_digito_um_novo_produto() throws Throwable {

    }

    @Quando("^escolho um smartphone$")
    public void escolho_um_smartphone() throws Throwable {

    }

    @Quando("^abre uma nova pagina onde disponibiliza o mesmo botão de Adicionar ao carinho$")
    public void abre_uma_nova_pagina_onde_disponibiliza_o_mesmo_botão_de_Adicionar_ao_carinho() throws Throwable {

    }

    @Então("^consigo visualizar os meus produtos no carrinho$")
    public void consigo_visualizar_os_meus_produtos_no_carrinho() throws Throwable {

    }


}


