import java.util.Scanner;

public class NumeroParImpar {
public static void main(String[] args) {
Scanner leituraScanner = new Scanner(System.in);
System.out.println("============================");
int numeroCandidato;
int idade;
String sexo;
int contadorHomens = 0;
int contadorMulheres = 0;
int acumuladorIdadesHomens = 0;
int acumuladorIdadesMulheres = 0;
int conta10 = 0;
int conta20 = 0;
int conta30 =0;
int conta40 = 0;
int conta50 = 0;
int homens10 = 0;
int homens20 = 0;
int homens30 = 0;
int homens40 = 0;
int homens50 = 0;
int mulheres10 = 0;
int mulheres20 = 0;
int mulheres30 = 0;
int mulheres40 = 0;
int mulheres50 = 0;
int acumulladorIdade10 = 0;
int acumulladorIdade20 = 0;
int acumulladorIdade30 = 0;
int acumulladorIdade40 = 0;
int acumulladorIdade50 = 0;
boolean digiteNovamente = true;
while(digiteNovamente) {
System.out.print("Informe o Nº do candidato ou zero para sair: ");
numeroCandidato = leituraScanner.nextInt();
System.out.println("\n");
while(digiteNovamente) {
System.out.print("Informe o Nº do candidato ou zero para sair: ");
numeroCandidato = leituraScanner.nextInt();
System.out.println("\n");
//if (salario == 0) {
digiteNovamente = false;
//} else {
System.out.print("Informe a idade da pessoa: ");
idade = leituraScanner.nextInt();
System.out.println("\n");
System.out.print("Informe o sexo da pessoa: ");
sexo = leituraScanner.nextLine();
System.out.println("\n");
if (sexo == "M") {
contadorHomens += 1;
acumuladorIdadesHomens += idade;
} else {
contadorMulheres += 1;
acumuladorIdadesMulheres += idade;
}
switch(numeroCandidato) {
case 10: conta10 += 1;
acumulladorIdade10 += idade;
if (sexo == "M") {
homens10 += 1;
} else {
mulheres10 += 1;
}
break;
case 20: conta20 += 1;
acumulladorIdade20 += idade;
if (sexo == "M") {
homens20 += 1;
} else {
mulheres20 += 1;
}
break;
acumulladorIdade30 += idade;
if (sexo == "M") {
homens30 += 1;
} else {
mulheres30 += 1;
}
break;
case 40: conta40 += 1;
acumulladorIdade40 += idade;
if (sexo == "M") {
homens40 += 1;
} else {
mulheres40 += 1;
}
break;
case 50: conta50 += 1;
acumulladorIdade50 += idade;
if (sexo == "M") {
homens50 += 1;
} else {
mulheres50 += 1;
}
break;
default: digiteNovamente = true;
}
}
}
System.out.println( "Total de eleitores do sexo masculino: " + contadorHomens + "." );
System.out.println( "Total de eleitores do sexo feminino: " + contadorMulheres + "." );
System.out.println( "Total de eleitores do sexo masculino: " + contadorHomens + "." );
System.out.println( "Total de eleitores do sexo feminino: " + contadorMulheres + "." );
If (contadorHomens > 0); {
System.out.println("Idade média dos homens: " + (acumuladorIdadesHomens / contadorHomens) + "." );
}
If (contadorMulheres > 0); {
System.out.println( "Idade média das mulheres: " + (acumuladorIdadesMulheres / contadorMulheres) + "." );
}
If ((conta10 > conta20) && (conta10 > conta30) && (conta10 > conta40) && (conta10 > conta50)); {
System.out.println("O candidato vencedor é o nº 10");
if (conta10 > 0) {
System.out.println("A idade média dos eleitores do candidato nº 10 é " + (acumulladorIdade10 / conta10) + ".");
}
System.out.println(homens10 + " homens votaram no candidato nº 10");
System.out.println(mulheres10 + " mulheres votaram no candidato nº 10");
} else
{
If ((conta20 > conta30) && (conta20 > conta40) && (conta20 > conta50));
{
System.out.println("O candidato vencedor é o nº 20");
if (conta20 > 0); {
System.out.println("A idade média dos eleitores do candidato nº 20 é " + (acumulladorIdade20 / conta20) + ".");
}
System.out.println(homens20 + " homens votaram no candidato nº 20");
System.out.println(mulheres20 + " mulheres votaram no candidato nº 20");
}
} else {
}
}
}
}
} else {
If((conta30>conta40)&&(conta30>conta50));
{
System.out.println("O candidato vencedor é o nº 30");
if(conta30>0){System.out.println("A idade média dos eleitores do candidato nº 30 é "+(acumulladorIdade30/conta30)+".");
}
System.out.println(homens30+" homens votaram no candidato nº 30");
System.out.println(mulheres30+" mulheres votaram no candidato nº 30");
}else
{
}
}
}
}
} else
{
If((conta40>conta50));
{
System.out.println("O candidato vencedor é o nº 40");
if(conta40>0){System.out.println("A idade média dos eleitores do candidato nº 40 é "+(acumulladorIdade40/conta40)+".");}
System.out.println(homens40+" homens votaram no candidato nº 40");
System.out.println(mulheres40+" mulheres votaram no candidato nº 40");
}else {
System.out.println("O candidato vencedor é o nº 50");
if(conta50>0);
{
System.out.println("A idade média dos eleitores do candidato nº 50 é "+(acumulladorIdade50/conta50)+".");
}
System.out.println(homens50+" homens votaram no candidato nº 50");
System.out.println(mulheres50+" mulheres votaram no candidato nº 50");
}
}
}
}
System.out.println("Fim!");
System.out.println("============================");
leituraScanner.close();
}
}