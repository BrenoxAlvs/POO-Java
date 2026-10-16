public class ContaBancaria {
    String titular;
    double saldo = 100;

    void depositar(double valor){
        saldo = saldo + valor;
    }
    void sacar(double valor){
        saldo = saldo - valor;
    }
}