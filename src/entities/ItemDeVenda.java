package entities;

public class ItemDeVenda extends Produto {

	private int codigo;
	private Produto produto;
	private int quantidade;
	private double vlr_unitario;

	public ItemDeVenda() {
	}

	public ItemDeVenda(int codigo, Produto produto, int quantidade, double vlr_unitario) {
		super();
		this.codigo = codigo;
		this.produto = produto;
		this.quantidade = quantidade;
		this.vlr_unitario = vlr_unitario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getVlr_unitario() {
		return vlr_unitario;
	}

	public void setVlr_unitario(double vlr_unitario) {
		this.vlr_unitario = vlr_unitario;
	}

	@Override
	public String toString() {
		return "ItemDeVenda, " + "quantidade: " + quantidade + ", vlr_unitario: " + vlr_unitario + "," + "\nProduto: "
				+ produto;
	}

}
