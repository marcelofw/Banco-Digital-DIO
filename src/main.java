public class main {
    public static void main(String[] args) {
        cliente Rejane = new cliente();
        Rejane.setNome("Rejane");
        conta cc = new contaCorrente(Rejane);
        conta poupanca = new contaPoupança(Rejane);
        cc.depositar(100);
        cc.transferir(poupanca, 50);
        cc.ImprimirExtrato();
        poupanca.ImprimirExtrato();
    }
}
