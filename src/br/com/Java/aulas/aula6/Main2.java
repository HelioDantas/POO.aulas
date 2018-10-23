package br.com.Java.aulas.aula6;


//--------------------------------------------------------------------------------------
/*Objetivo: Operacoes com Matrizes
* Acessar compiladores online:
* [1] https://repl.it
* [2] https://www.tutorialspoint.com/compile_java_online.php 
* Exercicios:
* [1] Implementar o metodo subtrair matrizes
* [2] Implementar o metodo encontrar o maior elemento de uma matriz
*/
//--------------------------------------------------------------------------------------


public class Main2 {

	public static void main(String[] args) {
		Matrizzz m1 = new Matrizzz();
		Matrizzz m2 = new Matrizzz();
		//Matriz m3 = new Matriz(); ?? Por que isso pode ser feito?
		Matrizzz m3;
		
		m3 = m1.somar(m2);
      m3.imprimirMat();
	}

}


	