package iPhoneConfigs;

import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class IphoneConfigurações implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{



	@Override
	public void exibirPagina(String url) {
		System.out.println("Abrindo pagina no navegador " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrir nova aba no navegador");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina no navegador");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligar via aparelho telefonico para " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atender aparelho telefonico");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz via aparelho telefonico");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica no reprodutor musical");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica no reprodutor musical");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando musica no reprodutor musical " + musica );
		
	}

	

}
