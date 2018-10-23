package br.com.Java.aulas.aula2;

import java.util.Scanner;

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

class Main {
	private static Scanner input;

	public static void main(String args[]) {
		Calculadora calc;
		input = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		double a = input.nextDouble();
		System.out.println("Digite o segundo valor");
		double b = input.nextDouble();

		calc = new Calculadora(a, b);
		calc.soma();
		calc.setA(calc.getResultado());
		System.out.println("Digite o terceiro valor");
		b = input.nextDouble();
		calc.setB(b);
		calc.multiplicacao();
		double r = calc.getResultado();

		System.out.println("O resultado da soma eh: " + r);
		calc.subtracao();

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

	public void multiplicacao() {
		double r = this.getA() * this.getB();
		this.setResultado(r);
	}

	public void subtracao() {
		double r = this.getA() - this.getB();
		this.setResultado(r);
	}

	public void soma() {
		double r = this.getA() + this.getB();
		this.setResultado(r);
	}

	public void MaiorQue() {
		if (this.getA() > this.getB())
			this.setResultado(this.getA());
		this.setResultado(this.getB());
	}

	public void MenorrQue() {
		if (this.getA() < this.getB())
			this.setResultado(this.getA());
		this.setResultado(this.getB());
	}
	
}
//----------------------------------------------------------------------------------