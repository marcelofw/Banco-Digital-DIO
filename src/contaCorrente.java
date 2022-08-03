
public class contaCorrente extends conta {

    public contaCorrente (cliente cliente) {
        super(cliente);
    }

    @Override
    public void ImprimirExtrato() {
        System.out.println("===Extrato Conta Corrente===");
        super. imprimirInfosComuns();
    }



}
