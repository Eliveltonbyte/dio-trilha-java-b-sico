package com.elivelton;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite o Número ");
		int numero = scanner.nextInt();

		System.out.println("Digite a Agencia");
		String agencia = scanner.next();

		System.out.println("Digite o Nome do cliente");
		String nomeCliente = scanner.next();

		System.out.println("Digite o seu saldo");
		Double saldo = scanner.nextDouble();

		System.out.println("Olá  " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia); 
		System.out.println(" conta " + numero + " e seu saldo " + saldo + " já disponivel para saque");
		
		
	}

}
