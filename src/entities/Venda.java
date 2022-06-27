package entities;

public class Venda extends ItemDeVenda {

	private int codigo;
	private Double totalVenda;
	private ItemDeVenda itensDeVenda;
	private StatusVenda status;

	public Venda() {
	}

	public Venda(int codigo, Double totalVenda, ItemDeVenda itensDeVenda, StatusVenda status) {
		super();
		this.codigo = codigo;
		this.totalVenda = totalVenda;
		this.itensDeVenda = itensDeVenda;
		this.status = status;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Double getTotalVenda() {
		return totalVenda;
	}

	public void setTotalVenda(Double totalVenda) {
		this.totalVenda = totalVenda;
	}

	public ItemDeVenda getItensDeVenda() {
		return itensDeVenda;
	}

	public void setItensDeVenda(ItemDeVenda itensDeVenda) {
		this.itensDeVenda = itensDeVenda;
	}

	public StatusVenda getStatus() {
		return status;
	}

	public void setStatus(StatusVenda status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Venda, codigo: " + codigo + ", totalVenda: " + totalVenda + ", status: " + status + "," + "\n"
				+ itensDeVenda;
	}

}
