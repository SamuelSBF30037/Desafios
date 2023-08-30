import java.util.Scanner;

public class CalculaIdadesSexos {
    public static void main(String[] args) {
        Scanner leituraScanner = new Scanner(System.in);
        System.out.println("============================");
        int idade = 0;
        String sexo;
        int meninos = 0;
        int meninas = 0;
        int totalIdadesMeninos = 0;
        int totalIdadesMeninas = 0;
        double idadeMediaMeninos = 0;
        double idadeMediaMeninas = 0;
        boolean digiteNovamente = true;
        while (digiteNovamente) {
            while (digiteNovamente) {
                System.out.print("Digite a idade ou zero para sair: ");
                idade = leituraScanner.nextInt();
                System.out.println("\n");
                if (idade != 0) {
                    System.out.print("Informe o sexo da criança (M ou F): ");
                    sexo = leituraScanner.next();
                    System.out.println("\n");
                    if (sexo == "M") {
                        meninos += 1;
                        totalIdadesMeninos += idade;
                    } else {
                        meninas += 1;
                        totalIdadesMeninas += idade;
                    }
                } else {
                    digiteNovamente = false;
                }
            }
        }
        if (meninos > 0) {
            idadeMediaMeninos = totalIdadesMeninos / meninos;
            System.out.println("A idade média dos meninos é " + idadeMediaMeninos  + ".");
        }
        if (meninas > 0) {
            idadeMediaMeninas = totalIdadesMeninas / meninas;
            System.out.println("A idade média das meninas é " + idadeMediaMeninas + ".");
        }
        System.out.println("Fim!");
        System.out.println("============================");
        leituraScanner.close();
    }
}