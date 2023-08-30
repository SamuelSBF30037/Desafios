import java.util.Scanner;
public class LendoInformacoesComScanner {
public static void main(String [] args) {
System.out.println("===================");
Scanner leituraScanner = new Scanner(System.in);
System.out.println("Digite uma Distancia: "); 
double distanciaPercorrida = leituraScanner.nextDouble();
System.out.println("A distância percorrida foi de " + distanciaPercorrida + "Km." ) ;
double tempoGasto = leituraScanner.nextDouble();
System.out.println("Diite o tempo gasto: "); 
System.out.println("O tempo gasto foi de " + tempoGasto + "horas.");
System.out.println("A Velocidade Media foi de " + distanciaPercorrida /tempoGasto  + " Km/h.");
leituraScanner.close();
System.out.println("Fim!");
System.out.println("===============================");
}
}