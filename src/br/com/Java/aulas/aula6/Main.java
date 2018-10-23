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

public class Main {

	public static void main(String[] args) {
		Matriz m1 = new Matriz();
		Matriz m2 = new Matriz();
		// Matriz m3 = new Matriz(); ?? Por que isso pode ser feito?
		Matriz m3;
		m3 = m1.minimo(m2);
		m3.imprimirMat();
		int i = 9;
		int x = 10;
		System.out.println("soma:" + i +x);
	}

}

class Matriz {
	double[][] matriz;

	public Matriz(int linhas, int colunas) {
		matriz = new double[linhas][colunas];
	}

	public Matriz() {
		matriz = new double[3][3];
		matriz[0][0] = 1;
		matriz[0][1] = 3;
		matriz[0][2] = 2;

		matriz[1][0] = 2;
		matriz[1][1] = 3;
		matriz[1][2] = 1;

		matriz[2][0] = 3;
		matriz[2][1] = 2;
		matriz[2][2] = 1;
	}

	public Matriz somar(Matriz mat) {
		int linhas = this.matriz.length;
		int colunas = this.matriz[0].length;
		Matriz matR = new Matriz(linhas, colunas);
		for (int i = 0; i < linhas; i++)
			for (int j = 0; j < colunas; j++)
				matR.matriz[i][j] = mat.matriz[i][j] + mat.matriz[i][j];
		return matR;
	}

	public void imprimirMat() {
		int linhas = this.matriz.length;
		int colunas = this.matriz[0].length;
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++)
				System.out.print("Mat[" + i + "," + j + "]=" + this.matriz[i][j]);
			System.out.println(" ");
		}
	}

	public Matriz minimo(Matriz mat) {
		//Double menor = null;
		Double adj;
		int j = 0;
		int i = 0;
		int linhas = this.matriz.length;
		int colunas = this.matriz[0].length;
	//	Matriz matR = new Matriz(linhas, colunas);
		for (i = 0; i < linhas ; i++)
			//menor = mat.matriz[i][j];
		for (j = 1; j < colunas; j++)
			if (mat.matriz[i][0] > mat.matriz[i][j]) {
				adj = mat.matriz[i][0];
				mat.matriz[i][0] = mat.matriz[i][j];
				mat.matriz[i][j]=adj;
			}
	
		return mat;
	}
}
