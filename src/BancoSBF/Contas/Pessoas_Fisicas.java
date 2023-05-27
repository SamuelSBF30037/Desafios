package BancoSBF.Contas;

public class Pessoas_Fisicas {

	public static void main(String[] args) {
			conta cc1 = new conta();
			cc1.setCliente("Samuel Fernandes");
			cc1.setSaldo(22358);
			System.out.println("Cliente: " + cc1.getCliente());
			cc1.exibirSaldo();
			cc1.sacar(800);
			cc1.exibirSaldo();
			System.out.println("---------------");
			conta cc2 = new conta();
			cc2.setCliente("Savio Fernandes");
			cc2.setSaldo(33258);
			System.out.println("Cliente: " + cc2.getCliente());
			cc2.exibirSaldo();
			cc2.depositar(100.00);
			cc2.exibirSaldo();
			System.out.println("---------------------");
			conta cc3 = new conta();
			cc3.setCliente("Raìssa Fernandes");
			cc3.setSaldo(2755);
			System.out.println("Cliente: " + cc3.getCliente());
			cc3.exibirSaldo();
			cc3.sacar(1500);
			cc3.exibirSaldo();
			System.out.println("---------------------");
			System.out.println("Transferência");
			System.out.println("Cliente: " + cc1.getCliente());
			System.out.println("Favorecido: " + cc2.getCliente());
			cc1.transferir(cc2, 3000);
			System.out.println("");
			System.out.println("Cliente: " + cc1.getCliente());
			cc1.exibirSaldo();
			System.out.println("Cliente: " + cc2.getCliente());
			cc2.exibirSaldo();
			System.out.println("---------------------");
			System.out.println("Relatório gerencial");
			conta gerente = new conta();
			double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo(), cc3.getSaldo());
			System.out.println("Saldo total nas conta: R$" +relatorio);
			

	}

}
