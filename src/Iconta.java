public interface Iconta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(conta contaDestino, double valor);
    void ImprimirExtrato();
}
