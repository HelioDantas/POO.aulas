package br.com.Java.aulas.aula4;

//--------------------------------------------------------------------------------------
/*Objetivo: Calculadora Simples
* Acessar compiladores online:
* [1] https://repl.it
* [2] https://www.tutorialspoint.com/compile_java_online.php 
* Exercicios:
* [1] Incluir no menu as chamadas dos metodos subtracao, divisao, menorQue, maiorQue
* [2] Mudar a mensagem de resultado para: 
*     O resultado da soma de [numero 1] com o  [numero 2] eh [resultado]
* [3] Aplicar a mensagem com as devidas adaptacoes para as operacoes 
*     Subtracao, Multiplicao, Divisao, MenorQue e MaiorQue     
* [4] Criar o metodo menu() na classe Main. O conteudo do metodo main() deve
*     ser transferido para o menu(), enquanto que o metodo main() deve chamar 
*     apenas o menu().
*/
//--------------------------------------------------------------------------------------
import java.util.Scanner;

public class exemplo3 {
	private static Scanner scanner;

	public static void main(String args[]) {
		
		Calculadora calc = null;
		boolean controle = true;
		scanner = new Scanner(System.in);
		do {
			try {
				System.out.println("Digite:");
				System.out.println("0 - Para Sair");
				System.out.println("1 - Para Somar");
				System.out.println("2 - Para Subtrair");
				System.out.println("3 - Para Multiplicar");
				System.out.println("4 - Para Dividir");
				System.out.println("5 - Para MaiorQue");
				System.out.println("6 - Para MenorQue");
				controle = false;// ainda nao deve concluir o loop
				int opcao = scanner.nextInt();
				if (opcao != 0) {
					System.out.println("Digite o primeiro valor");
					double a = scanner.nextDouble();
					System.out.println("Digite o segundo valor");
					double b = scanner.nextDouble();
					// double a=10, b=20;
					calc = new Calculadora(a, b);
				} // if
				double r;

				switch (opcao) {
				// ------------------------------------------------------
				case 1:
					calc.soma();
					r = calc.getResultado();
					System.out.println("A soma  de " + calc.getA()+" e " +calc.getB() + " eh: " + r);
					break;
				// ------------------------------------------------------
				case 2:
					calc.subtracao();
					r = calc.getResultado();
					System.out.printf("A subtração de %2.1f por %2.1f eh:%2.1f ", calc.getA(), calc.getB(), r);
					
					break;
				// ------------------------------------------------------
				case 3:
					calc.multiplicacao();
					r = calc.getResultado();
					System.out.printf("A multiplicação de %2.1f e %2.1f eh:%2.1f ", calc.getA(), calc.getB(), r);
					break;
				// ------------------------------------------------------
				case 4:
					calc.divisao();
					r = calc.getResultado();
					System.out.printf("A divisão de %2.1f por %2.1f eh:%2.1f ", calc.getA(), calc.getB(), r);
					break;
				// ------------------------------------------------------
				case 5:
					calc.maiorQue();
					r = calc.getResultado();
					System.out.printf("O maior entre de %2.1f e %2.1f eh:%2.1f ", calc.getA(), calc.getB(), r);
					break;
				// ------------------------------------------------------
				case 6:
					calc.menorQue();
					r = calc.getResultado();
					System.out.printf("O menor entre de %2.1f e %2.1f eh:%2.1f ", calc.getA(), calc.getB(), r);
					break;
				// ------------------------------------------------------
				default:
					System.out.println("Saindo do sistema ");
					controle = true;
					break;
				}// switch-case

				// ------------------------------------------------------
			} catch (java.util.InputMismatchException e) {
				System.out.println("Aviso de Excecao: sao permitidos apenas numeros!");
				System.out.println("Por favor, execute o programa novamente.");
				controle = false;
				scanner.next();// limpar o buffer
			}
		} while (!controle);
	}
}

//--------------------------------------------------------------------------------------
class Calculadora2 {
	private double a;
	private double b;
	private double resultado;

	public Calculadora2() {
		this.setA(0.0);
		this.setB(0.0);
		this.setResultado(0.0);
	}

	public Calculadora2(double _a, double _b) {
		this.setA(_a);
		this.setB(_b);
		this.setResultado(0.0);
	}

	public double getA() {
		return this.a;
	}

	public void setA(double _a) {
		this.a = _a;
	}

	public double getB() {
		return this.b;
	}

	public void setB(double _b) {
		this.b = _b;
	}

	public double getResultado() {
		return this.resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public void soma() {
		double r = this.getA() + this.getB();
		this.setResultado(r);
	}

	public void subtracao() {
		double r = this.getA() - this.getB();
		this.setResultado(r);
	}

	public void multiplicacao() {
		double r = this.getA() * this.getB();
		this.setResultado(r);
	}

	public void divisao() {
		double r = this.getA() / this.getB();
		this.setResultado(r);
	}

	public void maiorQue() {
		double r = this.getA() > this.getB() ? this.getA() : this.getB();
		this.setResultado(r);
	}

	public void menorQue() {
		double r = this.getA() < this.getB() ? this.getA() : this.getB();
		this.setResultado(r);
	}

}





//-