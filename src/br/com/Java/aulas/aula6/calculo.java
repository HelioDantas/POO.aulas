package br.com.Java.aulas.aula6;

public interface calculo {
	
	
	

	public static  Matriz somar(Matriz mat){
		int linhas=mat.matriz.length;
		int colunas=mat.matriz[0].length;
		Matriz matR = new Matriz(linhas, colunas); 
		for(int i=0; i<linhas; i++)
			for(int j=0; j<colunas; j++)
				matR.matriz[i][j]=mat.matriz[i][j]+mat.matriz[i][j];
		return matR;
	} 
	

}
