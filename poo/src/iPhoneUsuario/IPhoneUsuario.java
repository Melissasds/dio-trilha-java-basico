package iPhoneUsuario;

import iPhone.Iphone;

public class IPhoneUsuario {
	public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // ReprodutorMusical
        meuIphone.selecionarMusica("Break Free");
        meuIphone.tocar();
        meuIphone.pausar();
        

        // AparelhoTelefonico       
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        meuIphone.ligar("878763545");

        // NavegadorInternet
        meuIphone.adicionarNovaAba();
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.atualizarPagina();
    }
}


