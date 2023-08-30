import java.util.Scanner;

public class CalculaAlturasPesos {
    public static void main(String[] args) {
        Scanner leituraScanner = new Scanner(System.in);
        System.out.println("============================");
        int altura = 0;
        int peso = 0;
        int maiorAltura = -1;
        int menorAltura = 1000;
        int maiorPeso = -1;
        int menorPeso = 1000;
        boolean digiteNovamente = true;
        while (digiteNovamente) {
            while (digiteNovamente) {
                System.out.print("Digite a altura ou zero para sair: ");
                altura = leituraScanner.nextInt();
                System.out.println("\n");
                if (altura != 0) {
                    System.out.print("Informe o peso da criança: ");
                    peso = leituraScanner.nextInt();
                    System.out.println("\n");
                    if (altura > maiorAltura) {
                        maiorAltura = altura;
                    }
                    if (altura < menorAltura) {
                        menorAltura = altura;
                    }
                    if (peso > maiorPeso) {
                        maiorPeso = peso;
                    }
                    if (peso < menorPeso) {
                        menorPeso = peso;
                    }
                } else {
                    digiteNovamente = false;
                }
            }
            System.out.println("A maior altura do grupo é " + maiorAltura + ".");
            System.out.println("A menor altura do grupo é " + menorAltura + " .");
            System.out.println("O maior peso do grupo é " + maiorPeso + " .");
            System.out.println("O menor peso do grupo é " + menorPeso + " .");
            System.out.println("Fim!");
            System.out.println("============================");
            leituraScanner.close();
        }
    }
}