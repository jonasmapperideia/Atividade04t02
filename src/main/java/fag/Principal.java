package main.java.fag;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=== ATIVIDADE JAVA BÁSICO - 10 QUESTÕES ===\n");
		
		// Executar todas as questões
		questao1_Scanner(scan);
		questao2_Print();
		questao3_For();
		questao4_If(scan);
		questao5_While(scan);
		questao6_Metodos();
		questao7_ScannerIf(scan);
		questao8_ForPrint();
		questao9_WhileScanner(scan);
		questao10_MetodosFor();
		
		scan.close();
	}
	
	// ========================================
	// QUESTÃO 1 - SCANNER (Entrada de Dados)
	// ========================================
	// TODO: Crie um programa que leia o nome e a idade de uma pessoa
	// e exiba uma mensagem de boas-vindas personalizada
	// Exemplo: "Olá João! Você tem 20 anos. Seja bem-vindo(a)!"
	public static void questao1_Scanner(Scanner scan) {
		System.out.println("=== QUESTÃO 1 - SCANNER ===");
		System.out.println("Digite seu nome:");
		String nome = scan.nextLine();
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		scan.nextLine();
		System.out.printf("Olá %s! Você tem %d anos. Seja bem-vindo(a)!\n", nome, idade);
	}	
	// ========================================
	// QUESTÃO 2 - PRINT (Saída de Dados)
	// ========================================
	// TODO: Crie um programa que exiba uma tabela de multiplicação do 5 (de 1 a 10)
	// Formate a saída de forma organizada
	// Exemplo: "5 x 1 = 5", "5 x 2 = 10", etc.
	public static void questao2_Print() {
		System.out.println("=== QUESTÃO 2 - PRINT ===");
		
		System.out.println("Tabela de multiplicação do 5:");
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("5 x %d = %d\n", i, 5 * i);
		}
		
		System.out.println();
	}
	
	// ========================================
	// QUESTÃO 3 - FOR (Laço de Repetição)
	// ========================================
	// TODO: Crie um programa que calcule e exiba a soma dos números de 1 até 100
	// Use um laço for para fazer o cálculo
	// Resultado esperado: 5050
	public static void questao3_For() {
		System.out.println("=== QUESTÃO 3 - FOR ===");
		
		int soma = 0;
		
		for (int i = 1; i <= 100; i++) {
			soma += i;
		}
		
		System.out.println("A soma dos números de 1 a 100 é: " + soma);

		System.out.println();
	}
	
	// ========================================
	// QUESTÃO 4 - IF (Estrutura Condicional)
	// ========================================
	// TODO: Crie um programa que leia uma nota e informe:
	// - Aprovado (nota >= 7): "Parabéns! Você foi APROVADO!"
	// - Recuperação (4 <= nota < 7): "Você está em RECUPERAÇÃO. Estude mais!"
	// - Reprovado (nota < 4): "Infelizmente você foi REPROVADO. Tente novamente!"
	public static void questao4_If(Scanner scan) {
		System.out.println("=== QUESTÃO 4 - IF ===");
		
		System.out.println("Digite sua nota (0 a 10):");
		double nota = scan.nextDouble();
		scan.nextLine();

		if (nota >= 7) {
			System.out.println("Parabéns! Você foi APROVADO!");
		} else if (nota >= 4 && nota < 7) {
			System.out.println("Você está em RECUPERAÇÃO. Estude mais!");
		} else {
			System.out.println("Infelizmente você foi REPROVADO. Tente novamente!");
		}

		System.out.println();
		
		
	}
	
	// ========================================
	// QUESTÃO 5 - WHILE (Laço de Repetição)
	// ========================================
	// TODO: Crie um programa que leia números inteiros até que o usuário digite 0
	// e então exiba a soma de todos os números digitados
	public static void questao5_While(Scanner scan) {
		System.out.println("=== QUESTÃO 5 - WHILE ===");
		System.out.println("Digite números inteiros (digite 0 para parar):");
		int numero;
		int somaNumeros = 0;
		
		do {
			numero = scan.nextInt();
			somaNumeros += numero;
		} while (numero != 0);
		System.out.println("A soma de todos os números digitados é: " + somaNumeros);
		System.out.println();
	}
	
	// ========================================
	// QUESTÃO 6 - MÉTODOS (Função)
	// ========================================
	// TODO: Crie um método que receba dois números e retorne o maior entre eles
	// Teste o método com diferentes valores
	// Dica: Use o método encontrarMaior() que está declarado abaixo
	public static void questao6_Metodos() {
		System.out.println("=== QUESTÃO 6 - MÉTODOS ===");
		int num1 = 15;
		int num2 = 28;
		int maior = encontrarMaior(num1, num2);
		System.out.printf("O maior entre %d e %d é: %d\n", num1, num2, maior);

		int num3 = 5;
		int num4 = 5;
		int maior2 = encontrarMaior(num3, num4);
		System.out.printf("O maior entre %d e %d é: %d\n", num3, num4, maior2);
		
		System.out.println();
	}
	
	// ========================================
	// QUESTÃO 7 - SCANNER + IF
	// ========================================
	// TODO: Crie um programa que leia um número e informe se ele é par ou ímpar
	// Use o operador % (módulo) para verificar o resto da divisão por 2
	public static void questao7_ScannerIf(Scanner scan) {
		System.out.println("=== QUESTÃO 7 - SCANNER + IF ===");
		System.out.println("Digite um número inteiro:");
		int num = scan.nextInt();
		if (num % 2 == 0) {
			System.out.println("O número " + num + " é PAR.");
		} else {
			System.out.println("O número " + num + " é ÍMPAR.");
		}

		System.out.println();
	}
	
	// ========================================
	// QUESTÃO 8 - FOR + PRINT
	// ========================================
	// TODO: Crie um programa que exiba todos os números pares de 2 até 20
	// Exiba um número por linha
	public static void questao8_ForPrint() {
		System.out.println("=== QUESTÃO 8 - FOR + PRINT ===");
		System.out.println("Números pares de 2 a 20:");
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}
		
		System.out.println();
	}
	
	// ========================================
	// QUESTÃO 9 - WHILE + SCANNER
	// ========================================
	// TODO: Crie um programa que leia números até que o usuário digite um número negativo
	// e conte quantos números positivos foram digitados
	public static void questao9_WhileScanner(Scanner scan) {
		System.out.println("=== QUESTÃO 9 - WHILE + SCANNER ===");
		System.out.println("Digite números (digite um número negativo para parar):");
		int numeroDigitado;
		int contadorPositivos = 0;
		do {
			numeroDigitado = scan.nextInt();
			if (numeroDigitado >= 0) {
				contadorPositivos++;
			}
		} while (numeroDigitado >= 0);
		System.out.println("Foram digitados " + contadorPositivos + " números positivos.");
		
		System.out.println();
	}
	
	// ========================================
	// QUESTÃO 10 - MÉTODOS + FOR
	// ========================================
	// TODO: Crie um método que receba um número e retorne o fatorial desse número
	// Teste o método com os valores 5 e 7
	// Dica: Use o método calcularFatorial() que está declarado abaixo
	// Fatorial de 5 = 5! = 5 x 4 x 3 x 2 x 1 = 120
	public static void questao10_MetodosFor() {
		System.out.println("=== QUESTÃO 10 - MÉTODOS + FOR ===");
		System.out.println("Digite o primeiro numero");
		int numero1 = 5;
		long resultado1 = calcularFatorial(numero1);
		System.out.printf("O fatorial de %d é: %d\n", numero1, resultado1);

		int numero2 = 7;
		long resultado2 = calcularFatorial(numero2);
		System.out.printf("O fatorial de %d é: %d\n", numero2, resultado2);
		System.out.println();
	}
	
	// ========================================
	// MÉTODO PARA QUESTÃO 6
	// ========================================
	// TODO: Implemente este método para retornar o maior entre dois números
	public static int encontrarMaior(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	// ========================================
	// MÉTODO PARA QUESTÃO 10
	// ========================================
	// TODO: Implemente este método para calcular o fatorial de um número
	// Use um laço for para fazer o cálculo
	public static long calcularFatorial(int n) {
		if (n < 0) {
			System.out.println("Erro: Fatorial não é definido para números negativos.");
			return 0;
		}
		long fatorial = 1;
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
}
	