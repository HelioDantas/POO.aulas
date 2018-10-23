package br.com.Java.aulas.sevice;

import java.util.Scanner;




public class Menu {
	private static boolean controle = true;
	
	public static void menu() {
		Calculadora calc = null;
		double a=0, b=0;
		Scanner scanner = new Scanner(System.in);
			
		do {
			try {				
				controle = false;// ainda nao deve concluir o loop
				int opcao = menuOpcoes();
				if (opcao != 0) {									
					System.out.println("Digite o primeiro valor");
					a = scanner.nextDouble();
					System.out.println("Digite o segundo valor");
					b = scanner.nextDouble();
					// double a=10, b=20;
					calc = new Calculadora(a, b);
					//scanner.close();
					executarOperacao(calc, opcao);
					int i = 9;
					int x = 10;
					System.out.println("soma:" + i +x);
				} // if
				
			} catch (java.util.InputMismatchException e) {
				System.out.println("Aviso de Excecao: Opcao Invalida! Sao permitidos apenas numeros!");
				System.out.println("Por favor, escolha uma opcao valida.");
				controle = false;
				//scanner.next();// limpar o buffer				
			}
		} while (!controle);
		//scanner.close();
	}//menu()
	//--------------------------------------------------------------------------------------
	public static int menuOpcoes() {
		//boolean controle = true;
		int opcao=0;
		Scanner scanner = new Scanner(System.in);		
		do{
			try {
				System.out.println("Digite:");
				System.out.println("0 - Para Sair");
				System.out.println("1 - Para Somar");
				System.out.println("2 - Para Subtrair");
				System.out.println("3 - Para Multiplicar");
				System.out.println("4 - Para Dividir");
				System.out.println("5 - Obter MenorQue");
				System.out.println("6 - Obter MaiorQue");
				controle = true; //deve concluir o loop
				opcao = scanner.nextInt();
				// ------------------------------------------------------
			} catch (java.util.InputMismatchException e) {
				System.out.println("Aviso de Excecao: Opcao Invalida! Sao permitidos apenas numeros!");
				System.out.println("Por favor, escolha uma opcao valida.");
				controle = false;//ainda NAO deve concluir o loop
				scanner.next();// limpar o buffer				
			}
		} while (!controle);
		//scanner.close();
		return opcao;
	}//menu()	
	//--------------------------------------------------------------------------------------
	public static void executarOperacao(Calculadora calc, int opcao) {		
		double a = calc.getA(), b = calc.getB(), r = 0;
		switch (opcao) {
		// ------------------------------------------------------
		case 1:
			calc.soma();
			r = calc.getResultado();
			System.out.println("O resultado da soma de [" + a + "] com [" + b + "] eh: " + r);
			break;
		// ------------------------------------------------------
		case 2:
			calc.subtracao();
			r = calc.getResultado();
			break;
		// ------------------------------------------------------
		case 3:
			calc.multiplicacao();
			r = calc.getResultado();
			System.out.println("O resultado da multiplicacao de [" + a + "] com [" + b + "] eh: " + r);
			break;
		// ------------------------------------------------------
		case 4:
			calc.divisao();
			r = calc.getResultado();
			System.out.println("O resultado da divisao de [" + a + "] com [" + b + "] eh: " + r);
			break;
		// ------------------------------------------------------
		case 5:
			calc.menorQue();
			r = calc.getResultado();
			System.out.println("O resultado do menorQue de [" + a + "] com [" + b + "] eh: " + r);
			break;
		// ------------------------------------------------------
		case 6:
			calc.maiorQue();
			r = calc.getResultado();
			System.out.println("O resultado do maiorQue de [" + a + "] com [" + b + "] eh: " + r);
			break;
		// ------------------------------------------------------
		default:
			System.out.println("Saindo do sistema ");
		
			break;
		}// switch-case        
	}// executarOperacao()
    //--------------------------------------------------------------------------------------

	//--------------------------------------------------------------------------------------
}