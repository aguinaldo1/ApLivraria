package br.com;

public class Livro {
	

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	private boolean impresso;

	//esse é um construtor na classe livro que recebe um autor como parâmetro
	public Livro(Autor autor) {
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
		this.impresso = true;
	}
	
	public Livro() {
		
	}
	
	void mostrarDetalhes() {
		System.out.println("------------ Detalhes do livro ---------- ");
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);

		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}
		
		System.out.println("--");
	}
	
	private boolean temAutor() {
		return false;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;		
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn; 
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	void adicionaValor(double valor) {
		this.valor = valor;
	}

	 public boolean aplicaDescontoDe(double porcentagem){
		 if(porcentagem > 0.3) {
			 return false;
		 }
		double desconto = this.getValor()*porcentagem;
		this.setValor(this.getValor()-desconto);
		return true;
	} 
}
