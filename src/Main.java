import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        //PRIMEIRO PASSO PARA ABERTURA DE CONTA É PEDIR O NOME DO CLIENTE:
        System.out.println("===== ABERTURA DE CONTA =====");
        System.out.println("Digite o nome do Titular da conta:");
        String nome = leitor.next();

        Cliente nomeCliente = new Cliente();
        nomeCliente.setNome(nome);

        Conta cc = new ContaCorrente(nomeCliente);
        Conta poupanca = new ContaPoupanca(nomeCliente);

        //NESTE PASSO PERGUNTAMOS AO CLIENTE SE ELE DESEJA DEPOSITAR ALGUM VALOR INICIAL
        System.out.println("Digite o valor do deposito incial:");
        double primeiroDeposito = leitor.nextDouble();

        System.out.println("QUAL TIPO DE CONTA DESEJA ABRIR?\n| 1 | CONTA CORRENTE\n| 2 | CONTA POUPANÇA\n| 3 | CANCELAR E SAIR");
        int opcaoAbertura = leitor.nextInt();

        switch (opcaoAbertura){
            case 1:
                cc.depositar(primeiroDeposito);
                System.out.println("====CONTA ABERTA====");
                cc.imprimirExtrato();
                break;
            case 2:
                poupanca.depositar(primeiroDeposito);
                System.out.println("====CONTA ABERTA====");
                poupanca.imprimirExtrato();
                break;
            case 3:
                System.out.println("====PROCESSO DE ABERTURA CANCELADO====");
                break;
            default:
                System.out.println("Digite um valor entre 1 e 3!!!");
                break;



        }


    }
}
