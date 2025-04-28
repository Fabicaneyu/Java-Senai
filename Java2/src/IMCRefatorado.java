import java.util.Scanner;

public class IMCRefatorado {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); // Cria instância Scanner chamada sc
        double peso = 0.0;
        System.out.print("Digite o peso em kg: ");
        peso = sc.nextDouble();
        double altura = 0.0;
        System.out.print("Digite a altura trocando o ponto por vírgula: ");
        altura = sc.nextDouble();

        // lógica IMC
        double imc = peso / (altura * altura);
        String imcFormatado = String.format("%.2f", imc);

        // IMC	Classificação
        if (imc < 18.5) {
            System.out.println("Seu resultado é: "+imcFormatado+" de acordo com a classificação indica Magreza");
        } else if (imc <= 24.9) {
            System.out.println("Seu resultado é: "+imcFormatado+" de acordo com a classificação indica Normal");
        } else if (imc <= 29.9) {
            System.out.println("Seu resultado é: "+imcFormatado+" de acordo com a classificação indica Sobrepeso");
        }  else if (imc <= 34.9) {
            System.out.println("Seu resultado é: " + imcFormatado+ " de acordo com a classificação indica Obesidade grau I");
        } else if (imc <= 39.9) {
            System.out.println("Seu resultado é: "+imcFormatado+" de acordo com a classificação indica Obesidade grau II");
        } else {
            System.out.println("Seu resultado é: "+imcFormatado+" de acordo com a classificação indica Obesidade grau III");
        }// Fim do if/else da classificação
    } //  Fim do metodo main
} // Fim da Classe IMC


