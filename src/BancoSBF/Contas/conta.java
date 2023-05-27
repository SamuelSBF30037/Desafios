package BancoSBF.Contas;

public class conta {

    private String cliente;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
        public void Contas () {
        System.out.println("Agencia 0817");
    }

    protected void exibirSaldo() {
        System.out.println("Saldo: R$: " + saldo);
    }

    void sacar(double valor) {
        saldo -= valor;
        System.out.println("Debito: R$" + valor);
    }

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Credito: R$" + valor);
    }
    void transferir(conta destino, double valor) {
			this.sacar(valor);
			destino.depositar(valor);
			System.out.println("Transferir: R$" + valor);
		}
    double soma(double cc1, double cc2, double cc3) {
        double total = cc1 + cc2 + cc3;
        return total;
    }
}
