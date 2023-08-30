import java.util.Scanner;

public class CalculaMediaAlturas {
    public static void main(String[] args) {
        Scanner leituraScanner = new Scanner(System.in);
        System.out.println("============================");
        int altura = 0;
        int somaAlturas = 0;
        int numeroAlunos = 0;
        boolean digiteNovamente = true;
        while (digiteNovamente) {
            System.out.print("Digite a altura ou zero para sair: ");
            altura = leituraScanner.nextInt();
            System.out.println("\n");
            if (altura != 0) {
                somaAlturas += altura;
                numeroAlunos += 1;
            } else {
                digiteNovamente = false;
            }
        }
        if (numeroAlunos > 0) {
            double alturaMedia = somaAlturas / numeroAlunos;
            System.out.println("A altura média é " + alturaMedia + " .");
        }
        System.out.println("Fim!");
        System.out.println("============================");
        leituraScanner.close();
    }
}