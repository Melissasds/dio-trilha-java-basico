public class Main {
    public static void main(String[] args){
        System.out.println("Bem vindo ao Banco Digital MS");
        Cliente melissa = new Cliente();
        melissa.setNome("Melissa");

        Conta cc = new ContaCorrente(melissa);
        Conta poupanca = new ContaPoupanca(melissa);

        Banco.adicionarConta(cc);
        Banco.adicionarConta(poupanca);

        cc.depositar(100);
        cc.transferir(50, poupanca);
        cc.imprimirExtrato();
       // poupanca.imprimirExtrato();
        
        System.out.println("===LISTA DE CONTAS===");
        Banco.obterListaDeContas();
        

    }
}
