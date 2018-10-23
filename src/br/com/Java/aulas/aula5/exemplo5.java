package br.com.Java.aulas.aula5;

//--------------------------------------------------------------------------------------
/*Objetivo: Calculadora Simples
* Acessar compiladores online:
* [1] https://repl.it
* [2] https://www.tutorialspoint.com/compile_java_online.php 
* Exercicios:
* [1] Implementar a classe TratarMenu para tratar todas as acoes
*     referentes ao Menu
*/
//--------------------------------------------------------------------------------------
import java.util.Scanner;
public class exemplo5 {
  private static Scanner scanner;
public static void main(String args[]){
	  menu();
  }
//--------------------------------------------------------------------------------------
	public static void menu() {
		Calculadora calc = null;
		double a=0, b=0;
		scanner = new Scanner(System.in);
		boolean controle = true;		
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
				} // if
				executarOperacao(calc, opcao);
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
		boolean controle = true;
		int opcao=0;
		Scanner scanner = new Scanner(System.in);		
		do {
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
			System.out.println("O resultado da soma de [" + a + "] com [" + b + "] eh:" + r);
			break;
		// ------------------------------------------------------
		case 2:
			calc.subtracao();
			r = calc.getResultado();
			System.out.println("O resultado da subtracao de [" + a + "] com [" + b + "] eh:" + r);
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

//--------------------------------------------------------------------------------------
class Calculadora {
  private double a;
  private double b;
  private double resultado; 
  
  public Calculadora(){
	  this.setA(0.0);
	  this.setB(0.0);
	  this.setResultado(0.0);
  }
  
  public Calculadora(double _a, double _b){
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
  
  public void soma(){
	  double r = this.getA()+this.getB();
	  this.setResultado(r);
  }

  public void subtracao(){
	  double r = this.getA()-this.getB();
	  this.setResultado(r);
  }

  public void multiplicacao(){
	  double r = this.getA()*this.getB();
	  this.setResultado(r);
  }

  public void divisao(){
	  double r = this.getA()/this.getB();
	  this.setResultado(r);
  }
  
  public void maiorQue(){
	  double r = this.getA()>this.getB()?this.getA():this.getB();
	  this.setResultado(r);
  }

  public void menorQue(){
	  double r = this.getA()<this.getB()?this.getA():this.getB();
	  this.setResultado(r);
  }

}
//----------------------------------------------