import java.util.Scanner; // biblioteca de input
//  System.out.println pula a linha
//   System.out.print não pula a linha

public class Logica {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); // Cria instância Scanner chamada sc
        int numDigitado = 0; // Cria variavel inteira
        System.out.print("Digite um número inteiro: ");
        numDigitado = sc.nextInt(); // Captura numero inteiro do teclado
        int resto; // Cria variavel inteira
        resto = numDigitado % 2; // Calcula o resto da divisão por 2
        if (resto == 0) {
            System.out.println(numDigitado + " É par.");
        } // Fim do if resto
        else {
            System.out.println(numDigitado + " É impar.");
        }
        System.out.println("Fim do APP");

    } //  Fim do metodo main
}// Fim da Classe Logica
