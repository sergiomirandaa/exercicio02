package application;

import entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Name: ");
        funcionario.name = sc.nextLine();
        System.out.print("Salario Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Taxa: ");
        funcionario.taxa = sc.nextDouble();

        System.out.println("Funcionario " + funcionario);
        System.out.println();
        System.out.print("Qual porcentagem para aumentar o salário? ");
        double porcentagem = sc.nextDouble();
        System.out.println();
        funcionario.addFuncionario(porcentagem);

        System.out.println("Salario atualizado " + funcionario);


        sc.close();

    }
}
