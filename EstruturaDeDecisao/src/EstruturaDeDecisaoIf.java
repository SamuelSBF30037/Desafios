import java.util.Scanner;

public class EstruturaDeDecisaoIf {
    public static void main(String[] args) {
        Scanner leituraScanner = new Scanner(System.in);
        System.out.println("============================");
        System.out.print("Informe o preço do produto: ");
        double precoProduto = leituraScanner.nextDouble();
        boolean produtoAltoValor = precoProduto >= 100;
        double percentualDesconto = 0.0;
        if (produtoAltoValor) {
            percentualDesconto = 5.0;
        } else {
            System.out.println("Não será aplicado desconto algum.");
        }
        double desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - desconto;
        System.out.println("O produto sairá por R$ " + precoComDesconto + ".");
        System.out.println("Fim!");
        System.out.println("============================");
        leituraScanner.close();
    }
}