
public class contaPoupança extends conta {

    public contaPoupança (cliente cliente) {
        super(cliente);
    }
    @Override
    public void ImprimirExtrato() {
        System.out.println("===Extrato Conta Poupanca===");
        super. imprimirInfosComuns();
    }
}