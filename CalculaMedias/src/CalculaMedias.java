import java.util.Scanner;

public class CalculaMedias {
    public static void main(String[] args) {
        Scanner leituraScanner = new Scanner(System.in);
        System.out.println("============================");
        int altura = 0;
        String sexo;
        int maiorAltura = -1;
        String sexoMaiorAltura = "";
        int menorAltura = 1000;
        String sexoMenorAltura = "";
        int contadorMeninos = 0;
        int contadorMeninas = 0;
        int acumuladorAlturasMeninos = 0;
        int acumuladorAlturasMeninas = 0;
        int mediaAlturasMeninos = 0;
        int mediaAlturasMeninas = 0;
        boolean digiteNovamente = true;
        while (digiteNovamente) {
            System.out.print("Digite a altura ou zero para sair: ");
            altura = leituraScanner.nextInt();
            System.out.println("\n");
            if (altura == 0) {
                digiteNovamente = false;
            } else {
                System.out.print("Informe o sexo da criança (M ou F): ");
                sexo = leituraScanner.next();
                System.out.println("\n");
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                    sexoMaiorAltura = sexo;
                }
                if (altura < menorAltura) {
                    menorAltura = altura;
                    sexoMenorAltura = sexo;
                }
                if (sexo.equals("m") || sexo.equals("M")) {
                contadorMeninos += 1;
                    acumuladorAlturasMeninos += altura;
                } else {
                    contadorMeninas += 1;
                    acumuladorAlturasMeninas += altura;
                }
            }
        }
        System.out.println("Sexo e altura da pessoa mais alta: " + sexoMaiorAltura + " – " + maiorAltura + ".");
        System.out.println("Sexo e altura da pessoa mais baixa: " + sexoMenorAltura + " – " + menorAltura + ".");
        if (contadorMeninos > 0) {
            mediaAlturasMeninos = acumuladorAlturasMeninos / contadorMeninos;
            System.out.println("A média das alturas dos meninos é " +
                    mediaAlturasMeninos + " .");
        }
        if (contadorMeninas > 0) {
            mediaAlturasMeninas = acumuladorAlturasMeninas / contadorMeninas;
            System.out.println("A média das alturas das meninas é " +
                    mediaAlturasMeninas + " .");
        }
        System.out.println("Fim!");
        System.out.println("============================");
        leituraScanner.close();
    }
}