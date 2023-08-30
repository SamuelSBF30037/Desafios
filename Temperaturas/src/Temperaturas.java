import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Scanner leituraScanner = new Scanner(System.in);
        System.out.println("=======");
        double temperaturaC;
        double temperaturaF;
        boolean digiteNovamente = true;
        while (digiteNovamente) {
            System.out.print("Informe a temperatura em graus Celsius ou zero para sair: ");
            temperaturaC = leituraScanner.nextDouble();
            System.out.println("\n");
            if (temperaturaC == 0) {
                digiteNovamente = false;
            } else {
                temperaturaF = (temperaturaC * 9 / 5) + 32;
                System.out.println(temperaturaC + " °C correspondem a " + temperaturaF + " graus Fahrenheit.");
            }
        }
        System.out.println("Fim!");
        System.out.println("----");
        leituraScanner.close();
    }
}