import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, digite o número da Conta!");
		System.out.print("Conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Por favor, digite o número da Agência!");
		System.out.print("Agência: ");
		String numeroAgencia = sc.nextLine();
		
		System.out.println("Por favor, digite o nome do Cliente!");
		System.out.print("Cliente: ");
		String nomeCliente = sc.nextLine();
		
		System.out.println("Qual o saldo que deseja depositar?");
		System.out.print("Saldo: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque");
		sc.close();
	}

}
