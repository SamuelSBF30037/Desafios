public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("===============================");
        boolean usuarioVIP = true;
        boolean comprasAltoValor = true;
        boolean menorDeIdade = true;
        boolean temBebidaAlcoolicaNoCarrinho = true;
        System.out.println("Usuário é VIP? " + usuarioVIP);
        System.out.println("A compra tem um alto valor? " + comprasAltoValor);
        System.out.println("Cliente é menor de idade? " + menorDeIdade);
        System.out.println("Tem bebida alcoólica no carrinho? "
                + temBebidaAlcoolicaNoCarrinho);
        System.out.println("===============================");
        boolean aplicarDesconto = usuarioVIP && comprasAltoValor;
        System.out.println("O desconto deve ser aplicado? "
                + "(usuarioVIP && comprasAltoValor): " + aplicarDesconto);
        aplicarDesconto = usuarioVIP || comprasAltoValor;
        System.out.println("O desconto deve ser aplicado? "
                + "(usuarioVIP || comprasAltoValor): " + aplicarDesconto);
        boolean permiteConcluirCompra = !menorDeIdade || !temBebidaAlcoolicaNoCarrinho;
        System.out.println("Pode concluir compra? "
                + "(!menorDeIdade || ! temBebidaAlcoolicaNoCarrinho): " + permiteConcluirCompra);
        System.out.println("Fim!");
        System.out.println("===============================");
    }
}