package br.com.Java.aulas.aula3;

//--------------------------------------------------------------------------------------
/*Objetivo: Calculadora Simples
* Acessar compiladores online:
* [1] https://repl.it
* [2] http://www.onlinecompiler.net/
* Exercicios:
* [1] Inserir as operacoes Subtracao, Multiplicao
* [2] Inserir as operacoes MaiorQue e MenorQue
* [3] Faca as seguintes operacoes apenas com chamadas:
*     [a] 10 + 20 * 30
*     [b] menorQue(maiorQue(10, 20),5)
*/
//--------------------------------------------------------------------------------------
import java.util.Scanner;

class Exemplo2 {
	private static Scanner scanner;

	public static void main(String args[]) {
		Calculadora calc;
		boolean controle = true;

		scanner = new Scanner(System.in);
		do {
			try {
				System.out.println("Digite o primeiro valor");
				double a = scanner.nextDouble();
				System.out.println("Digite o segundo valor");
				double b = scanner.nextDouble();
				System.out.println("Digite o segundo valor");
				int key = scanner.nextInt();
				
				// double a=10, b=20;
				switch (key) {
				case 1:

					break;

				case 2:

					break;

				case 3:

					break;
				case 4:

					break;
				case 5:

					break;
				}

				calc = new Calculadora(a, b);
				calc.soma();
				double r = calc.getResultado();
				System.out.println("O resultado da soma eh:" + r);

				// ------------------------------------------------------
				calc.divisao();
				r = calc.getResultado();
				System.out.println("O resultado da divisao eh:" + r);
				// ------------------------------------------------------
				calc.maiorQue();
				r = calc.getResultado();
				System.out.println("O resultado maiorQue eh:" + r);
				// ------------------------------------------------------
			} catch (java.util.InputMismatchException e) {
				System.out.println("Aviso de Excecao: sao permitidos apenas numeros!");
				System.out.println("Por favor, execute o programa novamente.");
				controle = false;
			}
		} while (!controle);
	}
}

//--------------------------------------------------------------------------------------

class Calculadora {

	private double a;
	private double b;
	private double resultado;

	public Calculadora() {
		this.setA(0.0);
		this.setB(0.0);
		this.setResultado(0.0);
	}

	public Calculadora(double _a, double _b) {
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

	public void multiplicao() {
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
