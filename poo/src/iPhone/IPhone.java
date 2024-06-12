package iPhone;

import iPhoneConfigs.IphoneConfigurações;

public class IPhone {
	public static void main(String[] args) {
        IphoneConfigurações meuIphone = new IphoneConfigurações();

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


