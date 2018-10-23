package br.com.Java.aulas.aula7;

public class Pessoa {

	private String nome;
	private Integer idade;
	private String morada;
	private String tlm;
	
	public Pessoa(String nome, Integer idade, String morada, String tlm) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.morada = morada;
		this.tlm = tlm;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public String getTlm() {
		return tlm;
	}
	public void setTlm(String tlm) {
		this.tlm = tlm;
	}
	
}
class Aluno extends Pessoa{
	private double media;
	
	public Aluno(String nome, Integer idade, String morada, String tlm, double media) {
		super(nome, idade, morada, tlm);
		this.setMedia(media);
		// TODO Auto-generated constructor stub
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	
	
	
	
	
}
