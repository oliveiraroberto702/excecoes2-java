package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import modelo.entidades.ContaBancaria;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dados da conta: ");
		System.out.print("Número: ");
		int numero_sc = sc.nextInt();
		sc.nextLine();
		System.out.print("Titular: ");
		String titular_sc = sc.nextLine();
		System.out.print("Saldo Inicial: ");
		Double saldo_sc = sc.nextDouble();
		sc.nextLine();
		System.out.print("Limite de retirada: ");
		Double limite_sc = sc.nextDouble();
		sc.nextLine();
		ContaBancaria conta = new ContaBancaria(numero_sc, titular_sc, saldo_sc, limite_sc);
		
		System.out.println();
		System.out.print("Digite o valor do saque: ");
		Double valorSaque_sc = sc.nextDouble();
		sc.nextLine();
		
		if(conta.saque(valorSaque_sc)==null) {
			System.out.println("novo saldo: " + String.format("%.2f",  conta.getSaldo()));
		} else {
			System.out.println(conta.saque(valorSaque_sc));
		}
				
		sc.close();

	}

}
