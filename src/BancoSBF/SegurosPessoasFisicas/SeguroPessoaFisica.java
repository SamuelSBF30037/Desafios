package BancoSBF.SegurosPessoasFisicas;

import BancoSBF.Contas.Conta;

public class SeguroPessoaFisica extends Conta {

	public static void main(String[] args) {
		SeguroPessoaFisica cc4 = new SeguroPessoaFisica();
		cc4.setCliente("Ana Lucia Paes");
		cc4.setSaldo(33.2580);
		System.out.println("Cliente: " + cc4.getCliente());
		cc4.exibirSaldo();

	}

}