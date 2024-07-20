public class Main {
    public static void main(String[] args){
        System.out.println("\n    Bem vindo ao Banco Digital Mylis!   \n");
        Cliente melissa = new Cliente();
        melissa.setNome("Melissa");

        Conta cc = new ContaCorrente(melissa);
        Conta poupanca = new ContaPoupanca(melissa);

        Banco.adicionarConta(cc);
        Banco.adicionarConta(poupanca);

        cc.depositar(100);
        cc.transferir(60, poupanca);
        cc.sacar(5);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        
        System.out.println("\n\n===== LISTA DE CONTAS ATIVAS NO SEU NOME =====");
        Banco.obterListaDeContas();
        

    }
}
