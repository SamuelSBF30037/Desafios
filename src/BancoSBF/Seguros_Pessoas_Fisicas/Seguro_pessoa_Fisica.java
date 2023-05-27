package BancoSBF.Seguros_Pessoas_Fisicas;

import BancoSBF.Contas.conta;

public class Seguro_pessoa_Fisica extends conta {

	public static void main(String[] args) {
		Seguro_pessoa_Fisica cc4 = new Seguro_pessoa_Fisica();
		cc4.setCliente("Ana Lucia Paes");
		cc4.setSaldo(33.2580);
		System.out.println("Cliente: " + cc4.getCliente());
		cc4.exibirSaldo();

	}

}