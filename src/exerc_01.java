import java.util.Scanner;

public class exerc_01 {
    public static void main(String[] args) {
        double valorConta, valorConta10, valorPessoa;
        int quantidadePessoas;
        Scanner sc = new Scanner(System.in);

        System.out.println("-----CALCULAR A CONTA DO RESTAURANTE-----");

        System.out.println("Insira o valor total de contas: ");
        valorConta = sc.nextDouble();
        System.out.println("Insira o quantidade de pessoas: ");
        quantidadePessoas = sc.nextInt();

        valorConta10 = valorConta * 0.10;

        System.out.println("O valor total da conta já com os 10% incluído da um total de: " + (valorConta10 + valorConta));
        System.out.println("O valor total da conta sem os 10% incluído da um total de: " + valorConta);

        valorPessoa = (valorConta10 + valorConta) /  quantidadePessoas;

        System.out.println("Como são um total de " + quantidadePessoas + " pessoas, vai dar: " + valorPessoa);

        if (valorPessoa > 150) {
            System.out.print("A conta pesou um pouco, galera! Foco no planejamento!");
        }
        else {
            System.out.println("Dentro do orçamento!");
        }

    }
}
