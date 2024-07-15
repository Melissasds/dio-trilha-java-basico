import java.util.Scanner;

public class Contador {
    public static void main(final String[] args) {
            @SuppressWarnings("resource")
            final
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            final int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            final int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (final ParametrosInvalidosException exception) {
            		//imprime a mensagem da exceção
            		System.out.println("O segundo parâmetro deve ser MAIOR e DIFERENTE que o primeiro!");
		}
		
	}
	static void contar(final int parametroUm, final int parametroDois ) throws ParametrosInvalidosException {
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            if (parametroUm >= parametroDois){
                throw new ParametrosInvalidosException();
        }
		
		final int contagem = parametroDois - parametroUm;
	    //imprime os números com base na variável contagem
            for (int i =  1; i <= contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }
	} 
}
