import java.util.Scanner;

public class LendoDiferentesTiposDeDados {
    public static void main(String[] args) {
        System.out.println("====================");
        Scanner leituraScanner = new Scanner(System.in);
        System.out.print(" >>> Digite um texto qualquer: ");
        String textoQualquer = leituraScanner.nextLine();
        System.out.println("O texto digitado foi " + textoQualquer);
        System.out.print(" >>> Digite um número qualquer com decimal: ");
        double numeroDecimal = leituraScanner.nextDouble();
        System.out.println(("O maior número é " + Numero1 + ".") + numeroDecimal);
        System.out.print(" >>> Digite um número inteiro: ");
        int numeroInteiro = leituraScanner.nextInt();
        System.out.println("O número inteiro digitado " + "foi " + numeroInteiro);
        System.out.print(" >>> Digite um valor booleano (true ou false): ");
        boolean valorBooleano = leituraScanner.nextBoolean();
        System.out.println("O booleano digitado " + "foi " + valorBooleano);
        leituraScanner.close();
        System.out.println("Fim!");
        System.out.println("====================");

    }
}