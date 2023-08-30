import java.util.Scanner;

public class CalculaEscreveMaiorNumero {
    public static void main(String[] args) {
        System.out.println("====================");
        Scanner leituraScanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int Numero1 = leituraScanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int Numero2 = leituraScanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int Numero3 = leituraScanner.nextInt();
        if (Numero1 > Numero2) {
            if (Numero1 > Numero3) {
                System.out.println("O maior número é " + Numero1 + ".");
            } else {
                if (Numero2 > Numero3) {
                    System.out.println("O maior número é " + Numero2 + ".");
                } else {
                    System.out.println("O maior número é " + Numero3 + ".");
                }
            }
        } else {
            if (Numero2 > Numero3) {
                System.out.println("O maior número é " + Numero2 + ".");
            } else {
                System.out.println("O maior número é " + Numero3 + ".");
            }
        }
        leituraScanner.close();
        System.out.println("====================");
    }
}
