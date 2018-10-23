package br.com.Java.aulas.aula6;

public class Matrizzz  {
	double [][] matriz;	
	public Matrizzz(int linhas, int colunas)
	{
		matriz = new double [linhas][colunas];
	}
	
	public Matrizzz(){
		matriz = new double [3][3];
		matriz[0][0] = 1;	
		matriz[0][1] = 0;
		matriz[0][2] = 0;
		
		matriz[1][0] = 0;	
		matriz[1][1] = 1;
		matriz[1][2] = 0;
		
		matriz[2][0] = 0;	
		matriz[2][1] = 0;
		matriz[2][2] = 1;
	}
	
	
	public Matrizzz somar(Matrizzz m2){
		int linhas=this.matriz.length;
		int colunas=this.matriz[0].length;
		Matrizzz matR = new Matrizzz(linhas, colunas); 
		for(int i=0; i<linhas; i++)
			for(int j=0; j<colunas; j++)
				matR.matriz[i][j]=m2.matriz[i][j]+this.matriz[i][j];
		return matR;
	} 
	
	public void imprimirMat(){
		int linhas=this.matriz.length;
		int colunas=this.matriz[0].length;
		for(int i=0; i<linhas; i++)
			for(int j=0; j<colunas; j++)
		       System.out.println("Mat["+i+","+j+"]="+this.matriz[i][j]);
	}
	
}



