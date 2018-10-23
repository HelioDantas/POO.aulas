package br.com.Java.aulas.sevice;

public class Calculadora {
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
