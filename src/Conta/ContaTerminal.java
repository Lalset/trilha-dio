package Conta;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número da conta: ");
		int num = sc.nextInt();
		
		System.out.println("Digite o número da agência:");
		String ag = sc.next();
		
		System.out.println("Digite seu nome: ");
		String name = sc.next();
		sc.nextLine();
		
		System.out.println("Digite o seu saldo: ");
		double balance = sc.nextDouble();
		sc.nextLine();
		
		System.out.println(num);
		System.out.println(ag);
		System.out.println(name);
		System.out.println(balance);
		
		sc.close();
		

	}

}
