import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private static List<Conta> contas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static List<Conta> getContas() {
		return contas;
	}

	public static void setContas(List<Conta> contas) {
		Banco.contas = contas;
	}

	public static void adicionarConta(Conta conta){
		contas.add(conta);
	}
	
	public static void obterListaDeContas(){
		for(Conta conta : contas){
		conta.imprimirContas();
	}
}

}
