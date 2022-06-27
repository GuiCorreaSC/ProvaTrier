package entities;

public class Produto {

	private int codigo;
	private String nome;
	private int estoque;

	public Produto() {

	}

	public Produto(int codigo, String nome, int estoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.estoque = estoque;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	@Override
	public String toString() {
		return "codigo: " + codigo + " nome: " + nome + ", estoque: " + estoque + ".";
	}

}
