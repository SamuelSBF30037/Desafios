import java.util.Scanner;

public class OrigemDestino {
public static void main (String[] args) {
Scanner leituraScanner = new Scanner(System.in);
int veiculo;
int origem;
int destino;
int bH = 0;
int automoveis = 0;
int caminhoes = 0;
int onibus = 0;
System.out.println("============================");
boolean digiteNovamente = true;
while(digiteNovamente) {
System.out.print("Informe o tipo do veículo ou zero para sair: ");
veiculo = leituraScanner.nextint();
System.out.println("\n");
while(digiteNovamente) {
System.out.print("Informe o tipo do veículo ou zero para sair: ");
veiculo = leituraScanner.nextint();
System.out.println("\n");
System.out.print("Informe a origem ou zero para sair: ");
origem = leituraScanner.nextint();
System.out.println("\n");
System.out.print("Informe o destino ou zero para sair: ");
destino = leituraScanner.nextint();
System.out.println("\n");
if ((veiculo == 0) && (origem == 0) && (destino == 0)) {
digiteNovamente = false;
}
if (origem == 1) {
bH += 1;
}
switch(veiculo) {
case 1: automoveis += 1;
case 2: caminhoes += 1;
case 3: onibus += 1;
default: digiteNovamente = true;
}
}
System.out.println("Veículos procedentes de Belo Horizonte: " + bH + ".");
if(automoveis>0) {
int[] automoveis2= new int[automoveis];
int i = 0;
digiteNovamente = true;
while(digiteNovamente) {
System.out.print("Informe o tipo do veículo ou zero para sair: ");
veiculo = leituraScanner.nextint();
System.out.println("\n");
System.out.print("Informe a origem ou zero para sair: ");
origem = leituraScanner.nextint();
System.out.println("\n");
System.out.print("Informe o destino ou zero para sair: ");
destino = leituraScanner.nextint();
System.out.println("\n");
if ((veiculo == 0) && (origem == 0) && (destino == 0)) {
digiteNovamente = false;
}
if ((veiculo == 1)) {
automoveis2[i,0] = origem;
automoveis2[i,1] = destino;
i += 1;
}
}
System.out.println("Automóveis – Origem/Destino");
System.out.println("Automóveis – Origem/Destino");
for (int i = 0; i < automoveis; i++) {
System.out.print(automoveis2[i,0] + " – " + automoveis2[i,1]);
}
}
if(caminhoes>0) {
int[] caminhoes2= new int[caminhoes];
int i = 0;
digiteNovamente = true;
while(digiteNovamente) {
System.out.print("Informe o tipo do veículo ou zero para sair: ");
veiculo = leituraScanner.nextint();
System.out.println("\n");
System.out.print("Informe a origem ou zero para sair: ");
origem = leituraScanner.nextint();
System.out.println("\n");
System.out.print("Informe o destino ou zero para sair: ");
destino = leituraScanner.nextint();
System.out.println("\n");
if ((veiculo == 0) && (origem == 0) && (destino == 0)) {
digiteNovamente = false;
}
if ((veiculo == 2)) {
caminhoes2[i,0] = origem;
caminhoes2[i,1] = destino;
i += 1;
}
}
System.out.println("caminhoes – Origem/Destino");
for (int i = 0; i < caminhoes; i++) {
System.out.print(caminhoes2[i,0] + " – " + caminhoes2[i,1]);
}
}
if(onibus>0) {
int[] onibus2= new int[onibus];
int i = 0;
digiteNovamente = true;
while(digiteNovamente) {
System.out.print("Informe o tipo do veículo ou zero para sair: ");
veiculo = leituraScanner.nextint();
System.out.println("\n");
System.out.print("Informe a origem ou zero para sair: ");
origem = leituraScanner.nextint();
System.out.println("\n");
System.out.print("Informe o destino ou zero para sair: ");
destino = leituraScanner.nextint();
System.out.println("\n");
if ((veiculo == 0) && (origem == 0) && (destino == 0)) {
digiteNovamente = false;
}
if ((veiculo == 0) && (origem == 0) && (destino == 0)) {
digiteNovamente = false;
}
if ((veiculo == 3)) {
onibus2[i,0] = origem;
onibus2 [i,1] = destino;
i += 1;
}
}
System.out.println("Ônibus – Origem/Destino");
for (int i = 0; i < onibus; i++) {
System.out.print(onibus2[i,0] + " – " + onibus2[i,1]);
}
System.out.println("Ônibus de Brasília Para Petrópolis ou Barbacena");
for (int i = 0; i < onibus; i++) {
if(onibus2[i,0] = 4) {
if((onibus2[i,1] = 2) || (onibus2[i,1] = 4)){
System.out.print(onibus2[i,0] + " – " + onibus2[i,1]);
}
}
}
}
System.out.println("============================");
leituraScanner.close();
System.out.println("Fim!");
}
}
}
