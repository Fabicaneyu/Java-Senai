class TestaIdade {
    public static void main(String[] args) {
// imprime a idade.
        int idade = 127;
        double salario = 1500;
        char letra = 'a'; // char é o numero do caractere dentro da tabela ASC, neste caso a é 97
        System.out.println(idade + salario + letra); // string concatena e soma somou
// gera uma idade no ano seguinte.
        int idadeNoAnoQueVem;
        idadeNoAnoQueVem = (byte) (idade + 2);
// imprime a idade.
        System.out.println(idadeNoAnoQueVem);
    }
}