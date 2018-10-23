package br.com.Java.aulas.aula8;

import java.sql.Date;
import java.text.SimpleDateFormat;

public abstract class Conta {
	private double saldo;
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
     
    public double getSaldo() {
        return saldo;
    }
     
    public abstract void imprimeExtrato();

}
class ContaPoupanca extends Conta {
	 
    @Override
    public void imprimeExtrato() {
        System.out.println("### Extrato da Conta ###");
         
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
        Date date = new Date(0);
         
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Data: "+sdf.format(date));
         
    }
}


