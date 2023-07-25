import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { // Fechando sc automaticamente
            int numero;
            String agencia, nomeCliente;
            double saldo;

            // Solicitando as informações ao usuário
            System.out.print("Por favor, digite o número da Agência: ");
            agencia = sc.nextLine();

            System.out.print("Por favor, digite o número da Conta: ");
            numero = sc.nextInt();
            sc.nextLine();

            System.out.print("Por favor, digite o nome do cliente: ");
            nomeCliente = sc.nextLine();

            System.out.print("Por favor, digite o saldo da conta: ");
            saldo = sc.nextDouble();

            
            // Exibindo a mensagem de saída formatada com o método concat()
            String mensagemSaida = "Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, " +
                    "sua agência é ").concat(agencia).concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo é ").concat(String.valueOf(saldo)).concat(" já está disponível para saque.");
            System.out.println(mensagemSaida);
        }
    }
}