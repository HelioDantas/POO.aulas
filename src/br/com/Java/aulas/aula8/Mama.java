package br.com.Java.aulas.aula8;

public class Mama implements Animal{
	
	
	public void eat() {
	      System.out.println("Mammal eats");
	   }

	   public void travel() {
	      System.out.println("Mammal travels");
	   } 

	   public int noOfLegs() {
		      return 0;
		   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mama m = new Mama();
	      m.eat();
	      m.travel();

	}

}
