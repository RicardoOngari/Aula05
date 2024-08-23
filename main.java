package principal;

import java.util.ArrayList;
import java.util.Scanner;

import entidade.Conta;
import entidade.ContaCorrente;
import entidade.ContaPoupanca;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<>();

        while (true) {
            System.out.println("1 - Cadastrar Conta");
            System.out.println("2 - Mostrar Contas");
            System.out.println("3 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número da conta: ");
                    int numero = scanner.nextInt();

                    System.out.print("Digite o nome do titular: ");
                    String nome = scanner.next();

                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Conta Poupança");

                    System.out.print("Escolha o tipo de conta: ");
                    int tipoConta = scanner.nextInt();

                    if (tipoConta == 1) {
                        System.out.print("Digite o limite da conta corrente: ");
                        double limite = scanner.nextDouble();
                        ContaCorrente contaCorrente = new ContaCorrente(numero, nome, 0.0, limite);
                        contas.add(contaCorrente);
                    } else if (tipoConta == 2) {
                        ContaPoupanca contaPoupanca = new ContaPoupanca(numero, nome);
                        contas.add(contaPoupanca);
                    }
                    break;
                case 2:
                    for (Conta conta : contas) {
                        System.out.println(conta.toString());
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
