import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Conta> contas = new ArrayList<>();

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
