public class CalculaSalario {
    public static void main(String[] args) {
        double salario = 15000;
        double inss = salario * 0.1; //100
        double fgts = salario * 0.08; //80

        System.out.println("Desconto INSS: R$"+ inss + " reais");
        System.out.println("Depósito FGTS: R$"+fgts+" reais");
        System.out.println("Salário Depósito ao Funcionário: R$"+(salario-inss)+" reais");
        System.out.println("Salário Custo Empresa: R$"+(salario+fgts)+" reais");
    }
}
